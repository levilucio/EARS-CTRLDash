<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:435ed6e9-67b1-4f10-b199-7bc8391bd027(FlowModel)">
  <persistence version="9" />
  <languages>
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="4" />
    <use id="c020a239-d865-4312-adc3-cb4ab0a7a547" name="org.iets3.process.modelproperty.formulae" version="0" />
    <use id="10211132-9b5e-427a-9b37-1c1f28794a5e" name="org.iets3.process.dashboard" version="0" />
    <use id="3e3749e5-96c0-4132-8c4a-7309a74f9fd6" name="org.iets3.flow.modelproperty.gxw" version="0" />
    <use id="7731a166-da1f-472e-a40a-2283f5e47dc5" name="org.iets3.ears.gxw" version="0" />
  </languages>
  <imports>
    <import index="hxma" ref="r:afc3de6c-6429-4bb9-b26d-918b8ae8822c(org.iets3.flow.modelproperty.gxw.structure)" />
    <import index="q3w4" ref="r:9fc7e752-54e5-497f-97da-8e179a90760e(org.iets3.ears.gxw.structure)" />
  </imports>
  <registry>
    <language id="c020a239-d865-4312-adc3-cb4ab0a7a547" name="org.iets3.process.modelproperty.formulae">
      <concept id="4439542802417923302" name="org.iets3.process.modelproperty.formulae.structure.NotPropertyFormula" flags="ng" index="aRPxe" />
      <concept id="4439542802417923288" name="org.iets3.process.modelproperty.formulae.structure.UnaryPropertyFormula" flags="ng" index="aRPxK">
        <child id="2829711462938969999" name="arg" index="1y4i0q" />
      </concept>
      <concept id="4439542802417923291" name="org.iets3.process.modelproperty.formulae.structure.AndPropertyFormula" flags="ng" index="aRPxN" />
      <concept id="4439542802417923285" name="org.iets3.process.modelproperty.formulae.structure.BinaryPropertyFormula" flags="ng" index="aRPxX">
        <child id="2829711462938969990" name="arg1" index="1y4i0j" />
        <child id="2829711462938969996" name="arg2" index="1y4i0p" />
      </concept>
      <concept id="7571185389806664458" name="org.iets3.process.modelproperty.formulae.structure.AtomicProperty" flags="ng" index="3x7ZJP">
        <child id="3369881559473997964" name="property" index="2DkB7w" />
      </concept>
    </language>
    <language id="10211132-9b5e-427a-9b37-1c1f28794a5e" name="org.iets3.process.dashboard">
      <concept id="8297182490505183264" name="org.iets3.process.dashboard.structure.StatePointer" flags="ng" index="2O0Cez">
        <reference id="8297182490505183265" name="nextStatePointer" index="2O0Cey" />
        <reference id="912111804093288680" name="previousStatePointer" index="1yKUwM" />
      </concept>
      <concept id="4278269416858278656" name="org.iets3.process.dashboard.structure.FlowData" flags="ng" index="Q7yLu">
        <child id="5996302761781590093" name="stateList" index="32A5Rq" />
      </concept>
      <concept id="5996302761781590116" name="org.iets3.process.dashboard.structure.NodePointer" flags="ng" index="32A5RN">
        <reference id="5996302761781590117" name="pointer" index="32A5RM" />
      </concept>
      <concept id="5996302761781372254" name="org.iets3.process.dashboard.structure.State" flags="ng" index="32AK39">
        <property id="8297182490505019797" name="isStart" index="2O0g8m" />
        <property id="8297182490512160219" name="mode" index="2OHfpo" />
        <property id="8297182490513022918" name="isFinal" index="2OILL5" />
        <property id="5996302761781590101" name="text" index="32A5R2" />
        <child id="8297182490505663428" name="nextStates" index="2O2X17" />
        <child id="8297182490510779274" name="previousStates" index="2Omu09" />
        <child id="5996302761781590103" name="formula" index="32A5R0" />
        <child id="5996302761781590119" name="listOfPointer" index="32A5RK" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="Q7yLu" id="3MWlJajwLYE">
    <property role="TrG5h" value="FlowDataRootNode" />
    <node concept="32AK39" id="3MWlJajwLYF" role="32A5Rq">
      <property role="TrG5h" value="GlossaryNotCreated" />
      <property role="32A5R2" value="Glossary is not present for the project. Click here to create a new glossary" />
      <property role="2O0g8m" value="true" />
      <property role="2OILL5" value="false" />
      <property role="2OHfpo" value="0" />
      <node concept="aRPxe" id="3MWlJajwLYG" role="32A5R0">
        <node concept="3x7ZJP" id="3MWlJajwLYH" role="1y4i0q">
          <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          <node concept="35c_gC" id="3MWlJajwLYI" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          </node>
        </node>
      </node>
      <node concept="32A5RN" id="3MWlJajwLYJ" role="32A5RK">
        <ref role="32A5RM" to="q3w4:7vMAitzBZN" resolve="GlossaryChunk" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwLZT" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLYK" resolve="Check for Component in the Glossary" />
        <ref role="1yKUwM" node="3MWlJajwLYF" resolve="GlossaryNotCreated" />
      </node>
    </node>
    <node concept="32AK39" id="3MWlJajwLYK" role="32A5Rq">
      <property role="TrG5h" value="Check for Component in the Glossary" />
      <property role="32A5R2" value="Define at least one component to complete the actuator's definition" />
      <property role="2O0g8m" value="false" />
      <property role="2OILL5" value="false" />
      <property role="2OHfpo" value="1" />
      <node concept="aRPxN" id="3MWlJajwLYL" role="32A5R0">
        <node concept="3x7ZJP" id="3MWlJajwLYM" role="1y4i0j">
          <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          <node concept="35c_gC" id="3MWlJajwLYN" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          </node>
        </node>
        <node concept="aRPxe" id="3MWlJajwLYO" role="1y4i0p">
          <node concept="3x7ZJP" id="3MWlJajwLYP" role="1y4i0q">
            <ref role="35c_gD" to="hxma:5lB8QV$qjWs" resolve="ComponentDefinedProperty" />
            <node concept="35c_gC" id="3MWlJajwLYQ" role="2DkB7w">
              <ref role="35c_gD" to="hxma:5lB8QV$qjWs" resolve="ComponentDefinedProperty" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2O0Cez" id="3MWlJajwLZU" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLYF" resolve="GlossaryNotCreated" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwLZV" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLYR" resolve="Check for actuator definition in glossary" />
        <ref role="1yKUwM" node="3MWlJajwLYK" resolve="Check for Component in the Glossary" />
      </node>
    </node>
    <node concept="32AK39" id="3MWlJajwLYR" role="32A5Rq">
      <property role="TrG5h" value="Check for actuator definition in glossary" />
      <property role="32A5R2" value="Complete at least one actuator definition to start writing requirements" />
      <property role="2O0g8m" value="false" />
      <property role="2OILL5" value="false" />
      <property role="2OHfpo" value="2" />
      <node concept="aRPxN" id="3MWlJajwLYS" role="32A5R0">
        <node concept="3x7ZJP" id="3MWlJajwLYT" role="1y4i0j">
          <ref role="35c_gD" to="hxma:5lB8QV$qjWs" resolve="ComponentDefinedProperty" />
          <node concept="35c_gC" id="3MWlJajwLYU" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$qjWs" resolve="ComponentDefinedProperty" />
          </node>
        </node>
        <node concept="aRPxe" id="3MWlJajwLYV" role="1y4i0p">
          <node concept="3x7ZJP" id="3MWlJajwLYW" role="1y4i0q">
            <ref role="35c_gD" to="hxma:5lB8QV$yOe2" resolve="ActuatorDefinedProperty" />
            <node concept="35c_gC" id="3MWlJajwLYX" role="2DkB7w">
              <ref role="35c_gD" to="hxma:5lB8QV$yOe2" resolve="ActuatorDefinedProperty" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2O0Cez" id="3MWlJajwLZW" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLYK" resolve="Check for Component in the Glossary" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwLZX" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLYY" resolve="Check for glossary completenesss" />
        <ref role="1yKUwM" node="3MWlJajwLYR" resolve="Check for actuator definition in glossary" />
      </node>
    </node>
    <node concept="32AK39" id="3MWlJajwLYY" role="32A5Rq">
      <property role="TrG5h" value="Check for glossary completenesss" />
      <property role="32A5R2" value="You can now start adding EARS requirements. Click here to create a requirements holder" />
      <property role="2O0g8m" value="false" />
      <property role="2OILL5" value="false" />
      <property role="2OHfpo" value="2" />
      <node concept="aRPxN" id="3MWlJajwLYZ" role="32A5R0">
        <node concept="3x7ZJP" id="3MWlJajwLZ0" role="1y4i0j">
          <ref role="35c_gD" to="hxma:5lB8QV$yOe2" resolve="ActuatorDefinedProperty" />
          <node concept="35c_gC" id="3MWlJajwLZ1" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$yOe2" resolve="ActuatorDefinedProperty" />
          </node>
        </node>
        <node concept="3x7ZJP" id="3MWlJajwLZ2" role="1y4i0p">
          <ref role="35c_gD" to="hxma:5lB8QV$qjWs" resolve="ComponentDefinedProperty" />
          <node concept="35c_gC" id="3MWlJajwLZ3" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$qjWs" resolve="ComponentDefinedProperty" />
          </node>
        </node>
      </node>
      <node concept="32A5RN" id="3MWlJajwLZ4" role="32A5RK">
        <ref role="32A5RM" to="q3w4:5QnDqxDaSpr" resolve="RequirementChunk" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwLZY" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLYR" resolve="Check for actuator definition in glossary" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwLZZ" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLZF" resolve="Requirement not realizable with uncovered glossary terms" />
        <ref role="1yKUwM" node="3MWlJajwLYY" resolve="Check for glossary completenesss" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwM01" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLZ5" resolve="Requirement realizable with uncovered glossary terms" />
        <ref role="1yKUwM" node="3MWlJajwLYY" resolve="Check for glossary completenesss" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwM03" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLZi" resolve="Requirement not realizable with covered glossary terms" />
        <ref role="1yKUwM" node="3MWlJajwLYY" resolve="Check for glossary completenesss" />
      </node>
    </node>
    <node concept="32AK39" id="3MWlJajwLZ5" role="32A5Rq">
      <property role="TrG5h" value="Requirement realizable with uncovered glossary terms" />
      <property role="32A5R2" value="Requirements are realizable but not all glossary items are covered" />
      <property role="2O0g8m" value="false" />
      <property role="2OILL5" value="false" />
      <property role="2OHfpo" value="2" />
      <node concept="aRPxN" id="3MWlJajwLZ6" role="32A5R0">
        <node concept="3x7ZJP" id="3MWlJajwLZ7" role="1y4i0j">
          <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          <node concept="35c_gC" id="3MWlJajwLZ8" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          </node>
        </node>
        <node concept="aRPxN" id="3MWlJajwLZ9" role="1y4i0p">
          <node concept="3x7ZJP" id="3MWlJajwLZa" role="1y4i0j">
            <ref role="35c_gD" to="hxma:5lB8QV$pZcv" resolve="RequirementChunkPresentProperty" />
            <node concept="35c_gC" id="3MWlJajwLZb" role="2DkB7w">
              <ref role="35c_gD" to="hxma:5lB8QV$pZcv" resolve="RequirementChunkPresentProperty" />
            </node>
          </node>
          <node concept="aRPxN" id="3MWlJajwLZc" role="1y4i0p">
            <node concept="3x7ZJP" id="3MWlJajwLZd" role="1y4i0j">
              <ref role="35c_gD" to="hxma:4MKUcPlSDcn" resolve="RequirementRealizable" />
              <node concept="35c_gC" id="3MWlJajwLZe" role="2DkB7w">
                <ref role="35c_gD" to="hxma:4MKUcPlSDcn" resolve="RequirementRealizable" />
              </node>
            </node>
            <node concept="aRPxe" id="3MWlJajwLZf" role="1y4i0p">
              <node concept="3x7ZJP" id="3MWlJajwLZg" role="1y4i0q">
                <ref role="35c_gD" to="hxma:p7uByp2AFH" resolve="AllGlossaryTermsUsed" />
                <node concept="35c_gC" id="3MWlJajwLZh" role="2DkB7w">
                  <ref role="35c_gD" to="hxma:p7uByp2AFH" resolve="AllGlossaryTermsUsed" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2O0Cez" id="3MWlJajwM02" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLYY" resolve="Check for glossary completenesss" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwM05" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLZv" resolve="Requirement realizable with covered glossary terms" />
        <ref role="1yKUwM" node="3MWlJajwLZ5" resolve="Requirement realizable with uncovered glossary terms" />
      </node>
    </node>
    <node concept="32AK39" id="3MWlJajwLZi" role="32A5Rq">
      <property role="TrG5h" value="Requirement not realizable with covered glossary terms" />
      <property role="32A5R2" value="All glossary items are covered but the requirements are not realizable" />
      <property role="2O0g8m" value="false" />
      <property role="2OILL5" value="false" />
      <property role="2OHfpo" value="2" />
      <node concept="aRPxN" id="3MWlJajwLZj" role="32A5R0">
        <node concept="3x7ZJP" id="3MWlJajwLZk" role="1y4i0j">
          <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          <node concept="35c_gC" id="3MWlJajwLZl" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          </node>
        </node>
        <node concept="aRPxN" id="3MWlJajwLZm" role="1y4i0p">
          <node concept="3x7ZJP" id="3MWlJajwLZn" role="1y4i0j">
            <ref role="35c_gD" to="hxma:5lB8QV$pZcv" resolve="RequirementChunkPresentProperty" />
            <node concept="35c_gC" id="3MWlJajwLZo" role="2DkB7w">
              <ref role="35c_gD" to="hxma:5lB8QV$pZcv" resolve="RequirementChunkPresentProperty" />
            </node>
          </node>
          <node concept="aRPxN" id="3MWlJajwLZp" role="1y4i0p">
            <node concept="3x7ZJP" id="3MWlJajwLZq" role="1y4i0p">
              <ref role="35c_gD" to="hxma:p7uByp2AFH" resolve="AllGlossaryTermsUsed" />
              <node concept="35c_gC" id="3MWlJajwLZr" role="2DkB7w">
                <ref role="35c_gD" to="hxma:p7uByp2AFH" resolve="AllGlossaryTermsUsed" />
              </node>
            </node>
            <node concept="aRPxe" id="3MWlJajwLZs" role="1y4i0j">
              <node concept="3x7ZJP" id="3MWlJajwLZt" role="1y4i0q">
                <ref role="35c_gD" to="hxma:4MKUcPlSDcn" resolve="RequirementRealizable" />
                <node concept="35c_gC" id="3MWlJajwLZu" role="2DkB7w">
                  <ref role="35c_gD" to="hxma:4MKUcPlSDcn" resolve="RequirementRealizable" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2O0Cez" id="3MWlJajwM04" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLYY" resolve="Check for glossary completenesss" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwM07" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLZv" resolve="Requirement realizable with covered glossary terms" />
        <ref role="1yKUwM" node="3MWlJajwLZi" resolve="Requirement not realizable with covered glossary terms" />
      </node>
    </node>
    <node concept="32AK39" id="3MWlJajwLZv" role="32A5Rq">
      <property role="TrG5h" value="Requirement realizable with covered glossary terms" />
      <property role="32A5R2" value="The requirements are realizable and all glossary items are covered" />
      <property role="2O0g8m" value="false" />
      <property role="2OILL5" value="true" />
      <property role="2OHfpo" value="2" />
      <node concept="aRPxN" id="3MWlJajwLZw" role="32A5R0">
        <node concept="3x7ZJP" id="3MWlJajwLZx" role="1y4i0j">
          <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          <node concept="35c_gC" id="3MWlJajwLZy" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          </node>
        </node>
        <node concept="aRPxN" id="3MWlJajwLZz" role="1y4i0p">
          <node concept="3x7ZJP" id="3MWlJajwLZ$" role="1y4i0j">
            <ref role="35c_gD" to="hxma:5lB8QV$pZcv" resolve="RequirementChunkPresentProperty" />
            <node concept="35c_gC" id="3MWlJajwLZ_" role="2DkB7w">
              <ref role="35c_gD" to="hxma:5lB8QV$pZcv" resolve="RequirementChunkPresentProperty" />
            </node>
          </node>
          <node concept="aRPxN" id="3MWlJajwLZA" role="1y4i0p">
            <node concept="3x7ZJP" id="3MWlJajwLZB" role="1y4i0j">
              <ref role="35c_gD" to="hxma:4MKUcPlSDcn" resolve="RequirementRealizable" />
              <node concept="35c_gC" id="3MWlJajwLZC" role="2DkB7w">
                <ref role="35c_gD" to="hxma:4MKUcPlSDcn" resolve="RequirementRealizable" />
              </node>
            </node>
            <node concept="3x7ZJP" id="3MWlJajwLZD" role="1y4i0p">
              <ref role="35c_gD" to="hxma:p7uByp2AFH" resolve="AllGlossaryTermsUsed" />
              <node concept="35c_gC" id="3MWlJajwLZE" role="2DkB7w">
                <ref role="35c_gD" to="hxma:p7uByp2AFH" resolve="AllGlossaryTermsUsed" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2O0Cez" id="3MWlJajwM06" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLZ5" resolve="Requirement realizable with uncovered glossary terms" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwM08" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLZi" resolve="Requirement not realizable with covered glossary terms" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwM0a" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLZF" resolve="Requirement not realizable with uncovered glossary terms" />
      </node>
    </node>
    <node concept="32AK39" id="3MWlJajwLZF" role="32A5Rq">
      <property role="TrG5h" value="Requirement not realizable with uncovered glossary terms" />
      <property role="32A5R2" value="The requirements are not realizable and not all glossary items are covered" />
      <property role="2O0g8m" value="false" />
      <property role="2OILL5" value="false" />
      <property role="2OHfpo" value="2" />
      <node concept="aRPxN" id="3MWlJajwLZG" role="32A5R0">
        <node concept="3x7ZJP" id="3MWlJajwLZH" role="1y4i0j">
          <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          <node concept="35c_gC" id="3MWlJajwLZI" role="2DkB7w">
            <ref role="35c_gD" to="hxma:5lB8QV$fOGJ" resolve="GLossaryisCreatedProperty" />
          </node>
        </node>
        <node concept="aRPxN" id="3MWlJajwLZJ" role="1y4i0p">
          <node concept="3x7ZJP" id="3MWlJajwLZK" role="1y4i0j">
            <ref role="35c_gD" to="hxma:5lB8QV$pZcv" resolve="RequirementChunkPresentProperty" />
            <node concept="35c_gC" id="3MWlJajwLZL" role="2DkB7w">
              <ref role="35c_gD" to="hxma:5lB8QV$pZcv" resolve="RequirementChunkPresentProperty" />
            </node>
          </node>
          <node concept="aRPxN" id="3MWlJajwLZM" role="1y4i0p">
            <node concept="aRPxe" id="3MWlJajwLZN" role="1y4i0j">
              <node concept="3x7ZJP" id="3MWlJajwLZO" role="1y4i0q">
                <ref role="35c_gD" to="hxma:4MKUcPlSDcn" resolve="RequirementRealizable" />
                <node concept="35c_gC" id="3MWlJajwLZP" role="2DkB7w">
                  <ref role="35c_gD" to="hxma:4MKUcPlSDcn" resolve="RequirementRealizable" />
                </node>
              </node>
            </node>
            <node concept="aRPxe" id="3MWlJajwLZQ" role="1y4i0p">
              <node concept="3x7ZJP" id="3MWlJajwLZR" role="1y4i0q">
                <ref role="35c_gD" to="hxma:p7uByp2AFH" resolve="AllGlossaryTermsUsed" />
                <node concept="35c_gC" id="3MWlJajwLZS" role="2DkB7w">
                  <ref role="35c_gD" to="hxma:p7uByp2AFH" resolve="AllGlossaryTermsUsed" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2O0Cez" id="3MWlJajwM00" role="2Omu09">
        <ref role="2O0Cey" node="3MWlJajwLYY" resolve="Check for glossary completenesss" />
      </node>
      <node concept="2O0Cez" id="3MWlJajwM09" role="2O2X17">
        <ref role="2O0Cey" node="3MWlJajwLZv" resolve="Requirement realizable with covered glossary terms" />
        <ref role="1yKUwM" node="3MWlJajwLZF" resolve="Requirement not realizable with uncovered glossary terms" />
      </node>
    </node>
  </node>
</model>

