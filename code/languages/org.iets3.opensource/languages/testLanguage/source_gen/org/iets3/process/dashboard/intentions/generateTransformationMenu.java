package org.iets3.process.dashboard.intentions;

/*Generated by MPS */

import jetbrains.mps.editor.intentions.IntentionsFactory;
import jetbrains.mps.editor.intentions.NodeTransformer;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.MPSModuleRepository;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction__BehaviorDescriptor;
import java.util.Collection;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import java.util.ArrayList;
import jetbrains.mps.editor.intentions.BaseNodeTransformer;

public class generateTransformationMenu extends IntentionsFactory {
  public generateTransformationMenu() {
  }

  public String getId() {
    return getClass().getName();
  }

  public boolean isAvailableInChildren() {
    return true;
  }

  public boolean isSurroundWith() {
    return false;
  }

  public NodeTransformer.Kind getKind() {
    return NodeTransformer.Kind.INTENTION;
  }


  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, "org.iets3.process.dashboard.structure.FlowData");
  }

  public SNodePointer getDeclarationNode() {
    return implementationNode;
  }

  private SNodePointer implementationNode = new SNodePointer("r:40086def-66d5-42f5-b712-896a496ab587(org.iets3.process.dashboard.intentions)", "4278269416859554131");


  private boolean isApplicableHelper(SNode node, EditorContext editorContext) {
    return true;
  }


  public boolean isAvailableInChild(SNode node, SNode node1, EditorContext context) {
    return true;
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return isApplicableHelper(node, editorContext);
  }


  public void execute(SNode node, EditorContext editorContext) {

    for (SModule item : Sequence.fromIterable(MPSModuleRepository.getInstance().getModules())) {
      for (SModel atom : Sequence.fromIterable(item.getModels())) {
        if (atom.getModelName().equals("org.iets3.flow.dashboard.editor")) {

          Iterable<SNode> rootNodes = atom.getRootNodes();
          for (SNode childNode : Sequence.fromIterable(rootNodes)) {
            System.out.println("child root name is " + childNode.getName());
          }
          SNode defaultTrans = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x16be955f384efce1L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Default"));
          SConcept concept = SNodeOperations.getConcept(node);
          SNode abstractConceptDec = SNodeOperations.asNode(SNodeOperations.getConcept(node));
          SLinkOperations.setTarget(defaultTrans, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x169efbc9a9048c53L, 0x5b7b4c4d511049b4L, "conceptDeclaration"), abstractConceptDec);

          SNode section = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, "jetbrains.mps.lang.editor.structure.TransformationMenuSection"));

          SNode contextAssistant = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7c45559defd26bcbL, "jetbrains.mps.lang.editor.structure.TransformationLocation_ContextAssistant"));

          SNode partAction = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x16be955f384f93e6L, "jetbrains.mps.lang.editor.structure.TransformationMenuPart_Action"));

          SNode textFunction = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4eff4d8b1f5ceed1L, "jetbrains.mps.lang.editor.structure.QueryFunction_TransformationMenu_ActionLabelText"));
          SNode executeFunction = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x16be955f384f95eeL, "jetbrains.mps.lang.editor.structure.QueryFunction_TransformationMenu_Execute"));

          SNode expr1 = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
          SNode print_expr = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
          SNode break_expr = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));


          SNode executionpartstmtlist = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
          SNode textpartstmtlist = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));


          SNode rtn = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, "jetbrains.mps.baseLanguage.structure.ReturnStatement"));
          SNode ifstmt = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement"));

          SNode strlit = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, "jetbrains.mps.baseLanguage.structure.StringLiteral"));
          SPropertyOperations.set(strlit, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "This is a Demo Text");

          SNode prntstmt = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x760a0a8ceabb4521L, 0x8bfd65db761a9ba3L, 0x1100a2cc320L, "jetbrains.mps.baseLanguage.logging.structure.PrintStatement"));

          SNode lvdstmt = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"));

          SNode break_stmtlst = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
          SNode brkstmt = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbe39a867fL, "jetbrains.mps.baseLanguage.structure.BreakStatement"));
          SNode swtchstmt = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, "jetbrains.mps.baseLanguage.structure.SwitchStatement"));
          SNode swtchCase = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02cdd1bL, "jetbrains.mps.baseLanguage.structure.SwitchCase"));
          SNode swtch_expr = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));

          SNode swctchExpr = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, "jetbrains.mps.baseLanguage.structure.StringLiteral"));

          ListSequence.fromList(SLinkOperations.getChildren(break_stmtlst, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(brkstmt);
          SLinkOperations.setTarget(swtchCase, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02cdd1bL, 0x10ef02d8048L, "body"), break_stmtlst);
          ListSequence.fromList(SLinkOperations.getChildren(swtchstmt, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02edcafL, "case"))).addElement(swtchCase);

          SNode lvd = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7efL, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"));
          SNode gne = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, "jetbrains.mps.baseLanguage.structure.GenericNewExpression"));
          SNode snc = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x112e36f7135L, "jetbrains.mps.lang.smodel.structure.SNodeCreator"));
          SNode snt = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, "jetbrains.mps.lang.smodel.structure.SNodeType"));
          SNode snt_ = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, "jetbrains.mps.lang.smodel.structure.SNodeType"));

          SLinkOperations.setTarget(snc, MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x112e36f7135L, 0x112e36f7138L, "createdType"), snt_);
          SLinkOperations.setTarget(gne, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ab8473cc5L, 0x10ab847b486L, "creator"), snc);
          SLinkOperations.setTarget(lvd, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, 0xf8c37f506eL, "initializer"), gne);
          SLinkOperations.setTarget(lvd, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), snt);
          SLinkOperations.setTarget(lvdstmt, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f0L, 0xf8cc67c7f1L, "localVariableDeclaration"), lvd);

          expr1 = strlit;

          SLinkOperations.setTarget(rtn, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, 0xf8cc6bf96cL, "expression"), expr1);
          ListSequence.fromList(SLinkOperations.getChildren(textpartstmtlist, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(rtn);


          ListSequence.fromList(SLinkOperations.getChildren(executionpartstmtlist, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(prntstmt);
          ListSequence.fromList(SLinkOperations.getChildren(executionpartstmtlist, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(lvdstmt);
          ListSequence.fromList(SLinkOperations.getChildren(executionpartstmtlist, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(swtchstmt);


          SNode TransformMenupart_Group = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x671b36136d224047L, "jetbrains.mps.lang.editor.structure.TransformationMenuPart_Group"));

          SNode TransfMenuVarDecl_BoolType = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x11266742db0L, "jetbrains.mps.lang.editor.structure.TransformationMenuVariableDeclaration"));

          SNode transfMenu_BoolVariable_Stmtlist = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
          SNode transfMenu_IntVariable_Stmtlist = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));

          SNode TransfMenuVarDecl_IntType = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x11266742db0L, "jetbrains.mps.lang.editor.structure.TransformationMenuVariableDeclaration"));


          SNode QM_TransfMenuVar_Init_Bool = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x780e6728403df05L, "jetbrains.mps.lang.editor.structure.QueryFunction_TransformationMenuVariable_Initializer"));

          SNode QM_TransfMenuVar_Init_Int = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x780e6728403df05L, "jetbrains.mps.lang.editor.structure.QueryFunction_TransformationMenuVariable_Initializer"));

          SNode bool_type = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d6513eL, "jetbrains.mps.baseLanguage.structure.BooleanType"));

          SNode int_type = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d22479L, "jetbrains.mps.baseLanguage.structure.IntegerType"));

          SNode intliteral = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x11c4caca3eeL, "jetbrains.mps.lang.editor.structure.QueryFunction_Integer"));
          SNode intConstant = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant"));

          SNode bool_expr = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
          SNode return_bool = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, "jetbrains.mps.baseLanguage.structure.ReturnStatement"));
          SLinkOperations.setTarget(return_bool, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, 0xf8cc6bf96cL, "expression"), bool_expr);

          SNode int_expr = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"));
          SNode return_int = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, "jetbrains.mps.baseLanguage.structure.ReturnStatement"));
          SLinkOperations.setTarget(return_int, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7feL, 0xf8cc6bf96cL, "expression"), int_expr);
          System.out.println("hjafjkhdkjhfdjkhdfkhdfkd----" + ConceptFunction__BehaviorDescriptor.getHeaderForAliasedEditor_id2v69eKc6I0x.invoke(QM_TransfMenuVar_Init_Int));


          SLinkOperations.setTarget(TransfMenuVarDecl_BoolType, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), bool_type);
          SLinkOperations.setTarget(TransfMenuVarDecl_BoolType, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x11266742db0L, 0x780e6728403fc37L, "initializerBlock"), QM_TransfMenuVar_Init_Bool);
          ListSequence.fromList(SLinkOperations.getChildren(transfMenu_BoolVariable_Stmtlist, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(return_bool);
          SLinkOperations.setTarget(QM_TransfMenuVar_Init_Bool, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L, 0x108bbd29b4aL, "body"), transfMenu_BoolVariable_Stmtlist);

          String variableName = "lastSuccessfulState";
          SPropertyOperations.set(TransfMenuVarDecl_IntType, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), variableName);
          SLinkOperations.setTarget(TransfMenuVarDecl_IntType, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), int_type);
          SLinkOperations.setTarget(TransfMenuVarDecl_IntType, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x11266742db0L, 0x780e6728403fc37L, "initializerBlock"), QM_TransfMenuVar_Init_Int);
          ListSequence.fromList(SLinkOperations.getChildren(transfMenu_IntVariable_Stmtlist, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"))).addElement(return_int);
          SLinkOperations.setTarget(QM_TransfMenuVar_Init_Int, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L, 0x108bbd29b4aL, "body"), transfMenu_IntVariable_Stmtlist);

          atom.addRootNode(as_kxbz1q_a0a0ke0a0a0b0ab(defaultTrans, SNode.class));
          ListSequence.fromList(SLinkOperations.getChildren(defaultTrans, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0c11832L, 0x16be955f384efffcL, "sections"))).addElement(section);
          ListSequence.fromList(SLinkOperations.getChildren(section, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbfL, "parts"))).addElement(TransformMenupart_Group);
          ListSequence.fromList(SLinkOperations.getChildren(TransformMenupart_Group, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x671b36136d224047L, 0x671b36136d224048L, "parts"))).addElement(partAction);
          ListSequence.fromList(SLinkOperations.getChildren(TransformMenupart_Group, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x671b36136d224047L, 0x6a3d2fa8211d204dL, "variables"))).addElement(TransfMenuVarDecl_BoolType);
          ListSequence.fromList(SLinkOperations.getChildren(TransformMenupart_Group, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x671b36136d224047L, 0x6a3d2fa8211d204dL, "variables"))).addElement(TransfMenuVarDecl_IntType);


          ListSequence.fromList(SLinkOperations.getChildren(section, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbdL, "locations"))).addElement(contextAssistant);
          SLinkOperations.setTarget(textFunction, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L, 0x108bbd29b4aL, "body"), textpartstmtlist);
          SLinkOperations.setTarget(partAction, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x16be955f384f93e6L, 0x4eff4d8b1f5ceecdL, "textFunction"), textFunction);
          SLinkOperations.setTarget(partAction, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x16be955f384f93e6L, 0x16be955f384f93e9L, "executeFunction"), executeFunction);
          SLinkOperations.setTarget(executeFunction, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L, 0x108bbd29b4aL, "body"), executionpartstmtlist);

          String s = SPropertyOperations.getString(TransfMenuVarDecl_IntType, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));

          SPropertyOperations.set(swctchExpr, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), s);

          SLinkOperations.setTarget(swtchstmt, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10ef02a8c6aL, 0x10ef02ec241L, "expression"), swctchExpr);




        }
      }
    }

  }
  public String description(SNode node, EditorContext editorContext) {
    return "generateTransformationMenu";
  }

  public Collection<NodeTransformer> getTreeTransformers(SNode node, SNode child, EditorContext editorContext) {
    Collection<NodeTransformer> result = CollectionSequence.fromCollection(new ArrayList<NodeTransformer>());
    CollectionSequence.fromCollection(result).addElement(new BaseNodeTransformer(this, node, editorContext, generateTransformationMenu.this.getKind(), implementationNode) {
      protected void execute(SNode node, EditorContext editorContext) {
        generateTransformationMenu.this.execute(node, editorContext);
      }
      protected String getDescription(SNode node, EditorContext editorContext) {
        return generateTransformationMenu.this.description(node, editorContext);
      }
    });
    return result;
  }
  private static <T> T as_kxbz1q_a0a0ke0a0a0b0ab(Object o, Class<T> type) {
    return (type.isInstance(o) ? (T) o : null);
  }
}
