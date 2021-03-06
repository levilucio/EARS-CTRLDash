package org.iets3.graphicalLustre.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionDescriptorBase;
import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.intentions.IntentionType;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import java.util.Collections;
import jetbrains.mps.intentions.IntentionExecutableBase;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public final class ExportToPdf_Intention extends IntentionDescriptorBase implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public ExportToPdf_Intention() {
    super(MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x1e79d4940d4268d4L, "org.iets3.graphicalLustre.structure.ModelHolder"), IntentionType.NORMAL, false, new SNodePointer("r:dd170bea-bb48-472d-839e-c838bddb8943(org.iets3.graphicalLustre.intentions)", "9063516348320066613"));
  }
  @Override
  public String getPresentation() {
    return "ExportToPdf";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return true;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new ExportToPdf_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends IntentionExecutableBase {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Export to pdf";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {

      try {

        String inputFileName = "writer.dot";
        File inputFile = new File(inputFileName);

        if (inputFile.exists()) {
          inputFile.delete();
        }
        FileWriter fileWriter = new FileWriter(inputFile.getAbsoluteFile());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("digraph summary{\n");
        // the content of the graph 

        for (SNode actor : ListSequence.fromList(SLinkOperations.getChildren(node, MetaAdapterFactory.getContainmentLink(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x1e79d4940d4268d4L, 0x1e79d4940d4268d7L, "listOfActors")))) {

          String actorLabel = ": type ";
          String color = " ";

          if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5e94280dffc5689cL, "org.iets3.graphicalLustre.structure.GlobalInputActor"))) {
            actorLabel += " GlobalInput";
            color += ", color = lightcyan4, style=filled";

          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5e94280dffc5689dL, "org.iets3.graphicalLustre.structure.GlobalOutputActor"))) {
            actorLabel += " GlobalOutput";
            color += ", color = lightblue1, style=filled";

          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x7459d2b66d70de33L, "org.iets3.graphicalLustre.structure.EventActor"))) {
            actorLabel += " Event";
          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef496610L, "org.iets3.graphicalLustre.structure.IfTBActor"))) {
            actorLabel += " IfTB";
          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x17ee0fce5b59ab5dL, "org.iets3.graphicalLustre.structure.IffActor"))) {
            actorLabel += " Iff";
          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x17ee0fce5b59ab5cL, "org.iets3.graphicalLustre.structure.OrActor"))) {
            actorLabel += " Or";
          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef45c45dL, "org.iets3.graphicalLustre.structure.ResActor"))) {
            actorLabel += " Res";
          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0717L, "org.iets3.graphicalLustre.structure.TernaryNotActor"))) {
            actorLabel += " TernaryNot";
          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x87370915ecfcc30L, "org.iets3.graphicalLustre.structure.AndActor"))) {
            actorLabel += " And";
          } else if (SNodeOperations.isInstanceOf(actor, MetaAdapterFactory.getConcept(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0766L, "org.iets3.graphicalLustre.structure.TrUBActor"))) {
            actorLabel += " TrUB";
          }

          bufferedWriter.write(SPropertyOperations.getString(actor, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "[label= \"" + SPropertyOperations.getString(actor, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + actorLabel + " \"" + color + ", shape= box]\n");
        }


        for (SNode wire : ListSequence.fromList(SLinkOperations.getChildren(node, MetaAdapterFactory.getContainmentLink(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x1e79d4940d4268d4L, 0x1e79d4940d538b7bL, "listofWires")))) {

          System.out.println(SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")) + "... " + SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")));

          if (SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")).contains("GI") || SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")).contains("GO")) {
            SPropertyOperations.set(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort"), SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")).substring(2));
          }
          if (SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")).contains("GI") || SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")).contains("GO")) {
            SPropertyOperations.set(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort"), SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")).substring(2));

          }
          if (SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")).contains("LogicalNot")) {
            SPropertyOperations.set(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort"), SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")).substring(11));

          }
          if (SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")).contains("LogicalNot")) {
            SPropertyOperations.set(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort"), SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")).substring(11));

          }
          if (SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")).contains(".")) {

            SPropertyOperations.set(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort"), SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")).substring(0, SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")).indexOf(".")));
          }

          if (SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")).contains(".")) {

            SPropertyOperations.set(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort"), SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")).substring(0, SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")).indexOf(".")));
          }



          bufferedWriter.write(SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872bL, "sourcePort")) + " ->" + SPropertyOperations.getString(wire, MetaAdapterFactory.getProperty(0x33eb1b5bad964262L, 0x9112684c487e01e0L, 0x5ab29dafef4a0767L, 0x13859febca01872eL, "destinationPort")) + "\n");

        }



        bufferedWriter.write("\n}");
        bufferedWriter.close();

        Process process;

        process = Runtime.getRuntime().exec(" dot -Tpdf " + inputFileName + " -o output.pdf");

      } catch (Exception ex) {
        System.out.println("exception occured here!! " + ex);
      }

    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return ExportToPdf_Intention.this;
    }
  }
}
