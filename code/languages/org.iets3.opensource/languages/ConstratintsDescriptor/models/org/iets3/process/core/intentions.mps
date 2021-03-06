<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:b701b71e-94ab-49ee-a9fa-8423d6578c72(org.iets3.process.core.intentions)">
  <persistence version="9" />
  <languages>
    <use id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions" version="-1" />
    <devkit ref="2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)" />
  </languages>
  <imports>
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="21uu" ref="r:f84524c5-95e2-4666-9bf0-d180d6a6edc5(org.iets3.process.core.behavior)" />
    <import index="f6re" ref="r:b55a2780-4acd-46ea-b2fe-b6161b3f3a86(org.iets3.process.core.structure)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="tp25" ref="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" />
    <import index="tpeu" ref="r:00000000-0000-4000-0000-011c895902fa(jetbrains.mps.lang.smodel.behavior)" />
    <import index="xwgo" ref="r:b3404408-df39-4a35-9698-ae7cc49751d9(org.iets3.process.dashboard.structure)" />
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="dush" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence(MPS.OpenAPI/)" />
    <import index="tp25" ref="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" />
    <import index="7aef" ref="r:9910e94e-fa84-4276-aaf0-b86490fb1c3b(org.iets3.utility.behavior)" />
    <import index="47lw" ref="r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.process.modelproperty.formulae.structure)" />
    <import index="guwi" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.io(JDK/)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1081855346303" name="jetbrains.mps.baseLanguage.structure.BreakStatement" flags="nn" index="3zACq4" />
      <concept id="6329021646629104957" name="jetbrains.mps.baseLanguage.structure.TextCommentPart" flags="nn" index="3SKdUq">
        <property id="6329021646629104958" name="text" index="3SKdUp" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="6329021646629175155" name="commentPart" index="3SKWNk" />
      </concept>
    </language>
    <language id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions">
      <concept id="1192794744107" name="jetbrains.mps.lang.intentions.structure.IntentionDeclaration" flags="ig" index="2S6QgY" />
      <concept id="1192794782375" name="jetbrains.mps.lang.intentions.structure.DescriptionBlock" flags="in" index="2S6ZIM" />
      <concept id="1192795911897" name="jetbrains.mps.lang.intentions.structure.ExecuteBlock" flags="in" index="2Sbjvc" />
      <concept id="1192796902958" name="jetbrains.mps.lang.intentions.structure.ConceptFunctionParameter_node" flags="nn" index="2Sf5sV" />
      <concept id="2522969319638091381" name="jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration" flags="ig" index="2ZfUlf">
        <property id="2522969319638091386" name="isAvailableInChildNodes" index="2ZfUl0" />
        <reference id="2522969319638198290" name="forConcept" index="2ZfgGC" />
        <child id="2522969319638198291" name="executeFunction" index="2ZfgGD" />
        <child id="2522969319638093993" name="descriptionFunction" index="2ZfVej" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="4497478346159780083" name="jetbrains.mps.lang.smodel.structure.LanguageRefExpression" flags="ng" index="pHN19">
        <child id="3542851458883491298" name="languageId" index="2V$M_3" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <reference id="6733348108486823428" name="concept" index="1m5ApE" />
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
      </concept>
      <concept id="559557797393017698" name="jetbrains.mps.lang.smodel.structure.ModelReferenceExpression" flags="nn" index="BaHAS">
        <property id="559557797393021807" name="stereotype" index="BaGAP" />
        <property id="559557797393017702" name="name" index="BaHAW" />
      </concept>
      <concept id="1143226024141" name="jetbrains.mps.lang.smodel.structure.SModelType" flags="in" index="H_c77" />
      <concept id="1171305280644" name="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" flags="nn" index="2Rf3mk" />
      <concept id="3542851458883438784" name="jetbrains.mps.lang.smodel.structure.LanguageId" flags="ng" index="2V$Bhx">
        <property id="3542851458883439831" name="namespace" index="2V$B1Q" />
        <property id="3542851458883439832" name="languageId" index="2V$B1T" />
      </concept>
      <concept id="3562215692195599741" name="jetbrains.mps.lang.smodel.structure.SLinkImplicitSelect" flags="nn" index="13MTOL">
        <reference id="3562215692195600259" name="link" index="13MTZf" />
      </concept>
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1180636770613" name="jetbrains.mps.lang.smodel.structure.SNodeCreator" flags="nn" index="3zrR0B">
        <child id="1180636770616" name="createdType" index="3zrR0E" />
      </concept>
      <concept id="1144146199828" name="jetbrains.mps.lang.smodel.structure.Node_CopyOperation" flags="nn" index="1$rogu" />
      <concept id="1206482823744" name="jetbrains.mps.lang.smodel.structure.Model_AddRootOperation" flags="nn" index="3BYIHo">
        <child id="1206482823746" name="nodeArgument" index="3BYIHq" />
      </concept>
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
      <concept id="709746936026466394" name="jetbrains.mps.lang.core.structure.ChildAttribute" flags="ng" index="3VBwX9">
        <property id="709746936026609031" name="linkId" index="3V$3ak" />
        <property id="709746936026609029" name="linkRole" index="3V$3am" />
      </concept>
      <concept id="4452961908202556907" name="jetbrains.mps.lang.core.structure.BaseCommentAttribute" flags="ng" index="1X3_iC">
        <child id="3078666699043039389" name="commentedNode" index="8Wnug" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1153943597977" name="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" flags="nn" index="2Gpval">
        <child id="1153944400369" name="variable" index="2Gsz3X" />
        <child id="1153944424730" name="inputSequence" index="2GsD0m" />
      </concept>
      <concept id="1153944193378" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" flags="nr" index="2GrKxI" />
      <concept id="1153944233411" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" flags="nn" index="2GrUjf">
        <reference id="1153944258490" name="variable" index="2Gs0qQ" />
      </concept>
      <concept id="1160612413312" name="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" flags="nn" index="TSZUe" />
      <concept id="1165525191778" name="jetbrains.mps.baseLanguage.collections.structure.GetFirstOperation" flags="nn" index="1uHKPH" />
      <concept id="1165530316231" name="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" flags="nn" index="1v1jN8" />
      <concept id="1176501494711" name="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" flags="nn" index="3GX2aA" />
    </language>
  </registry>
  <node concept="2S6QgY" id="4AFp3iZ2_FA">
    <property role="TrG5h" value="populateFlowModel" />
    <property role="2ZfUl0" value="true" />
    <ref role="2ZfgGC" to="f6re:4ciHkhthZzN" resolve="FlowChunk" />
    <node concept="2S6ZIM" id="4AFp3iZ2_FB" role="2ZfVej">
      <node concept="3clFbS" id="4AFp3iZ2_FC" role="2VODD2">
        <node concept="3clFbF" id="4AFp3iZ2A5$" role="3cqZAp">
          <node concept="Xl_RD" id="4AFp3iZ2A5z" role="3clFbG">
            <property role="Xl_RC" value="Populate Flow Model" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2Sbjvc" id="4AFp3iZ2_FD" role="2ZfgGD">
      <node concept="3clFbS" id="4AFp3iZ2_FE" role="2VODD2">
        <node concept="3clFbH" id="7tAIZp0edaM" role="3cqZAp" />
        <node concept="3cpWs8" id="7tAIZp0edJv" role="3cqZAp">
          <node concept="3cpWsn" id="7tAIZp0edJt" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="flowModelName" />
            <node concept="17QB3L" id="7tAIZp0eelv" role="1tU5fm" />
            <node concept="Xl_RD" id="7tAIZp0eenM" role="33vP2m">
              <property role="Xl_RC" value="FlowModel" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="18xeVvsJyr0" role="3cqZAp" />
        <node concept="3cpWs8" id="18xeVvsC1vJ" role="3cqZAp">
          <node concept="3cpWsn" id="18xeVvsC1vM" role="3cpWs9">
            <property role="TrG5h" value="isDataModelFound" />
            <node concept="10P_77" id="18xeVvsC1vH" role="1tU5fm" />
            <node concept="3clFbT" id="18xeVvsC2aK" role="33vP2m">
              <property role="3clFbU" value="false" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="2nJapj3oTkh" role="3cqZAp">
          <node concept="3cpWsn" id="2nJapj3oTki" role="3cpWs9">
            <property role="TrG5h" value="languageNew" />
            <node concept="3uibUv" id="2nJapj3oTkg" role="1tU5fm">
              <ref role="3uigEE" to="c17a:~SLanguage" resolve="SLanguage" />
            </node>
            <node concept="2OqwBi" id="2nJapj3oTkj" role="33vP2m">
              <node concept="2OqwBi" id="2nJapj3oTkk" role="2Oq$k0">
                <node concept="2OqwBi" id="2nJapj3oTkl" role="2Oq$k0">
                  <node concept="2Sf5sV" id="2nJapj3oTkm" role="2Oq$k0" />
                  <node concept="3TrEf2" id="2nJapj3oTkn" role="2OqNvi">
                    <ref role="3Tt5mk" to="f6re:2V4emM7$wHT" resolve="targetDashboardLanguage" />
                  </node>
                </node>
                <node concept="3TrEf2" id="2nJapj3oTko" role="2OqNvi">
                  <ref role="3Tt5mk" to="tp25:34EJa6aIpny" resolve="languageId" />
                </node>
              </node>
              <node concept="2qgKlT" id="2nJapj3oTkp" role="2OqNvi">
                <ref role="37wK5l" to="tpeu:34EJa6aIcyj" resolve="getLanguage" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="2nJapj3oVXp" role="3cqZAp">
          <node concept="3cpWsn" id="2nJapj3oVXq" role="3cpWs9">
            <property role="TrG5h" value="sourceModule" />
            <node concept="3uibUv" id="2nJapj3oVXh" role="1tU5fm">
              <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
            </node>
            <node concept="2OqwBi" id="2nJapj3oVXr" role="33vP2m">
              <node concept="37vLTw" id="2nJapj3oVXs" role="2Oq$k0">
                <ref role="3cqZAo" node="2nJapj3oTki" resolve="languageNew" />
              </node>
              <node concept="liA8E" id="2nJapj3oVXt" role="2OqNvi">
                <ref role="37wK5l" to="c17a:~SLanguage.getSourceModule():org.jetbrains.mps.openapi.module.SModule" resolve="getSourceModule" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="2nJapj3q855" role="3cqZAp" />
        <node concept="3cpWs8" id="2nJapj3qpWp" role="3cqZAp">
          <node concept="3cpWsn" id="2nJapj3qpWq" role="3cpWs9">
            <property role="TrG5h" value="modelRoots" />
            <node concept="3uibUv" id="2nJapj3qpW4" role="1tU5fm">
              <ref role="3uigEE" to="wyt6:~Iterable" resolve="Iterable" />
              <node concept="3uibUv" id="2nJapj3qpW7" role="11_B2D">
                <ref role="3uigEE" to="dush:~ModelRoot" resolve="ModelRoot" />
              </node>
            </node>
            <node concept="2OqwBi" id="2nJapj3qpWr" role="33vP2m">
              <node concept="37vLTw" id="2nJapj3qpWs" role="2Oq$k0">
                <ref role="3cqZAo" node="2nJapj3oVXq" resolve="sourceModule" />
              </node>
              <node concept="liA8E" id="2nJapj3qpWt" role="2OqNvi">
                <ref role="37wK5l" to="lui2:~SModule.getModelRoots():java.lang.Iterable" resolve="getModelRoots" />
              </node>
            </node>
          </node>
        </node>
        <node concept="2Gpval" id="2nJapj3qrhq" role="3cqZAp">
          <node concept="2GrKxI" id="2nJapj3qrhs" role="2Gsz3X">
            <property role="TrG5h" value="root" />
          </node>
          <node concept="3clFbS" id="2nJapj3qrhw" role="2LFqv$">
            <node concept="3clFbH" id="18xeVvs_ZRB" role="3cqZAp" />
            <node concept="2Gpval" id="18xeVvs_XdL" role="3cqZAp">
              <node concept="2GrKxI" id="18xeVvs_XdN" role="2Gsz3X">
                <property role="TrG5h" value="item" />
              </node>
              <node concept="2OqwBi" id="18xeVvs_XMj" role="2GsD0m">
                <node concept="2GrUjf" id="18xeVvs_X_R" role="2Oq$k0">
                  <ref role="2Gs0qQ" node="2nJapj3qrhs" resolve="root" />
                </node>
                <node concept="liA8E" id="18xeVvs_Ywi" role="2OqNvi">
                  <ref role="37wK5l" to="dush:~ModelRoot.getModels():java.lang.Iterable" resolve="getModels" />
                </node>
              </node>
              <node concept="3clFbS" id="18xeVvs_XdR" role="2LFqv$">
                <node concept="3clFbJ" id="18xeVvsAs_A" role="3cqZAp">
                  <node concept="3clFbS" id="18xeVvsAs_C" role="3clFbx">
                    <node concept="3clFbH" id="18xeVvsCFRF" role="3cqZAp" />
                    <node concept="2Gpval" id="18xeVvsADAy" role="3cqZAp">
                      <node concept="2GrKxI" id="18xeVvsADAz" role="2Gsz3X">
                        <property role="TrG5h" value="rootNode" />
                      </node>
                      <node concept="2OqwBi" id="18xeVvsADIS" role="2GsD0m">
                        <node concept="2GrUjf" id="18xeVvsADBz" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="18xeVvs_XdN" resolve="item" />
                        </node>
                        <node concept="liA8E" id="18xeVvsAExw" role="2OqNvi">
                          <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                        </node>
                      </node>
                      <node concept="3clFbS" id="18xeVvsADA_" role="2LFqv$">
                        <node concept="3clFbF" id="18xeVvsAFt7" role="3cqZAp">
                          <node concept="2OqwBi" id="18xeVvsAFyW" role="3clFbG">
                            <node concept="2GrUjf" id="18xeVvsAFt6" role="2Oq$k0">
                              <ref role="2Gs0qQ" node="18xeVvs_XdN" resolve="item" />
                            </node>
                            <node concept="liA8E" id="18xeVvsAGov" role="2OqNvi">
                              <ref role="37wK5l" to="mhbf:~SModel.removeRootNode(org.jetbrains.mps.openapi.model.SNode):void" resolve="removeRootNode" />
                              <node concept="2GrUjf" id="18xeVvsAHhR" role="37wK5m">
                                <ref role="2Gs0qQ" node="18xeVvsADAz" resolve="rootNode" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3zACq4" id="18xeVvsBquT" role="3cqZAp" />
                      </node>
                    </node>
                    <node concept="3clFbF" id="18xeVvsC2LN" role="3cqZAp">
                      <node concept="37vLTI" id="18xeVvsC3D$" role="3clFbG">
                        <node concept="3clFbT" id="18xeVvsC3E3" role="37vLTx">
                          <property role="3clFbU" value="true" />
                        </node>
                        <node concept="37vLTw" id="18xeVvsC2LL" role="37vLTJ">
                          <ref role="3cqZAo" node="18xeVvsC1vM" resolve="isDataModelFound" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="18xeVvsAv1_" role="3clFbw">
                    <node concept="2OqwBi" id="18xeVvsAtdS" role="2Oq$k0">
                      <node concept="2GrUjf" id="18xeVvsAt6V" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="18xeVvs_XdN" resolve="item" />
                      </node>
                      <node concept="liA8E" id="18xeVvsAtQS" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SModel.getModelName():java.lang.String" resolve="getModelName" />
                      </node>
                    </node>
                    <node concept="liA8E" id="18xeVvsAz4Y" role="2OqNvi">
                      <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                      <node concept="37vLTw" id="7tAIZp0egmy" role="37wK5m">
                        <ref role="3cqZAo" node="7tAIZp0edJt" resolve="flowModelName" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="18xeVvsC3HU" role="3cqZAp" />
            <node concept="3clFbJ" id="18xeVvsC4ZE" role="3cqZAp">
              <node concept="3clFbS" id="18xeVvsC4ZG" role="3clFbx">
                <node concept="3clFbH" id="MCudDIBMov" role="3cqZAp" />
                <node concept="3clFbF" id="MCudDIBM_s" role="3cqZAp">
                  <node concept="2OqwBi" id="MCudDIBM_p" role="3clFbG">
                    <node concept="10M0yZ" id="MCudDIBM_q" role="2Oq$k0">
                      <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                      <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                    </node>
                    <node concept="liA8E" id="MCudDIBM_r" role="2OqNvi">
                      <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                      <node concept="Xl_RD" id="MCudDIBMHG" role="37wK5m">
                        <property role="Xl_RC" value="Going to create!!!!!!" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="MCudDIBMtP" role="3cqZAp" />
                <node concept="3cpWs8" id="18xeVvsCzli" role="3cqZAp">
                  <node concept="3cpWsn" id="18xeVvsCzlj" role="3cpWs9">
                    <property role="TrG5h" value="createModel" />
                    <node concept="3uibUv" id="18xeVvsCzkj" role="1tU5fm">
                      <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
                    </node>
                    <node concept="2OqwBi" id="18xeVvsCzlk" role="33vP2m">
                      <node concept="2GrUjf" id="18xeVvsCzll" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="2nJapj3qrhs" resolve="root" />
                      </node>
                      <node concept="liA8E" id="18xeVvsCzlm" role="2OqNvi">
                        <ref role="37wK5l" to="dush:~ModelRoot.createModel(java.lang.String):org.jetbrains.mps.openapi.model.SModel" resolve="createModel" />
                        <node concept="37vLTw" id="7tAIZp0eknh" role="37wK5m">
                          <ref role="3cqZAo" node="7tAIZp0edJt" resolve="flowModelName" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="18xeVvsH57S" role="3cqZAp" />
                <node concept="2Gpval" id="18xeVvsCS0y" role="3cqZAp">
                  <node concept="2GrKxI" id="18xeVvsCS0$" role="2Gsz3X">
                    <property role="TrG5h" value="atom" />
                  </node>
                  <node concept="2OqwBi" id="18xeVvsCSJU" role="2GsD0m">
                    <node concept="2GrUjf" id="18xeVvsCSCJ" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="2nJapj3qrhs" resolve="root" />
                    </node>
                    <node concept="liA8E" id="18xeVvsCT$e" role="2OqNvi">
                      <ref role="37wK5l" to="dush:~ModelRoot.getModels():java.lang.Iterable" resolve="getModels" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="18xeVvsCS0C" role="2LFqv$">
                    <node concept="3clFbJ" id="18xeVvsCZm$" role="3cqZAp">
                      <node concept="3clFbS" id="18xeVvsCZmA" role="3clFbx">
                        <node concept="3clFbH" id="18xeVvsIuk1" role="3cqZAp" />
                        <node concept="3cpWs8" id="18xeVvsD47o" role="3cqZAp">
                          <node concept="3cpWsn" id="18xeVvsD47p" role="3cpWs9">
                            <property role="TrG5h" value="sModelInternal" />
                            <node concept="3uibUv" id="18xeVvsD47q" role="1tU5fm">
                              <ref role="3uigEE" to="w1kc:~SModelInternal" resolve="SModelInternal" />
                            </node>
                            <node concept="1eOMI4" id="18xeVvsD49n" role="33vP2m">
                              <node concept="10QFUN" id="18xeVvsD49k" role="1eOMHV">
                                <node concept="3uibUv" id="18xeVvsD49R" role="10QFUM">
                                  <ref role="3uigEE" to="w1kc:~SModelInternal" resolve="SModelInternal" />
                                </node>
                                <node concept="2GrUjf" id="18xeVvsD4am" role="10QFUP">
                                  <ref role="2Gs0qQ" node="18xeVvsCS0$" resolve="atom" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="18xeVvsD4bf" role="3cqZAp">
                          <node concept="2OqwBi" id="18xeVvsD4jC" role="3clFbG">
                            <node concept="37vLTw" id="18xeVvsD4bd" role="2Oq$k0">
                              <ref role="3cqZAo" node="18xeVvsD47p" resolve="sModelInternal" />
                            </node>
                            <node concept="liA8E" id="18xeVvsD4E7" role="2OqNvi">
                              <ref role="37wK5l" to="w1kc:~SModelInternal.addLanguage(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="addLanguage" />
                              <node concept="pHN19" id="18xeVvsDaC5" role="37wK5m">
                                <node concept="2V$Bhx" id="18xeVvsDbG4" role="2V$M_3">
                                  <property role="2V$B1T" value="7866978e-a0f0-4cc7-81bc-4d213d9375e1" />
                                  <property role="2V$B1Q" value="jetbrains.mps.lang.smodel" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="18xeVvsDn4I" role="3cqZAp">
                          <node concept="2OqwBi" id="18xeVvsDn4J" role="3clFbG">
                            <node concept="37vLTw" id="18xeVvsDn4K" role="2Oq$k0">
                              <ref role="3cqZAo" node="18xeVvsD47p" resolve="sModelInternal" />
                            </node>
                            <node concept="liA8E" id="18xeVvsDn4L" role="2OqNvi">
                              <ref role="37wK5l" to="w1kc:~SModelInternal.addLanguage(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="addLanguage" />
                              <node concept="pHN19" id="18xeVvsDqhM" role="37wK5m">
                                <node concept="2V$Bhx" id="18xeVvsDsoR" role="2V$M_3">
                                  <property role="2V$B1T" value="c020a239-d865-4312-adc3-cb4ab0a7a547" />
                                  <property role="2V$B1Q" value="org.iets3.flow.property.formulae" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="18xeVvsDCl0" role="3cqZAp">
                          <node concept="2OqwBi" id="18xeVvsDCl1" role="3clFbG">
                            <node concept="37vLTw" id="18xeVvsDCl2" role="2Oq$k0">
                              <ref role="3cqZAo" node="18xeVvsD47p" resolve="sModelInternal" />
                            </node>
                            <node concept="liA8E" id="18xeVvsDCl3" role="2OqNvi">
                              <ref role="37wK5l" to="w1kc:~SModelInternal.addLanguage(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="addLanguage" />
                              <node concept="pHN19" id="18xeVvsDFxz" role="37wK5m">
                                <node concept="2V$Bhx" id="18xeVvsDHDS" role="2V$M_3">
                                  <property role="2V$B1T" value="0ecea2a9-218f-4e3b-badc-a524a5addb7c" />
                                  <property role="2V$B1Q" value="org.iets3.flow.property" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="18xeVvsETdz" role="3cqZAp">
                          <node concept="2OqwBi" id="18xeVvsETd$" role="3clFbG">
                            <node concept="37vLTw" id="18xeVvsETd_" role="2Oq$k0">
                              <ref role="3cqZAo" node="18xeVvsD47p" resolve="sModelInternal" />
                            </node>
                            <node concept="liA8E" id="18xeVvsETdA" role="2OqNvi">
                              <ref role="37wK5l" to="w1kc:~SModelInternal.addLanguage(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="addLanguage" />
                              <node concept="pHN19" id="18xeVvsEWuu" role="37wK5m">
                                <node concept="2V$Bhx" id="18xeVvsItGC" role="2V$M_3">
                                  <property role="2V$B1T" value="10211132-9b5e-427a-9b37-1c1f28794a5e" />
                                  <property role="2V$B1Q" value="org.iets3.flow.dashboard" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbH" id="18xeVvsGrFD" role="3cqZAp" />
                        <node concept="1X3_iC" id="4bxTNXJl4CV" role="lGtFl">
                          <property role="3V$3am" value="statement" />
                          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
                          <node concept="3clFbF" id="18xeVvsGNWe" role="8Wnug">
                            <node concept="2OqwBi" id="18xeVvsGNWf" role="3clFbG">
                              <node concept="37vLTw" id="18xeVvsGNWg" role="2Oq$k0">
                                <ref role="3cqZAo" node="18xeVvsD47p" resolve="sModelInternal" />
                              </node>
                              <node concept="liA8E" id="18xeVvsGNWh" role="2OqNvi">
                                <ref role="37wK5l" to="w1kc:~SModelInternal.addModelImport(org.jetbrains.mps.openapi.model.SModelReference):void" resolve="addModelImport" />
                                <node concept="2OqwBi" id="18xeVvsGNWi" role="37wK5m">
                                  <node concept="2OqwBi" id="18xeVvsGNWj" role="2Oq$k0">
                                    <node concept="2YIFZM" id="18xeVvsGNWk" role="2Oq$k0">
                                      <ref role="37wK5l" to="w1kc:~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolve="getInstance" />
                                      <ref role="1Pybhc" to="w1kc:~SModelRepository" resolve="SModelRepository" />
                                    </node>
                                    <node concept="liA8E" id="18xeVvsGNWl" role="2OqNvi">
                                      <ref role="37wK5l" to="w1kc:~SModelRepository.getModelDescriptor(java.lang.String):org.jetbrains.mps.openapi.model.SModel" resolve="getModelDescriptor" />
                                      <node concept="Xl_RD" id="18xeVvsGNWm" role="37wK5m">
                                        <property role="Xl_RC" value="org.iets3.flow.property.structure" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="liA8E" id="18xeVvsGNWn" role="2OqNvi">
                                    <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3cpWs8" id="4MKUcPm$kwP" role="3cqZAp">
                          <node concept="3cpWsn" id="4MKUcPm$kwQ" role="3cpWs9">
                            <property role="TrG5h" value="propertyLanguage" />
                            <node concept="3uibUv" id="4MKUcPm$kwR" role="1tU5fm">
                              <ref role="3uigEE" to="c17a:~SLanguage" resolve="SLanguage" />
                            </node>
                            <node concept="2YIFZM" id="4bxTNXJmNhu" role="33vP2m">
                              <ref role="37wK5l" to="7aef:2fMLJI19m9J" resolve="getLanguageFromAbstractConcept" />
                              <ref role="1Pybhc" to="7aef:2fMLJI18X4e" resolve="LanguageUtility" />
                              <node concept="2OqwBi" id="4bxTNXJmNhv" role="37wK5m">
                                <node concept="2OqwBi" id="4bxTNXJmNhw" role="2Oq$k0">
                                  <node concept="2OqwBi" id="4bxTNXJmNhx" role="2Oq$k0">
                                    <node concept="2OqwBi" id="4bxTNXJmNhy" role="2Oq$k0">
                                      <node concept="2OqwBi" id="4bxTNXJmNhz" role="2Oq$k0">
                                        <node concept="2Sf5sV" id="4bxTNXJmOLD" role="2Oq$k0" />
                                        <node concept="3Tsc0h" id="4bxTNXJmP9p" role="2OqNvi">
                                          <ref role="3TtcxE" to="f6re:4ciHkhthZzO" resolve="stateInstances" />
                                        </node>
                                      </node>
                                      <node concept="1uHKPH" id="4bxTNXJmRf6" role="2OqNvi" />
                                    </node>
                                    <node concept="2Rf3mk" id="4bxTNXJmNhB" role="2OqNvi">
                                      <node concept="1xMEDy" id="4bxTNXJmNhC" role="1xVPHs">
                                        <node concept="chp4Y" id="4bxTNXJmNhD" role="ri$Ld">
                                          <ref role="cht4Q" to="47lw:6$igfY83rGa" resolve="AtomicProperty" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="13MTOL" id="4bxTNXJmNhE" role="2OqNvi">
                                    <ref role="13MTZf" to="tp25:2iMJRNxweHl" resolve="conceptDeclaration" />
                                  </node>
                                </node>
                                <node concept="1uHKPH" id="4bxTNXJmRB5" role="2OqNvi" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="4bxTNXJl_gu" role="3cqZAp">
                          <node concept="2OqwBi" id="4bxTNXJl_gv" role="3clFbG">
                            <node concept="37vLTw" id="4bxTNXJl_gw" role="2Oq$k0">
                              <ref role="3cqZAo" node="18xeVvsD47p" resolve="sModelInternal" />
                            </node>
                            <node concept="liA8E" id="4bxTNXJl_gx" role="2OqNvi">
                              <ref role="37wK5l" to="w1kc:~SModelInternal.addLanguage(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="addLanguage" />
                              <node concept="37vLTw" id="4bxTNXJmRPS" role="37wK5m">
                                <ref role="3cqZAo" node="4MKUcPm$kwQ" resolve="propertyLanguage" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbH" id="4bxTNXJl_gy" role="3cqZAp" />
                        <node concept="3clFbF" id="4bxTNXJl_gz" role="3cqZAp">
                          <node concept="2OqwBi" id="4bxTNXJl_g$" role="3clFbG">
                            <node concept="37vLTw" id="4bxTNXJl_g_" role="2Oq$k0">
                              <ref role="3cqZAo" node="18xeVvsD47p" resolve="sModelInternal" />
                            </node>
                            <node concept="liA8E" id="4bxTNXJl_gA" role="2OqNvi">
                              <ref role="37wK5l" to="w1kc:~SModelInternal.addModelImport(org.jetbrains.mps.openapi.model.SModelReference):void" resolve="addModelImport" />
                              <node concept="2OqwBi" id="4bxTNXJl_gB" role="37wK5m">
                                <node concept="2OqwBi" id="4bxTNXJl_gC" role="2Oq$k0">
                                  <node concept="2YIFZM" id="4bxTNXJl_gD" role="2Oq$k0">
                                    <ref role="1Pybhc" to="w1kc:~SModelRepository" resolve="SModelRepository" />
                                    <ref role="37wK5l" to="w1kc:~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolve="getInstance" />
                                  </node>
                                  <node concept="liA8E" id="4bxTNXJl_gE" role="2OqNvi">
                                    <ref role="37wK5l" to="w1kc:~SModelRepository.getModelDescriptor(java.lang.String):org.jetbrains.mps.openapi.model.SModel" resolve="getModelDescriptor" />
                                    <node concept="3cpWs3" id="4MKUcPm$nuk" role="37wK5m">
                                      <node concept="Xl_RD" id="4MKUcPm$nuq" role="3uHU7w">
                                        <property role="Xl_RC" value=".structure" />
                                      </node>
                                      <node concept="2OqwBi" id="4MKUcPm$mQT" role="3uHU7B">
                                        <node concept="37vLTw" id="4MKUcPm$mJI" role="2Oq$k0">
                                          <ref role="3cqZAo" node="4MKUcPm$kwQ" resolve="propertyLanguage" />
                                        </node>
                                        <node concept="liA8E" id="4MKUcPm$n8I" role="2OqNvi">
                                          <ref role="37wK5l" to="c17a:~SLanguage.getQualifiedName():java.lang.String" resolve="getQualifiedName" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="liA8E" id="4bxTNXJl_gF" role="2OqNvi">
                                  <ref role="37wK5l" to="mhbf:~SModel.getReference():org.jetbrains.mps.openapi.model.SModelReference" resolve="getReference" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="4VZIwwKuHfI" role="3cqZAp">
                          <node concept="2OqwBi" id="4VZIwwKuHyH" role="3clFbG">
                            <node concept="2Sf5sV" id="4VZIwwKuHfG" role="2Oq$k0" />
                            <node concept="2qgKlT" id="4VZIwwKuHRZ" role="2OqNvi">
                              <ref role="37wK5l" to="21uu:5MdYwHWTJdG" resolve="fixModuleImports" />
                              <node concept="2OqwBi" id="4VZIwwKuHW0" role="37wK5m">
                                <node concept="2OqwBi" id="4VZIwwKuHW1" role="2Oq$k0">
                                  <node concept="2OqwBi" id="4VZIwwKuHW2" role="2Oq$k0">
                                    <node concept="2OqwBi" id="4VZIwwKuHW3" role="2Oq$k0">
                                      <node concept="2OqwBi" id="4VZIwwKuHW4" role="2Oq$k0">
                                        <node concept="2Sf5sV" id="4VZIwwKuHW5" role="2Oq$k0" />
                                        <node concept="3Tsc0h" id="4VZIwwKuHW6" role="2OqNvi">
                                          <ref role="3TtcxE" to="f6re:4ciHkhthZzO" resolve="stateInstances" />
                                        </node>
                                      </node>
                                      <node concept="1uHKPH" id="4VZIwwKuHW7" role="2OqNvi" />
                                    </node>
                                    <node concept="2Rf3mk" id="4VZIwwKuHW8" role="2OqNvi">
                                      <node concept="1xMEDy" id="4VZIwwKuHW9" role="1xVPHs">
                                        <node concept="chp4Y" id="4VZIwwKuHWa" role="ri$Ld">
                                          <ref role="cht4Q" to="47lw:6$igfY83rGa" resolve="AtomicProperty" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="13MTOL" id="4VZIwwKuHWb" role="2OqNvi">
                                    <ref role="13MTZf" to="tp25:2iMJRNxweHl" resolve="conceptDeclaration" />
                                  </node>
                                </node>
                                <node concept="1uHKPH" id="4VZIwwKuHWc" role="2OqNvi" />
                              </node>
                              <node concept="37vLTw" id="3Th9DYx5qtj" role="37wK5m">
                                <ref role="3cqZAo" node="2nJapj3oVXq" resolve="sourceModule" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbH" id="3Th9DYx5p8j" role="3cqZAp" />
                      </node>
                      <node concept="2OqwBi" id="18xeVvsCZmZ" role="3clFbw">
                        <node concept="2OqwBi" id="18xeVvsCZn0" role="2Oq$k0">
                          <node concept="2GrUjf" id="18xeVvsD1rl" role="2Oq$k0">
                            <ref role="2Gs0qQ" node="18xeVvsCS0$" resolve="atom" />
                          </node>
                          <node concept="liA8E" id="18xeVvsCZn2" role="2OqNvi">
                            <ref role="37wK5l" to="mhbf:~SModel.getModelName():java.lang.String" resolve="getModelName" />
                          </node>
                        </node>
                        <node concept="liA8E" id="18xeVvsCZn3" role="2OqNvi">
                          <ref role="37wK5l" to="wyt6:~String.equals(java.lang.Object):boolean" resolve="equals" />
                          <node concept="37vLTw" id="7tAIZp0eoja" role="37wK5m">
                            <ref role="3cqZAo" node="7tAIZp0edJt" resolve="flowModelName" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3fqX7Q" id="18xeVvsC5CJ" role="3clFbw">
                <node concept="37vLTw" id="18xeVvsC5De" role="3fr31v">
                  <ref role="3cqZAo" node="18xeVvsC1vM" resolve="isDataModelFound" />
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="18xeVvsCOUc" role="3cqZAp" />
            <node concept="3clFbF" id="7tAIZp0eRRE" role="3cqZAp">
              <node concept="2OqwBi" id="7tAIZp0eRRB" role="3clFbG">
                <node concept="10M0yZ" id="7tAIZp0eRRC" role="2Oq$k0">
                  <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                  <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="7tAIZp0eRRD" role="2OqNvi">
                  <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                  <node concept="Xl_RD" id="7tAIZp0eSrA" role="37wK5m">
                    <property role="Xl_RC" value="Going to copy...................." />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="2nJapj3rtHB" role="3cqZAp" />
            <node concept="3SKdUt" id="2nJapj3rrZp" role="3cqZAp">
              <node concept="3SKdUq" id="2nJapj3rrZq" role="3SKWNk">
                <property role="3SKdUp" value="copying useful properties " />
              </node>
            </node>
            <node concept="3cpWs8" id="2nJapj3rrZ_" role="3cqZAp">
              <node concept="3cpWsn" id="2nJapj3rrZA" role="3cpWs9">
                <property role="TrG5h" value="flow" />
                <node concept="3Tqbb2" id="2nJapj3rrZB" role="1tU5fm">
                  <ref role="ehGHo" to="xwgo:3HvtPSdglG0" resolve="FlowData" />
                </node>
                <node concept="2ShNRf" id="2nJapj3rrZC" role="33vP2m">
                  <node concept="3zrR0B" id="2nJapj3rrZD" role="2ShVmc">
                    <node concept="3Tqbb2" id="2nJapj3rrZE" role="3zrR0E">
                      <ref role="ehGHo" to="xwgo:3HvtPSdglG0" resolve="FlowData" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="6Zy$B2vRVYN" role="3cqZAp">
              <node concept="37vLTI" id="6Zy$B2vRXFz" role="3clFbG">
                <node concept="Xl_RD" id="6Zy$B2vRXM4" role="37vLTx">
                  <property role="Xl_RC" value="FlowData" />
                </node>
                <node concept="2OqwBi" id="6Zy$B2vRWSP" role="37vLTJ">
                  <node concept="37vLTw" id="6Zy$B2vRVYL" role="2Oq$k0">
                    <ref role="3cqZAo" node="2nJapj3rrZA" resolve="flow" />
                  </node>
                  <node concept="3TrcHB" id="6Zy$B2vRXe9" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="7c_wSf79mw$" role="3cqZAp" />
            <node concept="3SKdUt" id="7c_wSf79dap" role="3cqZAp">
              <node concept="3SKdUq" id="7c_wSf79dar" role="3SKWNk">
                <property role="3SKdUp" value="keep track of which nodes from the flow definition are mapped into which nodes in the dashboard states" />
              </node>
            </node>
            <node concept="3cpWs8" id="7c_wSf79ctQ" role="3cqZAp">
              <node concept="3cpWsn" id="7c_wSf79ctR" role="3cpWs9">
                <property role="TrG5h" value="stateMap" />
                <node concept="3uibUv" id="7c_wSf79ctO" role="1tU5fm">
                  <ref role="3uigEE" to="33ny:~HashMap" resolve="HashMap" />
                  <node concept="3Tqbb2" id="7c_wSf79cE1" role="11_B2D">
                    <ref role="ehGHo" to="f6re:4ciHkhthZzF" resolve="FlowState" />
                  </node>
                  <node concept="3Tqbb2" id="7c_wSf79cFQ" role="11_B2D">
                    <ref role="ehGHo" to="xwgo:5cR9puhF2lu" resolve="State" />
                  </node>
                </node>
                <node concept="2ShNRf" id="7c_wSf79tF_" role="33vP2m">
                  <node concept="1pGfFk" id="7c_wSf79tmg" role="2ShVmc">
                    <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                    <node concept="3Tqbb2" id="7c_wSf79tmh" role="1pMfVU">
                      <ref role="ehGHo" to="f6re:4ciHkhthZzF" resolve="FlowState" />
                    </node>
                    <node concept="3Tqbb2" id="7c_wSf79tmi" role="1pMfVU">
                      <ref role="ehGHo" to="xwgo:5cR9puhF2lu" resolve="State" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="7c_wSf79jRG" role="3cqZAp" />
            <node concept="3clFbF" id="5MdYwHWQc8r" role="3cqZAp">
              <node concept="37vLTI" id="5MdYwHWQdmi" role="3clFbG">
                <node concept="Xl_RD" id="5MdYwHWQdsV" role="37vLTx">
                  <property role="Xl_RC" value="FlowDataRootNode" />
                </node>
                <node concept="2OqwBi" id="5MdYwHWQcHO" role="37vLTJ">
                  <node concept="37vLTw" id="5MdYwHWQc8p" role="2Oq$k0">
                    <ref role="3cqZAo" node="2nJapj3rrZA" resolve="flow" />
                  </node>
                  <node concept="3TrcHB" id="5MdYwHWQcSK" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="7c_wSf79HFf" role="3cqZAp" />
            <node concept="3SKdUt" id="7c_wSf79Ikp" role="3cqZAp">
              <node concept="3SKdUq" id="7c_wSf79Ikr" role="3SKWNk">
                <property role="3SKdUp" value="first create all the new states in the dashboard" />
              </node>
            </node>
            <node concept="3clFbH" id="7c_wSf79HNo" role="3cqZAp" />
            <node concept="2Gpval" id="2nJapj3rrZF" role="3cqZAp">
              <node concept="2GrKxI" id="2nJapj3rrZG" role="2Gsz3X">
                <property role="TrG5h" value="state" />
              </node>
              <node concept="2OqwBi" id="2nJapj3rrZH" role="2GsD0m">
                <node concept="2Sf5sV" id="2nJapj3rrZI" role="2Oq$k0" />
                <node concept="3Tsc0h" id="2nJapj3rrZJ" role="2OqNvi">
                  <ref role="3TtcxE" to="f6re:4ciHkhthZzO" resolve="stateInstances" />
                </node>
              </node>
              <node concept="3clFbS" id="2nJapj3rrZK" role="2LFqv$">
                <node concept="3cpWs8" id="2nJapj3rrZL" role="3cqZAp">
                  <node concept="3cpWsn" id="2nJapj3rrZM" role="3cpWs9">
                    <property role="TrG5h" value="stateDashboard" />
                    <node concept="3Tqbb2" id="2nJapj3rrZN" role="1tU5fm">
                      <ref role="ehGHo" to="xwgo:5cR9puhF2lu" resolve="State" />
                    </node>
                    <node concept="2ShNRf" id="2nJapj3rrZO" role="33vP2m">
                      <node concept="3zrR0B" id="2nJapj3rrZP" role="2ShVmc">
                        <node concept="3Tqbb2" id="2nJapj3rrZQ" role="3zrR0E">
                          <ref role="ehGHo" to="xwgo:5cR9puhF2lu" resolve="State" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="7c_wSf79nbT" role="3cqZAp">
                  <node concept="2OqwBi" id="7c_wSf79nYa" role="3clFbG">
                    <node concept="37vLTw" id="7c_wSf79nbR" role="2Oq$k0">
                      <ref role="3cqZAo" node="7c_wSf79ctR" resolve="stateMap" />
                    </node>
                    <node concept="liA8E" id="7c_wSf79p6H" role="2OqNvi">
                      <ref role="37wK5l" to="33ny:~HashMap.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
                      <node concept="2GrUjf" id="7c_wSf79pha" role="37wK5m">
                        <ref role="2Gs0qQ" node="2nJapj3rrZG" resolve="state" />
                      </node>
                      <node concept="37vLTw" id="7c_wSf79pWC" role="37wK5m">
                        <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="2nJapj3rrZR" role="3cqZAp">
                  <node concept="37vLTI" id="2nJapj3rrZS" role="3clFbG">
                    <node concept="2OqwBi" id="2nJapj3rrZT" role="37vLTJ">
                      <node concept="37vLTw" id="2nJapj3rrZU" role="2Oq$k0">
                        <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                      </node>
                      <node concept="3TrEf2" id="2nJapj3rrZV" role="2OqNvi">
                        <ref role="3Tt5mk" to="xwgo:5cR9puhFRxn" resolve="formula" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="2nJapj3rrZW" role="37vLTx">
                      <node concept="2OqwBi" id="2nJapj3rrZX" role="2Oq$k0">
                        <node concept="2GrUjf" id="2nJapj3rrZY" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="2nJapj3rrZG" resolve="state" />
                        </node>
                        <node concept="3TrEf2" id="2nJapj3rrZZ" role="2OqNvi">
                          <ref role="3Tt5mk" to="f6re:4ciHkhtie$A" resolve="propertyFormula" />
                        </node>
                      </node>
                      <node concept="1$rogu" id="2nJapj3rs00" role="2OqNvi" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="7c_wSf7k14c" role="3cqZAp">
                  <node concept="37vLTI" id="7c_wSf7k14d" role="3clFbG">
                    <node concept="2OqwBi" id="7c_wSf7k14f" role="37vLTx">
                      <node concept="2GrUjf" id="7c_wSf7k14g" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="2nJapj3rrZG" resolve="state" />
                      </node>
                      <node concept="3TrcHB" id="7c_wSf7k3BM" role="2OqNvi">
                        <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="7c_wSf7k14j" role="37vLTJ">
                      <node concept="37vLTw" id="7c_wSf7k14k" role="2Oq$k0">
                        <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                      </node>
                      <node concept="3TrcHB" id="7c_wSf7k2kW" role="2OqNvi">
                        <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="2nJapj3rs01" role="3cqZAp">
                  <node concept="37vLTI" id="2nJapj3rs02" role="3clFbG">
                    <node concept="2OqwBi" id="2nJapj3rs03" role="37vLTx">
                      <node concept="2OqwBi" id="2nJapj3rs04" role="2Oq$k0">
                        <node concept="2GrUjf" id="2nJapj3rs05" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="2nJapj3rrZG" resolve="state" />
                        </node>
                        <node concept="3TrEf2" id="2nJapj3rs06" role="2OqNvi">
                          <ref role="3Tt5mk" to="f6re:4ciHkhthZzI" resolve="displayString" />
                        </node>
                      </node>
                      <node concept="3TrcHB" id="2nJapj3rs07" role="2OqNvi">
                        <ref role="3TsBF5" to="f6re:14AbH$uDmgi" resolve="text" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="2nJapj3rs08" role="37vLTJ">
                      <node concept="37vLTw" id="2nJapj3rs09" role="2Oq$k0">
                        <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                      </node>
                      <node concept="3TrcHB" id="7c_wSf7jZSA" role="2OqNvi">
                        <ref role="3TsBF5" to="xwgo:5cR9puhFRxl" resolve="text" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="7c_wSf799VG" role="3cqZAp">
                  <node concept="37vLTI" id="7c_wSf79aRs" role="3clFbG">
                    <node concept="2OqwBi" id="7c_wSf79bcd" role="37vLTx">
                      <node concept="2GrUjf" id="7c_wSf79aXh" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="2nJapj3rrZG" resolve="state" />
                      </node>
                      <node concept="3TrcHB" id="7c_wSf79bFc" role="2OqNvi">
                        <ref role="3TsBF5" to="f6re:7c_wSf78X$G" resolve="startState" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="7c_wSf79aex" role="37vLTJ">
                      <node concept="37vLTw" id="7c_wSf799VE" role="2Oq$k0">
                        <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                      </node>
                      <node concept="3TrcHB" id="7c_wSf79anZ" role="2OqNvi">
                        <ref role="3TsBF5" to="xwgo:7c_wSf7986l" resolve="isStart" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbJ" id="6M1fdrEqWfv" role="3cqZAp">
                  <node concept="3clFbS" id="6M1fdrEqWfx" role="3clFbx">
                    <node concept="3clFbF" id="6M1fdrEr1q4" role="3cqZAp">
                      <node concept="37vLTI" id="6M1fdrEr2qc" role="3clFbG">
                        <node concept="3clFbT" id="6M1fdrEr2we" role="37vLTx">
                          <property role="3clFbU" value="true" />
                        </node>
                        <node concept="2OqwBi" id="6M1fdrEr1zH" role="37vLTJ">
                          <node concept="37vLTw" id="6M1fdrEr1q2" role="2Oq$k0">
                            <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                          </node>
                          <node concept="3TrcHB" id="6M1fdrEr1T1" role="2OqNvi">
                            <ref role="3TsBF5" to="xwgo:7c_wSf7BDZ6" resolve="isFinal" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="6M1fdrEqZsp" role="3clFbw">
                    <node concept="2OqwBi" id="6M1fdrEqWKb" role="2Oq$k0">
                      <node concept="2GrUjf" id="6M1fdrEqWA$" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="2nJapj3rrZG" resolve="state" />
                      </node>
                      <node concept="3Tsc0h" id="6M1fdrEqXHf" role="2OqNvi">
                        <ref role="3TtcxE" to="f6re:7c_wSf78lMh" resolve="nextStates" />
                      </node>
                    </node>
                    <node concept="1v1jN8" id="6M1fdrEr1pa" role="2OqNvi" />
                  </node>
                  <node concept="9aQIb" id="6M1fdrEr2yK" role="9aQIa">
                    <node concept="3clFbS" id="6M1fdrEr2yL" role="9aQI4">
                      <node concept="3clFbF" id="6M1fdrEr2SC" role="3cqZAp">
                        <node concept="37vLTI" id="6M1fdrEr2SD" role="3clFbG">
                          <node concept="3clFbT" id="6M1fdrEr2YI" role="37vLTx">
                            <property role="3clFbU" value="false" />
                          </node>
                          <node concept="2OqwBi" id="6M1fdrEr2SF" role="37vLTJ">
                            <node concept="37vLTw" id="6M1fdrEr2SG" role="2Oq$k0">
                              <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                            </node>
                            <node concept="3TrcHB" id="6M1fdrEr2SH" role="2OqNvi">
                              <ref role="3TsBF5" to="xwgo:7c_wSf7BDZ6" resolve="isFinal" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbJ" id="6mLEnnuEunx" role="3cqZAp">
                  <node concept="3clFbS" id="6mLEnnuEunz" role="3clFbx">
                    <node concept="2Gpval" id="2nJapj3rs0b" role="3cqZAp">
                      <node concept="2GrKxI" id="2nJapj3rs0c" role="2Gsz3X">
                        <property role="TrG5h" value="pointer" />
                      </node>
                      <node concept="2OqwBi" id="2nJapj3rs0d" role="2GsD0m">
                        <node concept="2GrUjf" id="2nJapj3rs0e" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="2nJapj3rrZG" resolve="state" />
                        </node>
                        <node concept="3Tsc0h" id="2nJapj3rs0f" role="2OqNvi">
                          <ref role="3TtcxE" to="f6re:14AbH$uBANN" resolve="listOfNewNodes" />
                        </node>
                      </node>
                      <node concept="3clFbS" id="2nJapj3rs0g" role="2LFqv$">
                        <node concept="3cpWs8" id="2nJapj3rs0h" role="3cqZAp">
                          <node concept="3cpWsn" id="2nJapj3rs0i" role="3cpWs9">
                            <property role="TrG5h" value="dashboardNodePointer" />
                            <node concept="3Tqbb2" id="2nJapj3rs0j" role="1tU5fm">
                              <ref role="ehGHo" to="xwgo:5cR9puhFRx$" resolve="NodePointer" />
                            </node>
                            <node concept="2ShNRf" id="2nJapj3rs0k" role="33vP2m">
                              <node concept="3zrR0B" id="2nJapj3rs0l" role="2ShVmc">
                                <node concept="3Tqbb2" id="2nJapj3rs0m" role="3zrR0E">
                                  <ref role="ehGHo" to="xwgo:5cR9puhFRx$" resolve="NodePointer" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="2nJapj3rs0n" role="3cqZAp">
                          <node concept="37vLTI" id="2nJapj3rs0o" role="3clFbG">
                            <node concept="2OqwBi" id="2nJapj3rs0p" role="37vLTx">
                              <node concept="2GrUjf" id="2nJapj3rs0q" role="2Oq$k0">
                                <ref role="2Gs0qQ" node="2nJapj3rs0c" resolve="pointer" />
                              </node>
                              <node concept="3TrEf2" id="2nJapj3rs0r" role="2OqNvi">
                                <ref role="3Tt5mk" to="f6re:14AbH$uCikH" resolve="conceptToBeCreated" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="2nJapj3rs0s" role="37vLTJ">
                              <node concept="37vLTw" id="2nJapj3rs0t" role="2Oq$k0">
                                <ref role="3cqZAo" node="2nJapj3rs0i" resolve="dashboardNodePointer" />
                              </node>
                              <node concept="3TrEf2" id="2nJapj3rs0u" role="2OqNvi">
                                <ref role="3Tt5mk" to="xwgo:5cR9puhFRx_" resolve="pointer" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="2nJapj3rs0v" role="3cqZAp">
                          <node concept="2OqwBi" id="2nJapj3rs0w" role="3clFbG">
                            <node concept="2OqwBi" id="2nJapj3rs0x" role="2Oq$k0">
                              <node concept="37vLTw" id="2nJapj3rs0y" role="2Oq$k0">
                                <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                              </node>
                              <node concept="3Tsc0h" id="2nJapj3rs0z" role="2OqNvi">
                                <ref role="3TtcxE" to="xwgo:5cR9puhFRxB" resolve="listOfPointer" />
                              </node>
                            </node>
                            <node concept="liA8E" id="2nJapj3rs0$" role="2OqNvi">
                              <ref role="37wK5l" to="33ny:~List.add(java.lang.Object):boolean" resolve="add" />
                              <node concept="37vLTw" id="2nJapj3rs0_" role="37wK5m">
                                <ref role="3cqZAo" node="2nJapj3rs0i" resolve="dashboardNodePointer" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="18xeVvsL3Kc" role="3cqZAp">
                          <node concept="2OqwBi" id="18xeVvsL3VP" role="3clFbG">
                            <node concept="2Sf5sV" id="18xeVvsL3Ka" role="2Oq$k0" />
                            <node concept="2qgKlT" id="18xeVvsL4ha" role="2OqNvi">
                              <ref role="37wK5l" to="21uu:18xeVvsJfYK" resolve="isAlreadyAdded" />
                              <node concept="2OqwBi" id="18xeVvsL4Hb" role="37wK5m">
                                <node concept="37vLTw" id="18xeVvsL4wy" role="2Oq$k0">
                                  <ref role="3cqZAo" node="2nJapj3rs0i" resolve="dashboardNodePointer" />
                                </node>
                                <node concept="3TrEf2" id="18xeVvsL4XL" role="2OqNvi">
                                  <ref role="3Tt5mk" to="xwgo:5cR9puhFRx_" resolve="pointer" />
                                </node>
                              </node>
                              <node concept="10QFUN" id="18xeVvsL7cE" role="37wK5m">
                                <node concept="3uibUv" id="18xeVvsL7lp" role="10QFUM">
                                  <ref role="3uigEE" to="w1kc:~SModelInternal" resolve="SModelInternal" />
                                </node>
                                <node concept="2OqwBi" id="18xeVvsL6nA" role="10QFUP">
                                  <node concept="2YIFZM" id="18xeVvsL69l" role="2Oq$k0">
                                    <ref role="37wK5l" to="w1kc:~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolve="getInstance" />
                                    <ref role="1Pybhc" to="w1kc:~SModelRepository" resolve="SModelRepository" />
                                  </node>
                                  <node concept="liA8E" id="18xeVvsL6RO" role="2OqNvi">
                                    <ref role="37wK5l" to="w1kc:~SModelRepository.getModelDescriptor(java.lang.String):org.jetbrains.mps.openapi.model.SModel" resolve="getModelDescriptor" />
                                    <node concept="37vLTw" id="7tAIZp0f6X_" role="37wK5m">
                                      <ref role="3cqZAo" node="7tAIZp0edJt" resolve="flowModelName" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3clFbF" id="5MdYwHWTXwK" role="3cqZAp">
                          <node concept="2OqwBi" id="5MdYwHWTXN2" role="3clFbG">
                            <node concept="2Sf5sV" id="5MdYwHWTXwI" role="2Oq$k0" />
                            <node concept="2qgKlT" id="5MdYwHWTY8n" role="2OqNvi">
                              <ref role="37wK5l" to="21uu:5MdYwHWTJdG" resolve="fixModuleImports" />
                              <node concept="2OqwBi" id="5MdYwHWTYpd" role="37wK5m">
                                <node concept="37vLTw" id="5MdYwHWTYcw" role="2Oq$k0">
                                  <ref role="3cqZAo" node="2nJapj3rs0i" resolve="dashboardNodePointer" />
                                </node>
                                <node concept="3TrEf2" id="5MdYwHWTYKB" role="2OqNvi">
                                  <ref role="3Tt5mk" to="xwgo:5cR9puhFRx_" resolve="pointer" />
                                </node>
                              </node>
                              <node concept="37vLTw" id="5MdYwHWTYY4" role="37wK5m">
                                <ref role="3cqZAo" node="2nJapj3oVXq" resolve="sourceModule" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="6mLEnnuEzrZ" role="3clFbw">
                    <node concept="2OqwBi" id="6mLEnnuEvPB" role="2Oq$k0">
                      <node concept="2GrUjf" id="6mLEnnuEvxI" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="2nJapj3rrZG" resolve="state" />
                      </node>
                      <node concept="3Tsc0h" id="6mLEnnuEwgc" role="2OqNvi">
                        <ref role="3TtcxE" to="f6re:14AbH$uBANN" resolve="listOfNewNodes" />
                      </node>
                    </node>
                    <node concept="3GX2aA" id="6mLEnnuEAXv" role="2OqNvi" />
                  </node>
                </node>
                <node concept="3clFbF" id="2nJapj3rs0B" role="3cqZAp">
                  <node concept="2OqwBi" id="2nJapj3rs0C" role="3clFbG">
                    <node concept="2OqwBi" id="2nJapj3rs0D" role="2Oq$k0">
                      <node concept="37vLTw" id="2nJapj3rs0E" role="2Oq$k0">
                        <ref role="3cqZAo" node="2nJapj3rrZA" resolve="flow" />
                      </node>
                      <node concept="3Tsc0h" id="2nJapj3rs0F" role="2OqNvi">
                        <ref role="3TtcxE" to="xwgo:5cR9puhFRxd" resolve="stateList" />
                      </node>
                    </node>
                    <node concept="TSZUe" id="2nJapj3rs0G" role="2OqNvi">
                      <node concept="37vLTw" id="2nJapj3rs0H" role="25WWJ7">
                        <ref role="3cqZAo" node="2nJapj3rrZM" resolve="stateDashboard" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="7c_wSf7j0uk" role="3cqZAp" />
            <node concept="3clFbH" id="2nJapj3rs0I" role="3cqZAp" />
            <node concept="3SKdUt" id="7c_wSf79JpY" role="3cqZAp">
              <node concept="3SKdUq" id="7c_wSf79Jq0" role="3SKWNk">
                <property role="3SKdUp" value="now reconnect the dashboard states accordingly" />
              </node>
            </node>
            <node concept="3SKdUt" id="7c_wSf7v88M" role="3cqZAp">
              <node concept="3SKdUq" id="7c_wSf7v88O" role="3SKWNk">
                <property role="3SKdUp" value="add edges for previous states to avoid searching for the predecessor from the top of the tree" />
              </node>
            </node>
            <node concept="3clFbH" id="7c_wSf7egjJ" role="3cqZAp" />
            <node concept="2Gpval" id="7c_wSf7ehjM" role="3cqZAp">
              <node concept="2GrKxI" id="7c_wSf7ehjO" role="2Gsz3X">
                <property role="TrG5h" value="state" />
              </node>
              <node concept="2OqwBi" id="7c_wSf7ehZ1" role="2GsD0m">
                <node concept="2Sf5sV" id="7c_wSf7ehPq" role="2Oq$k0" />
                <node concept="3Tsc0h" id="7c_wSf7ei9Z" role="2OqNvi">
                  <ref role="3TtcxE" to="f6re:4ciHkhthZzO" resolve="stateInstances" />
                </node>
              </node>
              <node concept="3clFbS" id="7c_wSf7ehjS" role="2LFqv$">
                <node concept="2Gpval" id="7c_wSf7eicH" role="3cqZAp">
                  <node concept="2GrKxI" id="7c_wSf7eicI" role="2Gsz3X">
                    <property role="TrG5h" value="oldStatePointer" />
                  </node>
                  <node concept="2OqwBi" id="7c_wSf7eioV" role="2GsD0m">
                    <node concept="2GrUjf" id="7c_wSf7eif8" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="7c_wSf7ehjO" resolve="state" />
                    </node>
                    <node concept="3Tsc0h" id="7c_wSf7eiAh" role="2OqNvi">
                      <ref role="3TtcxE" to="f6re:7c_wSf78lMh" resolve="nextStates" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="7c_wSf7eicK" role="2LFqv$">
                    <node concept="3cpWs8" id="7c_wSf7eiU3" role="3cqZAp">
                      <node concept="3cpWsn" id="7c_wSf7eiU6" role="3cpWs9">
                        <property role="TrG5h" value="nextPointer" />
                        <node concept="3Tqbb2" id="7c_wSf7eiU2" role="1tU5fm">
                          <ref role="ehGHo" to="xwgo:7c_wSf79K0w" resolve="StatePointer" />
                        </node>
                        <node concept="2ShNRf" id="7c_wSf7eiWd" role="33vP2m">
                          <node concept="3zrR0B" id="7c_wSf7eiWb" role="2ShVmc">
                            <node concept="3Tqbb2" id="7c_wSf7eiWc" role="3zrR0E">
                              <ref role="ehGHo" to="xwgo:7c_wSf79K0w" resolve="StatePointer" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbF" id="7c_wSf7eiX2" role="3cqZAp">
                      <node concept="37vLTI" id="7c_wSf7ejV7" role="3clFbG">
                        <node concept="2OqwBi" id="7c_wSf7ennB" role="37vLTx">
                          <node concept="37vLTw" id="7c_wSf7ejZe" role="2Oq$k0">
                            <ref role="3cqZAo" node="7c_wSf79ctR" resolve="stateMap" />
                          </node>
                          <node concept="liA8E" id="7c_wSf7epFA" role="2OqNvi">
                            <ref role="37wK5l" to="33ny:~HashMap.get(java.lang.Object):java.lang.Object" resolve="get" />
                            <node concept="2OqwBi" id="7c_wSf7oge_" role="37wK5m">
                              <node concept="2GrUjf" id="7c_wSf7ofp5" role="2Oq$k0">
                                <ref role="2Gs0qQ" node="7c_wSf7eicI" resolve="oldStatePointer" />
                              </node>
                              <node concept="3TrEf2" id="7c_wSf7oivO" role="2OqNvi">
                                <ref role="3Tt5mk" to="f6re:7c_wSf78lMc" resolve="flowStatePointer" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="2OqwBi" id="7c_wSf7ej7_" role="37vLTJ">
                          <node concept="37vLTw" id="7c_wSf7eiX0" role="2Oq$k0">
                            <ref role="3cqZAo" node="7c_wSf7eiU6" resolve="nextPointer" />
                          </node>
                          <node concept="3TrEf2" id="7c_wSf7ejh0" role="2OqNvi">
                            <ref role="3Tt5mk" to="xwgo:7c_wSf79K0x" resolve="nextStatePointer" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbF" id="MCudDIs5kv" role="3cqZAp">
                      <node concept="37vLTI" id="MCudDIs6gq" role="3clFbG">
                        <node concept="2OqwBi" id="MCudDIs7gQ" role="37vLTx">
                          <node concept="37vLTw" id="MCudDIs6kD" role="2Oq$k0">
                            <ref role="3cqZAo" node="7c_wSf79ctR" resolve="stateMap" />
                          </node>
                          <node concept="liA8E" id="MCudDIs9$X" role="2OqNvi">
                            <ref role="37wK5l" to="33ny:~HashMap.get(java.lang.Object):java.lang.Object" resolve="get" />
                            <node concept="2GrUjf" id="MCudDIs9S4" role="37wK5m">
                              <ref role="2Gs0qQ" node="7c_wSf7ehjO" resolve="state" />
                            </node>
                          </node>
                        </node>
                        <node concept="2OqwBi" id="MCudDIs5DP" role="37vLTJ">
                          <node concept="37vLTw" id="MCudDIs5kt" role="2Oq$k0">
                            <ref role="3cqZAo" node="7c_wSf7eiU6" resolve="nextPointer" />
                          </node>
                          <node concept="3TrEf2" id="MCudDIs5W7" role="2OqNvi">
                            <ref role="3Tt5mk" to="xwgo:MCudDIqX3C" resolve="previousStatePointer" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3cpWs8" id="7c_wSf7vc6D" role="3cqZAp">
                      <node concept="3cpWsn" id="7c_wSf7vc6G" role="3cpWs9">
                        <property role="TrG5h" value="previousPointer" />
                        <node concept="3Tqbb2" id="7c_wSf7vc6B" role="1tU5fm">
                          <ref role="ehGHo" to="xwgo:7c_wSf79K0w" resolve="StatePointer" />
                        </node>
                        <node concept="2ShNRf" id="7c_wSf7vcle" role="33vP2m">
                          <node concept="3zrR0B" id="7c_wSf7vclc" role="2ShVmc">
                            <node concept="3Tqbb2" id="7c_wSf7vcld" role="3zrR0E">
                              <ref role="ehGHo" to="xwgo:7c_wSf79K0w" resolve="StatePointer" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbF" id="7c_wSf7vcyx" role="3cqZAp">
                      <node concept="37vLTI" id="7c_wSf7vdux" role="3clFbG">
                        <node concept="2OqwBi" id="7c_wSf7veki" role="37vLTx">
                          <node concept="37vLTw" id="7c_wSf7vdyK" role="2Oq$k0">
                            <ref role="3cqZAo" node="7c_wSf79ctR" resolve="stateMap" />
                          </node>
                          <node concept="liA8E" id="7c_wSf7vgEa" role="2OqNvi">
                            <ref role="37wK5l" to="33ny:~HashMap.get(java.lang.Object):java.lang.Object" resolve="get" />
                            <node concept="2GrUjf" id="7c_wSf7vgT1" role="37wK5m">
                              <ref role="2Gs0qQ" node="7c_wSf7ehjO" resolve="state" />
                            </node>
                          </node>
                        </node>
                        <node concept="2OqwBi" id="7c_wSf7vcRW" role="37vLTJ">
                          <node concept="37vLTw" id="7c_wSf7vcyv" role="2Oq$k0">
                            <ref role="3cqZAo" node="7c_wSf7vc6G" resolve="previousPointer" />
                          </node>
                          <node concept="3TrEf2" id="7c_wSf7vdae" role="2OqNvi">
                            <ref role="3Tt5mk" to="xwgo:7c_wSf79K0x" resolve="nextStatePointer" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbF" id="7c_wSf7er2Q" role="3cqZAp">
                      <node concept="2OqwBi" id="7c_wSf7ezxA" role="3clFbG">
                        <node concept="2OqwBi" id="7c_wSf7exbf" role="2Oq$k0">
                          <node concept="1PxgMI" id="7c_wSf7ewiE" role="2Oq$k0">
                            <ref role="1m5ApE" to="xwgo:5cR9puhF2lu" resolve="State" />
                            <node concept="2OqwBi" id="7c_wSf7erMQ" role="1m5AlR">
                              <node concept="37vLTw" id="7c_wSf7er2O" role="2Oq$k0">
                                <ref role="3cqZAo" node="7c_wSf79ctR" resolve="stateMap" />
                              </node>
                              <node concept="liA8E" id="7c_wSf7eu3l" role="2OqNvi">
                                <ref role="37wK5l" to="33ny:~HashMap.get(java.lang.Object):java.lang.Object" resolve="get" />
                                <node concept="2GrUjf" id="7c_wSf7eufY" role="37wK5m">
                                  <ref role="2Gs0qQ" node="7c_wSf7ehjO" resolve="state" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3Tsc0h" id="7c_wSf7eB05" role="2OqNvi">
                            <ref role="3TtcxE" to="xwgo:7c_wSf7b_f4" resolve="nextStates" />
                          </node>
                        </node>
                        <node concept="TSZUe" id="7c_wSf7e_CA" role="2OqNvi">
                          <node concept="37vLTw" id="7c_wSf7e_Xv" role="25WWJ7">
                            <ref role="3cqZAo" node="7c_wSf7eiU6" resolve="nextPointer" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbF" id="7c_wSf7vhs3" role="3cqZAp">
                      <node concept="2OqwBi" id="7c_wSf7vmTa" role="3clFbG">
                        <node concept="2OqwBi" id="7c_wSf7vkEb" role="2Oq$k0">
                          <node concept="1PxgMI" id="7c_wSf7vjOb" role="2Oq$k0">
                            <ref role="1m5ApE" to="xwgo:5cR9puhF2lu" resolve="State" />
                            <node concept="2OqwBi" id="7c_wSf7vhs5" role="1m5AlR">
                              <node concept="37vLTw" id="7c_wSf7vhs6" role="2Oq$k0">
                                <ref role="3cqZAo" node="7c_wSf79ctR" resolve="stateMap" />
                              </node>
                              <node concept="liA8E" id="7c_wSf7vhs7" role="2OqNvi">
                                <ref role="37wK5l" to="33ny:~HashMap.get(java.lang.Object):java.lang.Object" resolve="get" />
                                <node concept="2OqwBi" id="7c_wSf7vhs8" role="37wK5m">
                                  <node concept="2GrUjf" id="7c_wSf7vhs9" role="2Oq$k0">
                                    <ref role="2Gs0qQ" node="7c_wSf7eicI" resolve="oldStatePointer" />
                                  </node>
                                  <node concept="3TrEf2" id="7c_wSf7vhsa" role="2OqNvi">
                                    <ref role="3Tt5mk" to="f6re:7c_wSf78lMc" resolve="flowStatePointer" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node concept="3Tsc0h" id="7c_wSf7vllw" role="2OqNvi">
                            <ref role="3TtcxE" to="xwgo:7c_wSf7v6ea" resolve="previousStates" />
                          </node>
                        </node>
                        <node concept="TSZUe" id="7c_wSf7vqwR" role="2OqNvi">
                          <node concept="37vLTw" id="7c_wSf7vqQU" role="25WWJ7">
                            <ref role="3cqZAo" node="7c_wSf7vc6G" resolve="previousPointer" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="7c_wSf79ISV" role="3cqZAp" />
            <node concept="3cpWs8" id="18xeVvsB56E" role="3cqZAp">
              <node concept="3cpWsn" id="18xeVvsB56F" role="3cpWs9">
                <property role="TrG5h" value="createdModel" />
                <node concept="H_c77" id="18xeVvsB56D" role="1tU5fm" />
                <node concept="BaHAS" id="18xeVvsB56G" role="33vP2m">
                  <property role="BaHAW" value="FlowModel" />
                  <property role="BaGAP" value="" />
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="2nJapj3rvL$" role="3cqZAp">
              <node concept="2OqwBi" id="2nJapj3rwnN" role="3clFbG">
                <node concept="37vLTw" id="18xeVvsB6pN" role="2Oq$k0">
                  <ref role="3cqZAo" node="18xeVvsB56F" resolve="createdModel" />
                </node>
                <node concept="3BYIHo" id="18xeVvsB7Nc" role="2OqNvi">
                  <node concept="37vLTw" id="18xeVvsB9f7" role="3BYIHq">
                    <ref role="3cqZAo" node="2nJapj3rrZA" resolve="flow" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="37vLTw" id="2nJapj3qtdW" role="2GsD0m">
            <ref role="3cqZAo" node="2nJapj3qpWq" resolve="modelRoots" />
          </node>
        </node>
        <node concept="3clFbH" id="5fb3TbD_zRN" role="3cqZAp" />
        <node concept="3clFbH" id="18xeVvsHx08" role="3cqZAp" />
        <node concept="3SKdUt" id="5fb3TbD_$f_" role="3cqZAp">
          <node concept="3SKdUq" id="5fb3TbD_$fB" role="3SKWNk">
            <property role="3SKdUp" value="running actual transsformation code generation! TODO" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

