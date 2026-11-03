package com.aspose.slides;

class s6b extends r6o<Presentation> {
   public s6b(TemplateContext<Presentation> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Presentation var1 = this.u3().getObject();
      String var2 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.n3.l6(this.u3().getGlobal().<Boolean>get("animateTransitions")));
      String var3 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.n3.l6(this.u3().getGlobal().<Boolean>get("animateShapes")));
      int var4 = var1.getSlides().size();
      String var5 = f7i.n5(((SlideSize)var1.getSlideSize()).n5().l6());
      String var6 = f7i.n5(((SlideSize)var1.getSlideSize()).n5().k5());
      this.l6("\r\n\r\nvar currentVisiblePage = 1;\r\nvar maxVisiblePage = ");
      this.n5(var4);
      this.l6(";\r\nvar frameWidth = ");
      this.k5(var5);
      this.l6(";\r\nvar frameHeight = ");
      this.k5(var6);
      this.l6(
         ";\r\nvar polygonsCache = {};\r\nvar animationsCache = {};\r\nvar animations = {};\r\nvar prevAnimations = {};\r\nvar shapeAnimationsIndices = {};\r\nvar noAnimationSlideClick = false;\r\nvar autoStartAnimationsAwaitingUserGesture = false;\nvar clipContentCache = {};\r\n\r\nvar timelineBarsCache = {};\nvar timelinePolysCache = {};\nvar exitTimelineIterationCounter = {};\nvar transitionTargetSlideAnimationsState = 'next';\n\r\n$(document).ready(function(){\r\n      \r\n    if ("
      );
      this.k5(var2);
      this.l6(
         ") {\r\n        InitTransitions();\r\n    }\r\n});\r\n\r\nfunction InitTransitions() {\n    PrepareAndPlayTransition('#slide-1', null, 'next');\n    \n    $('#PrevSlide').show();\n    $('#NextSlide').show();\n      \n    $(\"#PrevSlide\").click(function(){ PlayPreviousAnimationsForTarget('slide'); });\n    $(\"#NextSlide\").click(function(){ PlayNextAnimationsForTarget('slide'); });\n}\n\r\nfunction PrepareAndPlayTransition(slideId, prevSlideId, targetSlideAnimationsState) {\n    transitionTargetSlideAnimationsState = targetSlideAnimationsState || 'next';\n    \n    AnimateShapes(slideId);\n    setTimeout(function() { PlayTransition(slideId, prevSlideId);}, 10); // fix for starting slide animation (browser needs some time to cacth up after js performance demanging generating operations)\n}\n\r\nfunction PlayTransition(slideId, prevSlideId) {\r\n    console.log('move from ' + prevSlideId + ' to ' + slideId);\r\n    PlayTransitionBegin();\r\n\r\n    var slide = $(slideId);\r\n    var transitionType = slide.data('transitionType');\r\n    var direction = sli"
      );
      this.l6(
         "de.data(\"transitionDirection\");\r\n    \r\n    ResetAnimationProperties();\r\n    \r\n    // assertions on the start of the transition:\r\n    //   prevSlide is visible\r\n    //   slide is hidden\r\n    if(transitionType === 'Fade') {\r\n        Fade(slideId, prevSlideId); \r\n    } else if(transitionType === 'Push' || transitionType === 'Pan') {\r\n        PushPan(slideId, prevSlideId, transitionType);\r\n    } else if(transitionType === 'Pull') {\r\n        Pull(slideId, prevSlideId);\r\n    } else if(transitionType === 'Cover') {\r\n        Cover(slideId, prevSlideId);\r\n    } else if(transitionType === 'RandomBar') {\r\n        RandomBar(slideId, prevSlideId);\r\n    } else if(transitionType === 'Flash') {\r\n        Flash(slideId, prevSlideId);\r\n    } else if(transitionType === 'Wheel' || transitionType === 'WheelReverse' || transitionType === 'Wedge') {\r\n        Wheel(slideId, prevSlideId, transitionType);\r\n    } else if(transitionType === 'Dissolve') {\r\n        Dissolve(slideId, prevSlideId);\r\n    } else if(transitionType === 'Circle' "
      );
      this.l6(
         "|| transitionType === 'Diamond' || transitionType === 'Plus') {\r\n        Shape(slideId, prevSlideId, transitionType);\r\n    } else if(transitionType === 'Zoom') {\r\n        Shape(slideId, prevSlideId, transitionType + direction);\r\n    } else if(transitionType === 'Split') {\r\n        Split(slideId, prevSlideId);\r\n    } else if(transitionType === 'Wipe') {\r\n        Wipe(slideId, prevSlideId);\r\n    } else if(transitionType === 'Cube' || transitionType === 'Box' || transitionType === 'Rotate' || transitionType === 'Orbit') {\r\n        CubeBoxRotateOrbit(slideId, prevSlideId, transitionType);\r\n    } else if(transitionType === 'Gallery' || transitionType === 'Conveyor') {\r\n        GalleryConveyor(slideId, prevSlideId, transitionType);\r\n    } else if(transitionType === 'Flip') {\r\n        Flip(slideId, prevSlideId);\r\n    } else if(transitionType === 'Flythrough' || transitionType === 'Warp') {\r\n        FlythroughWarp(slideId, prevSlideId, transitionType);\r\n    } else if(transitionType === 'Switch') {\r\n        Switch(sli"
      );
      this.l6(
         "deId, prevSlideId);\r\n    } else if(transitionType === 'Reveal') {\r\n        Reveal(slideId, prevSlideId);\r\n    } else if(transitionType === 'Ferris') {\r\n        Ferris(slideId, prevSlideId);\r\n    } else if(transitionType === 'Honeycomb') {\r\n        Honeycomb(slideId, prevSlideId);\r\n    } else if(transitionType === 'Comb') {\r\n        Comb(slideId, prevSlideId);\r\n    } else {\r\n        $(prevSlideId).hide();\r\n        $(slideId).show();\r\n        PlayTransitionEnd();\r\n    }\r\n}\r\n\r\nfunction AnimateShapes(slideId) {\r\n    if ("
      );
      this.k5(var3);
      this.l6(
         ") {\r\n        // saving animations for previous slide (we need to restore them when this slide appears)\r\n        prevAnimations = animations;\r\n        animations = animationsCache[slideId];\r\n        \r\n        if (animations == null) {\r\n            // prepare animations for this slide\r\n            animations = {};\r\n            FillSlideShapeAnimations(slideId);\r\n            ConfigureSpinEffects(animations);\n            animationsCache[slideId] = animations;\r\n        }\r\n        \r\n        PrepareAllEffects(animations);\r\n        \r\n        shapeAnimationsIndices = {};\r\n        for (var targetShape in animations)\r\n            shapeAnimationsIndices[targetShape] = -1;\r\n        \r\n        noAnimationSlideClick = false;\r\n        autoStartAnimationsAwaitingUserGesture = false;\n        \r\n        for (var targetShape in animations) {\r\n            if (targetShape != 'slide') {\r\n                $('#' + targetShape).unbind();\r\n                $('#' + targetShape).click({targetShape: targetShape}, function(e){ PlayNextAnimatio"
      );
      this.l6(
         "nsForTarget(e.data.targetShape); e.stopPropagation(); });\r\n                $('#' + targetShape).css('cursor', 'pointer');\r\n            }\r\n        }\r\n        \r\n        $(slideId).unbind();\r\n        $(slideId).click(function(){ PlayNextAnimationsForTarget('slide'); });\r\n    }\r\n}\r\n\r\n\r\nfunction PlayTransitionBegin() {\n    $(\"#PrevSlide\").prop('disabled',true);\n    $(\"#NextSlide\").prop('disabled',true);\n    \r\n    ChangeThumbSelection(currentVisiblePage);\r\n    RemoveThumbnailClickHandler();\r\n}\nfunction PlayTransitionEnd() {\n    if ("
      );
      this.k5(var3);
      this.l6(
         ") {\n        RestoreAllEffects(prevAnimations);\n        if (transitionTargetSlideAnimationsState == 'all') {\n            FinishAnimationsForTarget('slide');\n        }\n        else if (HasAutoStartAnimations()) {\n            autoStartAnimationsAwaitingUserGesture = true;\n            UpdateNavigationButtonsState();\n        }\n        else {\n            PlayNextAnimationsForTarget('slide', false);\n        }\n    }\n    else {\n        UpdateNavigationButtonsState();\n    }\n    \n    SetThumbnailClickHandler();\n}\nfunction UpdateNavigationButtonsState() {\n    var canGoPrev = currentVisiblePage != 1;\n    var canGoNext = currentVisiblePage != maxVisiblePage;\n    var slideAnimationIndex = shapeAnimationsIndices['slide'];\n    var nextSlideAnimationIndex = GetNextPlayableAnimationIndex('slide', slideAnimationIndex == null ? 0 : slideAnimationIndex + 1);\n    if (slideAnimationIndex != null && slideAnimationIndex >= 0) {\n        canGoPrev = true;\n    }\n    if (nextSlideAnimationIndex >= 0 && animations['slide'] != null && ne"
      );
      this.l6("xtSlideAnimationIndex < animations['slide'].length) {");
      this.n5("canGoNext", "\n        canGoNext =", 7622, "", 7642, 0);
      this.a6();
      this.l6(
         " true;\n    }\n    $(\"#PrevSlide\").prop('disabled', !canGoPrev);\n    $(\"#NextSlide\").prop('disabled', !canGoNext);\n}\n\r\nfunction ResetAnimationProperties() {\r\n    $(\".slide\").css(\"z-index\", '');\r\n    $(\".slide-content\").css('transform', '');\r\n    $(\".slide-content\").css('position', '');\r\n    $(\".slide-content\").css('top', '');\r\n}\r\n\r\nfunction FillSlideShapeAnimations(slideId) {\n    \n    var slide = $(slideId);\n    \n    slide.find('[data-animation-type!=\"\"], [data-animation-count]').each(function(){ \n        var animationCount = parseInt($(this).attr(\"data-animation-count\"));\n        if (isNaN(animationCount) || animationCount <= 0) {\n            animationCount = 1;\n        }\n        for (var i = 0; i < animationCount; i++) {\n            var"
      );
      this.n5("attrSuffix", " attrSuffix =", 8390, "", 8403, 0);
      this.a6();
      this.l6(
         " animationCount > 1 ? '-' + i : '';\n            var clickTarget = $(this).attr(\"data-animation-clickTarget\" + attrSuffix);\n            if (clickTarget == null && animationCount == 1) {\n                clickTarget = $(this).attr(\"data-animation-clickTarget\");\n            }\n            if (clickTarget != null) {\n                if (animations[clickTarget] == null) {\n                    animations[clickTarget] = [];\n                    shapeAnimationsIndices[clickTarget] = -1;\n                }\n                var animationIndex = parseInt($(this).attr(\"data-animation-index\" + attrSuffix));\n                while (animations[clickTarget].length <= animationIndex)\n                    animations[clickTarget].push([]);\n                animations[clickTarget][animationIndex].push(GetAnimationEffectWithSound(\n                    $(this).attr(\"data-animation-type\" + attrSuffix),\n                    $(this).attr(\"data-animation-subtype\" + attrSuffix),\n                    '#' + this.id,\n                    $(this).att"
      );
      this.l6(
         "r(\"data-animation-duration\" + attrSuffix),\n                    $(this).attr(\"data-animation-delay\" + attrSuffix),\n                    $(this).attr(\"data-animation-extra\" + attrSuffix),\n                    $(this).attr(\"data-animation-sound\" + attrSuffix),\n                    $(this).attr(\"data-animation-repeat\" + attrSuffix),\n                    $(this).attr(\"data-animation-auto-reverse\" + attrSuffix)));\n            }\n        }\n    });\n}\n\r\nfunction GetSlideAnimatedShapesId(slideId) {\r\n    var slide = $(slideId);\r\n    \r\n    var animatedShapesId = [];\r\n    slide.find('[data-animation-type!=\"\"], [data-animation-count]').each(function(){ animatedShapesId.push('#' + this.id); });\n    return animatedShapesId;\n}\n\r\nfunction CreateAnimationEffects(animatedShapesId) {\r\n    \r\n    var result = [];\r\n    for (var i = 0; i < animatedShapesId.length; i++) {\r\n        result.push(GetAnimationEffectWithSound($(animatedShapesId[i]).data(\"animation-type\"), $(animatedShapesId[i]).data(\"animation-subtype\"),animatedShapesId[i], $(an"
      );
      this.l6(
         "imatedShapesId[i]).data(\"animation-duration\"), $(animatedShapesId[i]).data(\"animation-delay\"), $(animatedShapesId[i]).data(\"animation-extra\"), $(animatedShapesId[i]).data(\"animation-sound\"), $(animatedShapesId[i]).data(\"animation-repeat\"), $(animatedShapesId[i]).data(\"animation-auto-reverse\")));\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction HasAutoStartAnimations() {\n    return animations['slide']"
      );
      this.n5("!", " !=", 10852, "", 10855, 0);
      this.a6();
      this.l6(" null && !IsEmptyAnimationStep('slide', 0);\n}\n\nfunction ConfigureSpinEffects(animations) {\n    var");
      this.n5("spinStates", " spinStates =", 10953, "", 10966, 0);
      this.a6();
      this.l6(" {};\n    for (var targetShape in animations) {\n        for (var");
      this.n5("animationIndex", " animationIndex =", 11029, "", 11046, 0);
      this.a6();
      this.l6(" 0; animationIndex < animations[targetShape].length; animationIndex++) {\n            var");
      this.n5("effects", " effects =", 11134, "", 11144, 0);
      this.a6();
      this.l6(" animations[targetShape][animationIndex];\n            for (var");
      this.n5("effectIndex", " effectIndex =", 11206, "", 11220, 0);
      this.a6();
      this.l6(" 0; effectIndex < effects.length; effectIndex++) {\n                var");
      this.n5("effect", " effect =", 11290, "", 11299, 0);
      this.a6();
      this.l6(" effects[effectIndex];\n                if (!(effect instanceof EmphasisSpinEffect))\n                    continue;\n                var");
      this.n5("state", " state =", 11432, "", 11440, 0);
      this.a6();
      this.l6(" spinStates[effect.shapeId];\n                if");
      this.n5("(state", " (state =", 11487, "", 11496, 0);
      this.a6();
      this.l6(
         "= null) {\n                    var element = $(effect.shapeId)[0];\n                    state = { angle: GetElementRotationAngle(element) };\n                    spinStates[effect.shapeId] = state;\n                }\n                var rotation = parseFloat(effect.extra);\n                if (isNaN(rotation))\n                    continue;\n                effect.startAngle = state.angle;\n                effect.endAngle = state.angle + rotation;\n                state.angle = effect.endAngle;\n            }\n        }\n    }\n}\nfunction GetAnimationEffectWithSound(type, subtype, shapeId, duration, delay, extra, sound, repeatCount, autoReverse) {\n    var effect = GetAnimationEffect(type, subtype, shapeId, duration, delay, extra);\n    effect.sound = sound;\n    effect.soundDelay = parseFloat(delay) * 1000;\n    effect.repeatCount = parseFloat(repeatCount);\n    effect.autoReverse = autoReverse === true || autoReverse === 'true';\n    return effect;\n}\nfunction PlayEffectSound(sound, delay) {\n    if (sound == null || sound ="
      );
      this.l6(
         "== '')\n        return;\n    window.setTimeout(function() {\n        var audio = new Audio(sound);\n        var playback = audio.play();\n        if (playback != null)\n            playback.catch(function() {});\n    }, isNaN(delay) ? 0 : delay);\n}\nfunction PauseAllEffects(animations) {\n    for (var targetShape in animations) {\r\n        for(var i = 0; i < animations[targetShape].length; i++) {\r\n            PauseEffectsTimeline(animations[targetShape][i]);\r\n        }\r\n    }\r\n}\r\n\r\nfunction RestoreAllEffects(animations) {\r\n    for (var targetShape in animations) {\r\n        for(var"
      );
      this.n5("i", " i =", 13099, "", 13103, 0);
      this.a6();
      this.l6(
         " 0; i < animations[targetShape].length; i++) {\r\n            RestoreEffectsTimeline(animations[targetShape][i]);\r\n        }\r\n    }\r\n}\r\n\r\nfunction ResetAnimationIndicies() {\r\n    for (var targetShape in shapeAnimationsIndices)"
      );
      this.n5("shapeAnimationsIndices[targetShape]", "\r\n        shapeAnimationsIndices[targetShape] =", 13327, "", 13374, 0);
      this.a6();
      this.l6(" -1;\r\n}\r\n\r\nfunction PrepareAllEffects(animations) {\r\n    for (var targetShape in animations) {\r\n        for(var");
      this.n5("i", " i =", 13485, "", 13489, 0);
      this.a6();
      this.l6(
         " 0; i < animations[targetShape].length; i++) {\r\n            PrepareEffectsTimeline(animations[targetShape][i]);\r\n        }\r\n    }\r\n}\r\n\r\nfunction PlayNextAnimationsForTarget(target, skipEmptySteps) {\n    if"
      );
      this.n5("(target", " (target =", 13694, "", 13704, 0);
      this.a6();
      this.l6(
         "= 'slide' && autoStartAnimationsAwaitingUserGesture)\n        autoStartAnimationsAwaitingUserGesture = false;\n    \n    if (animations[target] != null) {\n    \n        if (skipEmptySteps == null) {\n            skipEmptySteps = true;\n        }\n        var index = shapeAnimationsIndices[target] + 1;\n        if (skipEmptySteps) {\n            index = GetNextPlayableAnimationIndex(target, index);\n        }\n        \n        if (index >= animations[target].length) {\n            if (target == 'slide' && shapeAnimationsIndices[target] != -1) {\n                ShowNext();\n                return;\n            }\n            index = GetFirstPlayableAnimationIndex(target);\n            if (index == -1) {\n                return;\n            }\n        }\n        if (target == 'slide' && index == 0 && shapeAnimationsIndices[target] != -1) {\n            ShowNext();\n            return;\n        }\n            \r\n        if (shapeAnimationsIndices[target] != -1) {\n            if (index > 0) {\n                FinishEffectsTimeline(anim"
      );
      this.l6(
         "ations[target][index - 1]);\n            }\n            else {\n                FinishEffectsTimeline(animations[target][animations[target].length - 1]);\n            }\n        }\n        \n        shapeAnimationsIndices[target] = index;\n        RestoreEffectsTimeline(animations[target][index]);\n        PrepareEffectsTimeline(animations[target][index]);\n        \n        PlayEffectsTimeline(animations[target][index]);\n        UpdateNavigationButtonsState();\n    }\n    else if (target == 'slide')\n    {\n        if (!noAnimationSlideClick)\n            noAnimationSlideClick = true;\n        else\r\n            ShowNext();\r\n    }\n}\nfunction PlayPreviousAnimationsForTarget(target) {\n    if (animations[target] != null) {\n        var index = shapeAnimationsIndices[target];\n        if (index == -1) {\n            if (target == 'slide') {\n                ShowPrev();\n            }\n            return;\n        }\n        index = GetPreviousPlayableAnimationIndex(target, index - 1);\n        RestoreAnimationsForTarget(target, index)"
      );
      this.l6(
         ";\n        shapeAnimationsIndices[target] = index;\n        UpdateNavigationButtonsState();\n    }\n    else if (target == 'slide')\n    {\n        ShowPrev();\n    }\n}\nfunction RestoreAnimationsForTarget(target, completedIndex) {\n    if (animations[target] == null) {\n        return;\n    }\n    for (var i = 0; i < animations[target].length; i++) {\n        RestoreEffectsTimeline(animations[target][i]);\n    }\n    for (var"
      );
      this.n5("i", " i =", 16170, "", 16174, 0);
      this.a6();
      this.l6(" 0; i < animations[target].length; i++) {\n        PrepareEffectsTimeline(animations[target][i]);\n    }\n\n    for (var");
      this.n5("i", " i =", 16290, "", 16294, 0);
      this.a6();
      this.l6(
         " 0; i <= completedIndex; i++) {\n        RestartEffectsTimeline(animations[target][i]);\n        PauseEffectsTimeline(animations[target][i]);\n        FinishEffectsTimeline(animations[target][i]);\n    }\n}\nfunction FinishAnimationsForTarget(target) {\n    var lastIndex = GetLastPlayableAnimationIndex(target);\n    if (lastIndex == -1) {\n        UpdateNavigationButtonsState();\n        return;\n    }\n    RestoreAnimationsForTarget(target, lastIndex);\n    shapeAnimationsIndices[target] = lastIndex;\n    UpdateNavigationButtonsState();\n}\nfunction IsEmptyAnimationStep(target, index) {\n    return animations[target][index] == null || animations[target][index].length == 0;\n}\nfunction GetFirstPlayableAnimationIndex(target) {\n    return GetNextPlayableAnimationIndex(target, 0);\n}\nfunction GetLastPlayableAnimationIndex(target) {\n    if (animations[target] == null) {\n        return -1;\n    }\n    for (var i = animations[target].length - 1; i >= 0; i--) {\n        if (!IsEmptyAnimationStep(target, i)) {\n            return i;\n"
      );
      this.l6(
         "        }\n    }\n    return -1;\n}\nfunction GetNextPlayableAnimationIndex(target, index) {\n    if (animations[target] == null) {\n        return index;\n    }\n    while (index < animations[target].length && IsEmptyAnimationStep(target, index)) {\n        index++;\n    }\n    return index;\n}\nfunction GetPreviousPlayableAnimationIndex(target, index) {\n    if"
      );
      this.n5("(animations[target]", " (animations[target] =", 17674, "", 17696, 0);
      this.a6();
      this.l6(
         "= null) {\n        return index;\n    }\n    while (index >= 0 && IsEmptyAnimationStep(target, index)) {\n        index--;\n    }\n    return index;\n}\nfunction ReverseEffectsTimeline(effectsCollection) {\n    if (effectsCollection != null) {\n        for (var i = effectsCollection.length - 1; i >= 0; i--) {\n            if (effectsCollection[i].Reverse != null) {\n                effectsCollection[i].Reverse();\n            }\n            else {\n                effectsCollection[i].Restore();\n                effectsCollection[i].Prepare();\n            }\n        }\n    }\n}\nfunction PrepareEffectsTimeline(effectsCollection) {\n    if (effectsCollection != null)\n        for (var i = 0; i < effectsCollection.length; i++)\n            effectsCollection[i].Prepare();\n}\n\r\nfunction PauseEffectsTimeline(effectsCollection) {\r\n    if (effectsCollection"
      );
      this.n5("!", " !=", 18538, "", 18541, 0);
      this.a6();
      this.l6(" null)\r\n        for (var");
      this.n5("i", " i =", 18565, "", 18569, 0);
      this.a6();
      this.l6(
         " 0; i < effectsCollection.length; i++)\r\n            effectsCollection[i].Pause();\r\n}\r\n\r\nfunction RestartEffectsTimeline(effectsCollection) {\r\n    if (effectsCollection"
      );
      this.n5("!", " !=", 18736, "", 18739, 0);
      this.a6();
      this.l6(" null)\r\n        for (var");
      this.n5("i", " i =", 18763, "", 18767, 0);
      this.a6();
      this.l6(
         " 0; i < effectsCollection.length; i++)\r\n            effectsCollection[i].Restart();\r\n}\r\n\r\nfunction PlayEffectsTimeline(effectsCollection) {\r\n    if (effectsCollection"
      );
      this.n5("!", " !=", 18933, "", 18936, 0);
      this.a6();
      this.l6(" null)\r\n        for (var");
      this.n5("i", " i =", 18960, "", 18964, 0);
      this.a6();
      this.l6(
         " 0; i < effectsCollection.length; i++) {\r\n            effectsCollection[i].Play();\r\n            PlayEffectSound(effectsCollection[i].sound, effectsCollection[i].soundDelay);\n        }\n}\r\n\r\nfunction RestoreEffectsTimeline(effectsCollection) {\r\n    if (effectsCollection"
      );
      this.n5("!", " !=", 19232, "", 19235, 0);
      this.a6();
      this.l6(" null)\r\n        for (var");
      this.n5("i", " i =", 19259, "", 19263, 0);
      this.a6();
      this.l6(
         " 0; i < effectsCollection.length; i++) {\r\n            effectsCollection[i].Restore();\r\n        }\r\n}\r\n\r\nfunction FinishEffectsTimeline(effectsCollection) {\r\n    if (effectsCollection"
      );
      this.n5("!", " !=", 19444, "", 19447, 0);
      this.a6();
      this.l6(" null)\r\n        for (var");
      this.n5("i", " i =", 19471, "", 19475, 0);
      this.a6();
      this.l6(
         " 0; i < effectsCollection.length; i++) {\r\n            effectsCollection[i].Finish();\r\n        }\r\n}\r\n\r\nfunction Fade(slideId, prevSlideId) {\r\n    if(prevSlideId) {\r\n        StackSlides(slideId, prevSlideId);\r\n    }\r\n    \r\n    var"
      );
      this.n5("duration", " duration =", 19703, "", 19714, 0);
      this.a6();
      this.l6(
         " GetDuration(slideId); \r\n    $(slideId).fadeIn(duration).promise().done(function(){\r\n        $(prevSlideId).hide();\r\n        PlayTransitionEnd();\r\n    });\r\n}\r\n\r\nfunction PushPan(slideId, prevSlideId, transitionType) {\r\n    \r\n    var"
      );
      this.n5("duration", " duration =", 19946, "", 19957, 0);
      this.a6();
      this.l6(" GetDuration(slideId);\r\n    var");
      this.n5("direction", " direction =", 19988, "", 20000, 0);
      this.a6();
      this.l6(" $(slideId).data(\"transitionDirection\");\r\n    \r\n    var");
      this.n5("translateX", " translateX =", 20055, "", 20068, 0);
      this.a6();
      this.l6(" 0;\r\n    var");
      this.n5("translateY", " translateY =", 20080, "", 20093, 0);
      this.a6();
      this.l6(
         " 0;\r\n    \r\n    switch (direction) {\r\n        case 'Right':\r\n            translateX = -frameWidth;\r\n            break;\r\n        case 'Left':\r\n            translateX = frameWidth;\r\n            break;\r\n        case 'Down':\r\n            translateY = -frameHeight;\r\n            break;\r\n        case 'Up':\r\n            translateY = frameHeight;\r\n            break;\r\n        default:\r\n            alert(direction);\r\n            break;\r\n    }\r\n    \r\n    $(slideId).show();\r\n        \r\n    if (transitionType == 'Pan')\r\n        $(slideId).css('opacity', '0');\r\n    $(slideId).css('transform', 'translateX(' + translateX + 'px) translateY(' + translateY + 'px)');\r\n    StackSlides(slideId, prevSlideId);\r\n    \r\n    var timeline_old = anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            \r\n            $(slideId).css('transform', '');\r\n            $(slideId).css('opacity', '1');\r\n            $(prevSlideId).css('transform', '');\r\n        "
      );
      this.l6(
         "    $(prevSlideId).css('opacity', '1');\r\n            $(prevSlideId).hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n    });\r\n    \r\n    timeline_old.add({\r\n        duration: duration,\r\n        translateX: -translateX,\r\n        translateY: -translateY,\r\n        opacity: transitionType == 'Pan' ? 0 : 1,\r\n    });\r\n    \r\n    timeline_new.add({\r\n        duration: duration,\r\n        translateX: 0,\r\n        translateY: 0,\r\n        opacity: 1,\r\n    });\r\n    \r\n    timeline_old.play();\r\n    timeline_new.play();\r\n}\r\n\r\nfunction Pull(slideId, prevSlideId) {    \r\n\r\n    var duration = GetDuration(slideId);\r\n    var direction = $(slideId).data(\"transitionDirection\");\r\n    \r\n    var translateX = 0;\r\n    var translateY = 0;\r\n    \r\n    switch (direction) {\r\n        case 'Right':\r\n            translateX = frameWidth;\r\n            break;\r\n        case 'Left':\r\n            translateX = -frame"
      );
      this.l6(
         "Width;\r\n            break;\r\n        case 'Down':\r\n            translateY = frameHeight;\r\n            break;\r\n        case 'Up':\r\n            translateY = -frameHeight;\r\n            break;\r\n        case 'LeftDown':\r\n            translateX = -frameWidth;\r\n            translateY = frameHeight;\r\n            break;\r\n        case 'LeftUp':\r\n            translateX = -frameWidth;\r\n            translateY = -frameHeight;\r\n            break;\r\n        case 'RightDown':\r\n            translateX = frameWidth;\r\n            translateY = frameHeight;\r\n            break;\r\n        case 'RightUp':\r\n            translateX = frameWidth;\r\n            translateY = -frameHeight;\r\n            break;\r\n        default:\r\n            alert(direction);\r\n            break;\r\n    }\r\n    \r\n    $(slideId).show();\r\n    StackSlides(prevSlideId, slideId);\r\n    \r\n    var timeline_old = anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            \r\n            $("
      );
      this.l6(
         "prevSlideId).css('transform', '');\r\n            StackSlides(slideId, prevSlideId);\r\n            $(prevSlideId).hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    timeline_old.add({\r\n        duration: duration,\r\n        translateX: translateX,\r\n        translateY: translateY,\r\n    });\r\n    \r\n    timeline_old.play();\r\n}\r\n\r\nfunction Cover(slideId, prevSlideId) {    \r\n\r\n    var duration = GetDuration(slideId);\r\n    var direction = $(slideId).data(\"transitionDirection\");\r\n    \r\n    var translateX = 0;\r\n    var translateY = 0;\r\n    \r\n    switch (direction) {\r\n        case 'Right':\r\n            translateX = -frameWidth;\r\n            break;\r\n        case 'Left':\r\n            translateX = frameWidth;\r\n            break;\r\n        case 'Down':\r\n            translateY = -frameHeight;\r\n            break;\r\n        case 'Up':\r\n            translateY = frameHeight;\r\n            break;\r\n        case 'LeftDown':\r\n            translateX = frameWidth;\r\n            translateY = -frameHeight;\r\n            bre"
      );
      this.l6(
         "ak;\r\n        case 'LeftUp':\r\n            translateX = frameWidth;\r\n            translateY = frameHeight;\r\n            break;\r\n        case 'RightDown':\r\n            translateX = -frameWidth;\r\n            translateY = -frameHeight;\r\n            break;\r\n        case 'RightUp':\r\n            translateX = -frameWidth;\r\n            translateY = frameHeight;\r\n            break;\r\n        default:\r\n            alert(direction);\r\n            break;\r\n    }\r\n    \r\n    StackSlides(prevSlideId, slideId);\r\n    $(slideId).show();\r\n    $(slideId).css('transform', 'translateX(' + translateX + 'px) translateY(' + translateY + 'px)');\r\n    StackSlides(slideId, prevSlideId);\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            \r\n            $(slideId).css('transform', '');\r\n            StackSlides(slideId, prevSlideId);\r\n            $(prevSlideId).hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r"
      );
      this.l6(
         "\n    \r\n    timeline_new.add({\r\n        duration: duration,\r\n        translateX: 0,\r\n        translateY: 0,\r\n    });\r\n    \r\n    timeline_new.play();\r\n}\r\n\r\nfunction RandomBar(slideId, prevSlideId) {\r\n\r\n    var duration = GetDuration(slideId);\r\n    var direction = $(slideId).data(\"transitionDirection\");\r\n    \r\n    \r\n    var bars = GenerateBars(direction == 'Vertical', frameWidth, frameHeight, 5, 70, 1);\r\n    ShuffleArray(bars);\r\n\r\n    $(slideId).css('opacity', '0.0');\r\n    $(slideId).show();\r\n\r\n    StackSlides(slideId, prevSlideId);\r\n    \r\n    $(slideId).css('clip-path', 'url(#effectsclip)');\r\n    \r\n    var timeline = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        complete: function(anim) {\r\n            $('#effectsclip').empty();\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n            $(slideId).css('clip-path', '');\r\n            $(prevSlideId).hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n      \r\n    \r\n    var finalBarsStartIndex = timeline.id;\r\n    var"
      );
      this.l6(
         " i, j, k;\r\n    var bigSteps = 1;\r\n    var curStepBegin = 0;\r\n    var eachStepLengh = Math.floor(bars.length / Math.max(bigSteps - 1, 1));\r\n    \r\n    var bigStepOpacityBase, curMinOpacity, curMaxOpacity;\r\n    var curStepLength, curStepBars, maxBarLength;\r\n    \r\n    var"
      );
      this.n5("finalBars", " finalBars =", 26505, "", 26517, 0);
      this.a6();
      this.l6(" [];\r\n    \r\n    for");
      this.n5("(i", " (i =", 26536, "", 26541, 0);
      this.a6();
      this.l6(" 0; i < bigSteps; i++) {");
      this.n5("bigStepOpacityBase", "\r\n        \r\n        bigStepOpacityBase =", 26565, "", 26605, 0);
      this.a6();
      this.l6(" (1 / bigSteps) * i;");
      this.n5("curStepLength", "\r\n                \r\n        curStepLength =", 26625, "", 26668, 0);
      this.a6();
      this.l6(" (i < bigSteps - 1) ? eachStepLengh : bars.length - curStepBegin;");
      this.n5("curStepBars", "\r\n        curStepBars =", 26733, "", 26756, 0);
      this.a6();
      this.l6(" bars.slice(curStepBegin, curStepBegin + curStepLength);");
      this.n5("maxBarLength", "\r\n        maxBarLength =", 26812, "", 26836, 0);
      this.a6();
      this.l6(" Math.max.apply(Math, $.map(curStepBars, function (el) { return el.length }));\r\n        \r\n        for");
      this.n5("(j", " (j =", 26937, "", 26942, 0);
      this.a6();
      this.l6(" 0; j < maxBarLength; j++) {\r\n            \r\n            var");
      this.n5("microStepBars", " microStepBars =", 27001, "", 27017, 0);
      this.a6();
      this.l6(" []");
      this.n5("for(k", "\r\n            \r\n            for(k =", 27020, "", 27055, 0);
      this.a6();
      this.l6(
         " 0; k < curStepBars.length; k++) {\r\n                if (j < curStepBars[k].length)\r\n                    microStepBars.push(curStepBars[k][j]);\r\n            }\r\n            \r\n            finalBars.push(microStepBars);"
      );
      this.n5("curMinOpacity", "\r\n            \r\n            curMinOpacity =", 27270, "", 27313, 0);
      this.a6();
      this.l6(" bigStepOpacityBase + (1 / bigSteps / maxBarLength) * j;");
      this.n5("curMaxOpacity", "\r\n            curMaxOpacity =", 27369, "", 27398, 0);
      this.a6();
      this.l6(
         " bigStepOpacityBase + (1 / bigSteps / maxBarLength) * (j + 1);\r\n            \r\n            timeline.add({\r\n                duration: duration / bigSteps / maxBarLength,\r\n                opacity: [curMinOpacity, curMaxOpacity],\r\n                easing: 'linear',\r\n                complete: function(anim) {\r\n                    \r\n                    var ii = anim.id - finalBarsStartIndex - 1;\r\n                    var jj;\r\n                    for (jj = 0; jj < finalBars[ii].length; jj++)\r\n                        $('#effectsclip').append(finalBars[ii][jj]);                    \r\n                    $('#svgdiv').html($('#svgdiv').html());\r\n                    \r\n                }\r\n            });\r\n        }\r\n        \r\n        curStepBegin"
      );
      this.n5("+", " +=", 28137, "", 28140, 0);
      this.a6();
      this.l6(" eachStepLengh;\r\n    }\r\n    \r\n    timeline.play();\r\n}\r\n\r\nfunction Flash(slideId, prevSlideId) {\r\n    \r\n    var");
      this.n5("duration", " duration =", 28250, "", 28261, 0);
      this.a6();
      this.l6(" GetDuration(slideId);\r\n    \r\n    $('#flash').show();\r\n    StackSlides('#flash', prevSlideId);\r\n    \r\n    \r\n    var");
      this.n5("timeline", " timeline =", 28376, "", 28387, 0);
      this.a6();
      this.l6(
         " anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        complete: function(anim) {\r\n            \r\n            $('#flash').hide();\r\n            $(prevSlideId).hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    var"
      );
      this.n5("flashDuration", " flashDuration =", 28645, "", 28661, 0);
      this.a6();
      this.l6(" 300;\r\n    var");
      this.n5("stepsCount", " stepsCount =", 28675, "", 28688, 0);
      this.a6();
      this.l6(" 100;\r\n    \r\n    var");
      this.n5("saturate", " saturate =", 28708, "", 28719, 0);
      this.a6();
      this.l6(" 2;\r\n    var");
      this.n5("brightness", " brightness =", 28731, "", 28744, 0);
      this.a6();
      this.l6(" 3;\r\n    var");
      this.n5("opacity", " opacity =", 28756, "", 28766, 0);
      this.a6();
      this.l6(" 0.4\r\n    var");
      this.n5("contrast", " contrast =", 28779, "", 28790, 0);
      this.a6();
      this.l6(" 1.5;\r\n    \r\n    var");
      this.n5("durationStep", " durationStep =", 28810, "", 28825, 0);
      this.a6();
      this.l6(" (duration - flashDuration) / stepsCount;\r\n    var");
      this.n5("saturateStep", " saturateStep =", 28875, "", 28890, 0);
      this.a6();
      this.l6(" (saturate - 1) / stepsCount;\r\n    var");
      this.n5("brightnessStep", " brightnessStep =", 28928, "", 28945, 0);
      this.a6();
      this.l6(" (brightness - 1) / stepsCount;\r\n    var");
      this.n5("contrastStep", " contrastStep =", 28985, "", 29000, 0);
      this.a6();
      this.l6(" (contrast - 1) / stepsCount;\r\n    var");
      this.n5("opacityStep", " opacityStep =", 29038, "", 29052, 0);
      this.a6();
      this.l6(
         " (1 - opacity) / stepsCount\r\n    \r\n    timeline.add({\r\n        duration: flashDuration,\r\n        complete: function(anim) {\r\n            \r\n            $(slideId).css('opacity', opacity);\r\n            $(slideId).css('filter', 'saturate(' + saturate + ') brightness(' + brightness + ') contrast(' + contrast + ')');\r\n            $(slideId).show();\r\n            StackSlides(slideId, prevSlideId);\r\n        }\r\n    });\r\n    \r\n    for(var i = 0; i < stepsCount; i++) {\r\n        \r\n        saturate"
      );
      this.n5("-", " -=", 29542, "", 29545, 0);
      this.a6();
      this.l6(" saturateStep;\r\n        brightness");
      this.n5("-", " -=", 29579, "", 29582, 0);
      this.a6();
      this.l6(" brightnessStep;\r\n        contrast");
      this.n5("-", " -=", 29616, "", 29619, 0);
      this.a6();
      this.l6(" contrastStep;\r\n        opacity");
      this.n5("+", " +=", 29650, "", 29653, 0);
      this.a6();
      this.l6(
         " opacityStep;\r\n        \r\n        timeline.add({\r\n            duration: durationStep,\r\n            opacity: opacity,\r\n            filter: 'saturate(' + saturate + ') brightness(' + brightness + ') contrast(' + contrast + ')'\r\n        });\r\n    }\r\n    \r\n    timeline.play();\r\n}\r\n\r\nfunction CubeBoxRotateOrbit(slideId, prevSlideId, transitionType) {\r\n    \r\n    var duration = GetDuration(slideId);\r\n    var direction = $(slideId).data(\"transitionDirection\");\r\n    \r\n    if (transitionType == 'Cube' || transitionType == 'Box') {\r\n        $('#blackboard').show();\r\n        StackSlides(prevSlideId, '#blackboard');\r\n    }\r\n    StackSlides(prevSlideId, slideId);\r\n    $(slideId).show();\r\n    \r\n    var timeline_old = anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            \r\n            $(slideId).css('transform', '');\r\n            $(prevSlideId).css('transform', '');\r\n            $(prevSlideId).hide();\r\n            $('#blackboard').h"
      );
      this.l6(
         "ide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n    });\r\n    \r\n    \r\n    var perspectiveVal = 3500;\r\n    var translateZVal = -1000;\r\n    var translateXVal = 0;\r\n    var translateXValNew = 0;\r\n    var rotateYVal = 0;\r\n    var translateYVal = 0;\r\n    var translateYValNew = 0;\r\n    var rotateXVal = 0;\r\n    var oppositeDir = (direction == 'Right' || direction == 'Down') ? -1 : 1;\r\n    \r\n    if (transitionType == 'Cube' || transitionType == 'Rotate') {\r\n        if (direction == 'Left' || direction == 'Right') {\r\n            translateXVal = oppositeDir * (frameWidth / 2 + 1000);"
      );
      this.n5("translateXValNew", "\r\n            translateXValNew =", 31397, "", 31429, 0);
      this.a6();
      this.l6(" translateXVal - oppositeDir * 250;");
      this.n5("rotateYVal", "\r\n            rotateYVal =", 31464, "", 31490, 0);
      this.a6();
      this.l6(" oppositeDir * 82;\r\n        }\r\n        else {");
      this.n5("translateYVal", "\r\n            translateYVal =", 31535, "", 31564, 0);
      this.a6();
      this.l6(" oppositeDir * (frameHeight / 2 + 1000);");
      this.n5("translateYValNew", "\r\n            translateYValNew =", 31604, "", 31636, 0);
      this.a6();
      this.l6(" translateYVal - oppositeDir * 550;");
      this.n5("rotateXVal", "\r\n            rotateXVal =", 31671, "", 31697, 0);
      this.a6();
      this.l6(" oppositeDir * (-85);\r\n        }\r\n    }\r\n    else {");
      this.n5("perspectiveVal", "\r\n        perspectiveVal =", 31748, "", 31774, 0);
      this.a6();
      this.l6(" 3000;");
      this.n5("translateZVal", "\r\n        translateZVal =", 31780, "", 31805, 0);
      this.a6();
      this.l6(" -2050;\r\n        \r\n        if");
      this.n5("(direction", " (direction =", 31834, "", 31847, 0);
      this.a6();
      this.l6("= 'Left' || direction == 'Right') {\r\n            translateXVal = oppositeDir * (frameWidth / 2 - 1500);");
      this.n5("translateXValNew", "\r\n            translateXValNew =", 31950, "", 31982, 0);
      this.a6();
      this.l6(" translateXVal + oppositeDir * 250;");
      this.n5("rotateYVal", "\r\n            rotateYVal =", 32017, "", 32043, 0);
      this.a6();
      this.l6(" oppositeDir * (-98);\r\n        }\r\n        else {");
      this.n5("translateZVal", "\r\n            translateZVal =", 32091, "", 32120, 0);
      this.a6();
      this.l6(" -1900;");
      this.n5("translateYVal", "\r\n            translateYVal =", 32127, "", 32156, 0);
      this.a6();
      this.l6(" oppositeDir * (frameHeight / 2 - 1500);");
      this.n5("translateYValNew", "\r\n            translateYValNew =", 32196, "", 32228, 0);
      this.a6();
      this.l6(" translateYVal + oppositeDir * 550;");
      this.n5("rotateXVal", "\r\n            rotateXVal =", 32263, "", 32289, 0);
      this.a6();
      this.l6(
         " oppositeDir * (95);\r\n        }\r\n    }\r\n    \r\n    $(prevSlideId).css('transform', 'perspective(' + perspectiveVal + 'px)');\r\n    $(slideId).css('transform', 'perspective(' + perspectiveVal + 'px) translateX(' + translateXValNew + 'px) translateY(' + translateYValNew + 'px) rotateX(' + rotateXVal + 'deg) rotateY(' + rotateYVal + 'deg) translateZ(' + (translateZVal) + 'px)');\r\n    \r\n    timeline_old.add({\r\n        duration: duration,\r\n        translateX: [0, -translateXVal],\r\n        translateY: [0, -translateYVal],\r\n        rotateX: -rotateXVal,\r\n        rotateY: -rotateYVal,\r\n        translateZ: translateZVal,\r\n    });    \r\n        \r\n    timeline_new.add({\r\n        duration: duration,\r\n        translateX: 0,\r\n        rotateY: 0,\r\n        translateY: 0,\r\n        rotateX: 0,\r\n        translateZ: 0\r\n    });\r\n    \r\n    timeline_old.play();\r\n    timeline_new.play();\r\n}\r\n\r\nfunction GalleryConveyor(slideId, prevSlideId, transitionType) {\r\n    \r\n    var duration = GetDuration(slideId);\r\n    var direction = $(slideId)"
      );
      this.l6(
         ".data(\"transitionDirection\");\r\n    \r\n    if (transitionType == 'Gallery') {\r\n        $('#blackboard').show();\r\n        StackSlides(prevSlideId, '#blackboard');\r\n    }\r\n    StackSlides(prevSlideId, slideId);\r\n    $(slideId).show();\r\n    \r\n    var timeline_old = anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'easeInOutCirc',\r\n        complete: function(anim) {\r\n            \r\n            $(slideId).css('transform', '');\r\n            $(prevSlideId).css('transform', '');\r\n            $(prevSlideId).hide();\r\n            $('#blackboard').hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'easeInOutCirc',\r\n    });\r\n    \r\n    \r\n    var perspectiveVal = 3500;\r\n    var translateZVal = -400;\r\n    \r\n    var oppositeDir = (direction == 'Right') ? -1 : 1;\r\n    var translateZValFix = 40;\r\n    \r\n    var translateXVal = oppositeDir * 100;\r\n    var translateX"
      );
      this.l6(
         "ValNew = oppositeDir * (frameWidth + translateZValFix);\r\n    var rotateYVal = oppositeDir * 30;\r\n    \r\n    $(prevSlideId).css('transform', 'perspective(' + perspectiveVal + 'px)');\r\n    $(slideId).css('transform', 'perspective(' + perspectiveVal + 'px) translateX(' + translateXValNew + 'px) translateZ(' + translateZValFix + 'px) rotateY(' + (-rotateYVal) + 'deg)');\r\n    \r\n    timeline_old.add({\r\n        duration: duration / 3,\r\n        translateX: -translateXVal,\r\n        rotateY: -rotateYVal,\r\n        translateZ: translateZVal,\r\n    });\r\n    \r\n    timeline_old.add({\r\n        duration: duration / 3,\r\n        translateX: oppositeDir * (-frameWidth) * 1.5,\r\n        translateZ: translateZVal * 3.05,\r\n    });\r\n    \r\n    timeline_old.add({\r\n        duration: duration / 3,\r\n        translateX: oppositeDir * (-frameWidth),\r\n        rotateY: 0,\r\n        translateZ: 0,\r\n    });\r\n    \r\n    timeline_new.add({\r\n        duration: duration / 3, // empty action\r\n    });\r\n    \r\n    timeline_new.add({\r\n        duration: durat"
      );
      this.l6(
         "ion / 3,\r\n        translateX: translateXVal - oppositeDir * translateZValFix,\r\n        translateZ: translateZVal * 1.55,\r\n    });\r\n    \r\n    timeline_new.add({\r\n        duration: duration / 3,\r\n        translateX: 0,\r\n        rotateY: 0,\r\n        translateZ: 0,\r\n    });\r\n    \r\n    timeline_old.play();\r\n    timeline_new.play();\r\n}\r\n\r\nfunction Flip(slideId, prevSlideId,) {\r\n    \r\n    var"
      );
      this.n5("duration", " duration =", 35749, "", 35760, 0);
      this.a6();
      this.l6(" GetDuration(slideId);\r\n    var");
      this.n5("direction", " direction =", 35791, "", 35803, 0);
      this.a6();
      this.l6(
         " $(slideId).data(\"transitionDirection\");\r\n    \r\n    $('#blackboard').show();\r\n    StackSlides(prevSlideId, '#blackboard');\r\n    StackSlides(prevSlideId, slideId);\r\n    $(slideId).show();\r\n    \r\n    var timeline_old = anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            timeline_new.play();\r\n        }\r\n    });\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            \r\n            $(slideId).css('transform', '');\r\n            $(prevSlideId).css('transform', '');\r\n            $(prevSlideId).hide();\r\n            $('#blackboard').hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    \r\n    var perspectiveVal = 3500;\r\n    var oppositeDir = (direction == 'Left') ? -1 : 1;\r\n    var rotateYVal = oppositeDir * 90;\r\n    \r\n    $(prevSlideId).css('transform', 'perspective(' + perspectiveVal +"
      );
      this.l6(
         " 'px)');\r\n    $(slideId).css('transform', 'perspective(' + perspectiveVal + 'px) rotateY(' + (-rotateYVal) + 'deg)');\r\n    \r\n    timeline_old.add({\r\n        duration: duration / 2,\r\n        rotateY: rotateYVal,\r\n    });\r\n    \r\n    timeline_new.add({\r\n        duration: duration / 2,\r\n        rotateY: 0,\r\n    });\r\n\r\n    timeline_old.play();\r\n}\r\n\r\nfunction Dissolve(slideId, prevSlideId) {\r\n    \r\n    var"
      );
      this.n5("duration", " duration =", 37230, "", 37241, 0);
      this.a6();
      this.l6(" GetDuration(slideId);\r\n    var");
      this.n5("stepsCount", " stepsCount =", 37272, "", 37285, 0);
      this.a6();
      this.l6(" 50;\r\n    \r\n    var");
      this.n5("tiles", " tiles =", 37304, "", 37312, 0);
      this.a6();
      this.l6(
         " GenerateDissolvePolygons(frameWidth, frameHeight, 54, 42);\r\n    ShuffleArray(tiles);\r\n    \r\n    $(slideId).css('opacity', '0.0');\r\n    $(slideId).show();\r\n\r\n    StackSlides(slideId, prevSlideId);\r\n    \r\n    $(slideId).css('clip-path', 'url(#effectsclip)');\r\n    \r\n    var timeline = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        complete: function(anim) {\r\n            $('#effectsclip').empty();\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n            $(slideId).css('clip-path', '');\r\n            $(prevSlideId).hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n\r\n    var indexBase = timeline.id;\r\n    var opacityStep, curOpacity;\r\n    var tilesCount = Math.ceil(tiles.length / stepsCount);"
      );
      this.n5("curOpacity", "\r\n    \r\n    curOpacity =", 38060, "", 38084, 0);
      this.a6();
      this.l6(" 0;");
      this.n5("opacityStep", "\r\n    opacityStep =", 38087, "", 38106, 0);
      this.a6();
      this.l6(" (1 - curOpacity) / stepsCount;\r\n    \r\n    for (var");
      this.n5("i", " i =", 38157, "", 38161, 0);
      this.a6();
      this.l6(
         " 0; i < stepsCount; i++) {\r\n        \r\n        timeline.add({\r\n            duration: duration / stepsCount,\r\n            opacity: [curOpacity, curOpacity + opacityStep],\r\n            easing: 'linear',\r\n            complete: function(anim) {\r\n                \r\n                var j = anim.id - indexBase - 1;\r\n                \r\n                for (var k = tilesCount * j; k < tilesCount * (j + 1) && k < tiles.length; k++)\r\n                    $('#effectsclip').append(tiles[k]);\r\n                \r\n                $('#svgdiv').html($('#svgdiv').html());\r\n            }\r\n        });\r\n        \r\n        curOpacity"
      );
      this.n5("+", " +=", 38773, "", 38776, 0);
      this.a6();
      this.l6(
         " opacityStep;\r\n    }\r\n    \r\n    timeline.play();\r\n}\r\n\r\nfunction FlythroughWarp(slideId, prevSlideId, transitionType) {\r\n    \r\n    var"
      );
      this.n5("duration", " duration =", 38909, "", 38920, 0);
      this.a6();
      this.l6(" GetDuration(slideId);\r\n    var");
      this.n5("direction", " direction =", 38951, "", 38963, 0);
      this.a6();
      this.l6(" $(slideId).data(\"transitionDirection\");\r\n    var");
      this.n5("hasBounce", " hasBounce =", 39012, "", 39024, 0);
      this.a6();
      this.n5("$(slideId).data(\"transitionExtra\")", " $(slideId).data(\"transitionExtra\") =", 39024, "", 39061, 0);
      this.a6();
      this.l6(
         "= 'HasBounce';\r\n    var animeDirection = direction == 'In' ? 'normal' : 'reverse';\r\n    \r\n    if (transitionType == 'Warp' && direction == 'In') {\r\n        $('#blackboard').show();\r\n        StackSlides(prevSlideId, '#blackboard');\r\n    }\r\n    if (direction == 'In')\r\n        StackSlides(prevSlideId, slideId);\r\n    else\r\n        StackSlides(slideId, prevSlideId);\r\n    \r\n    $(slideId).show();\r\n    \r\n    var timeline_outside = anime.timeline({\r\n        targets: direction == 'In' ? prevSlideId : slideId,\r\n        autoplay: false,\r\n        easing: (direction == 'Out' && hasBounce) ? 'easeInBounce' : 'easeInOutExpo',\r\n        direction: animeDirection,\r\n        complete: function(anim) {\r\n            \r\n            $(slideId).css('transform', '');\r\n            $(slideId).css('opacity', '1');\r\n            $(prevSlideId).css('transform', '');\r\n            $(prevSlideId).css('opacity', '1');\r\n            $(prevSlideId).hide();\r\n            $('#blackboard').hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n"
      );
      this.l6(
         "    \r\n    var timeline_inside = anime.timeline({\r\n        targets: direction == 'In' ? slideId: prevSlideId,\r\n        autoplay: false,\r\n        direction: animeDirection,\r\n        easing: (direction == 'In' && hasBounce) ? 'easeOutBounce' : 'easeInOutExpo',\r\n    });\r\n    \r\n    timeline_outside.add({\r\n        duration: duration,\r\n        scale: [1, 4],\r\n        opacity: [1, 0],\r\n    });    \r\n        \r\n    timeline_inside.add({\r\n        duration: duration,\r\n        scale: [0.5, 1],\r\n    });\r\n    \r\n    timeline_outside.play();\r\n    timeline_inside.play();\r\n}\r\n\r\nfunction Switch(slideId, prevSlideId) {\r\n    \r\n    var duration = GetDuration(slideId);\r\n    var direction = $(slideId).data(\"transitionDirection\");\r\n    \r\n    $('#blackboard').show();\r\n    StackSlides(prevSlideId, '#blackboard');\r\n    StackSlides(prevSlideId, slideId);\r\n    \r\n    var timeline_old = anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            \r\n      "
      );
      this.l6(
         "      $(slideId).css('transform', '');\r\n            $(prevSlideId).css('transform', '');\r\n            $(prevSlideId).hide();\r\n            $('#blackboard').hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n    });\r\n    \r\n    \r\n    var perspectiveVal = 3000;\r\n    var translateZVal = -800;\r\n    \r\n    var oppositeDir = (direction == 'Right') ? -1 : 1;\r\n    \r\n    var translateXVal = oppositeDir * 100;\r\n    var translateXValNew = translateXVal + oppositeDir * (-frameWidth / 2);\r\n    var"
      );
      this.n5("rotateYVal", " rotateYVal =", 41734, "", 41747, 0);
      this.a6();
      this.l6(
         " oppositeDir * 40;\r\n    \r\n    $(prevSlideId).css('transform', 'perspective(' + perspectiveVal + 'px)');\r\n    $(slideId).css('transform', 'perspective(' + perspectiveVal + 'px) translateX(' + (-translateXValNew / 2) + 'px) translateZ(' + (translateZVal / 2) + 'px) rotateY(' + (-rotateYVal / 2) + 'deg)');\r\n    $(slideId).show();\r\n    \r\n    timeline_old.add({\r\n        duration: duration / 2,\r\n        translateX: [0, translateXVal],\r\n        rotateY: [0, rotateYVal],\r\n        translateZ: [0, translateZVal],\r\n        complete: function(anim) {\r\n            \r\n            StackSlides(slideId, prevSlideId);\r\n        }\r\n    });\r\n    \r\n    timeline_old.add({\r\n        duration: duration / 2,\r\n        translateX: [translateXVal, translateXVal / 2],\r\n        rotateY: [rotateYVal, rotateYVal / 2],\r\n        translateZ: [translateZVal, translateZVal / 2],\r\n    });\r\n    \r\n    \r\n    timeline_new.add({\r\n        duration: duration / 2,\r\n        translateX: [-translateXValNew / 2, -translateXValNew],\r\n        rotateY: [-rotateYVa"
      );
      this.l6(
         "l / 2, -rotateYVal],\r\n        translateZ: [translateZVal / 2, translateZVal],\r\n    });\r\n    \r\n    \r\n    timeline_new.add({\r\n        duration: duration / 2,\r\n        translateX: [-translateXValNew, 0],\r\n        rotateY: [-rotateYVal, 0],\r\n        translateZ: [translateZVal, 0]\r\n    });\r\n    \r\n    timeline_old.play();\r\n    timeline_new.play();\r\n}\r\n\r\nfunction Reveal(slideId, prevSlideId) {\r\n    \r\n    var"
      );
      this.n5("duration", " duration =", 43175, "", 43186, 0);
      this.a6();
      this.l6(" GetDuration(slideId);\r\n    var");
      this.n5("direction", " direction =", 43217, "", 43229, 0);
      this.a6();
      this.l6(" $(slideId).data(\"transitionDirection\");\r\n    var");
      this.n5("throughBlack", " throughBlack =", 43278, "", 43293, 0);
      this.a6();
      this.n5("$(slideId).data(\"transitionExtra\")", " $(slideId).data(\"transitionExtra\") =", 43293, "", 43330, 0);
      this.a6();
      this.l6(
         "= 'ThroughBlack';\r\n    \r\n    if (throughBlack) {\r\n        $('#blackboard').show();\r\n        StackSlides(prevSlideId, '#blackboard');\r\n    }\r\n    StackSlides(prevSlideId, slideId);\r\n    \r\n    var timeline_old = anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n    });\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            $(slideId).css('transform', '');\r\n            $(prevSlideId).css('opacity', '1');\r\n            $(prevSlideId).css('transform', '');\r\n            $(prevSlideId).hide();\r\n            $('#blackboard').hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    \r\n    var perspectiveVal = 3000;\r\n    var translateZVal = 100;\r\n    var oppositeDir = (direction == 'Right') ? -1 : 1;\r\n    \r\n    var translateXVal = oppositeDir * -40;\r\n    var translateXValNew = 10;\r\n    \r\n    \r\n    $(prevSlideId).css('transform', 'perspe"
      );
      this.l6(
         "ctive(' + perspectiveVal + 'px)');\r\n    $(slideId).css('transform', 'perspective(' + perspectiveVal + 'px) translateX(' + translateXValNew + 'px) translateZ(' + translateZVal + 'px)');\r\n    $(slideId).css('opacity', '0');\r\n    $(slideId).show();\r\n    \r\n    \r\n    timeline_old.add({\r\n        duration: duration / 2,\r\n        translateX: [0, translateXVal],\r\n        translateZ: [0, translateZVal * 2],\r\n        opacity: [1, 0],\r\n        complete: function(anim) {\r\n            timeline_new.play();\r\n        }\r\n    });\r\n    \r\n    \r\n    timeline_new.add({\r\n        duration: duration / 2,\r\n        opacity: [0, 1],\r\n        translateX: [translateXValNew, 0],\r\n        translateZ: [translateZVal, 0],\r\n    });\r\n    \r\n    timeline_old.play();\r\n}\r\n\r\nfunction Ferris(slideId, prevSlideId) {\r\n    \r\n    var"
      );
      this.n5("duration", " duration =", 45152, "", 45163, 0);
      this.a6();
      this.l6(" GetDuration(slideId);\r\n    var");
      this.n5("direction", " direction =", 45194, "", 45206, 0);
      this.a6();
      this.l6(" $(slideId).data(\"transitionDirection\");\r\n\r\n    StackSlides(prevSlideId, slideId);\r\n    \r\n    var");
      this.n5("timeline_old", " timeline_old =", 45303, "", 45318, 0);
      this.a6();
      this.l6(
         " anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n    });\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'linear',\r\n        complete: function(anim) {\r\n            $(slideId).css('transform', '');\r\n            $(prevSlideId).css('opacity', '1');\r\n            $(prevSlideId).css('transform', '');\r\n            $(prevSlideId).hide();\r\n            $('#blackboard').hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    \r\n    var perspectiveVal = 3000;\r\n    var translateZVal = -500;\r\n    var oppositeDir = (direction == 'Right') ? -1 : 1;\r\n    \r\n    var translateXVal = oppositeDir * -150;\r\n    var translateXValNew = 10;\r\n    var translateYVal = 600;\r\n    var rotateYVal = oppositeDir * 20;\r\n    var rotateZVal = oppositeDir * 10;\r\n    \r\n    \r\n    $(prevSlideId).css('transform', 'perspective(' + perspectiveVal + 'px)');\r\n    $(slideId).css('transform', 'perspective(' + perspectiveV"
      );
      this.l6(
         "al + 'px) translateX(' + translateXVal + 'px) translateY(' + (-translateYVal) + 'px) translateZ(' + translateZVal + 'px) rotateY(' + (-rotateYVal) + 'deg) rotateZ(' + (-rotateZVal) + 'deg)');\r\n    $(slideId).css('opacity', '0');\r\n    $(slideId).show();\r\n    \r\n    \r\n    timeline_old.add({\r\n        duration: duration / 2,\r\n        translateX: [0, translateXVal],\r\n        translateY: [0, translateYVal],\r\n        translateZ: [0, translateZVal],\r\n        rotateY: [0, rotateYVal],\r\n        rotateZ: [0, rotateZVal],\r\n        opacity: [1, 0],\r\n        complete: function(anim) {\r\n            timeline_new.play();\r\n        }\r\n    });\r\n    \r\n    \r\n    timeline_new.add({\r\n        duration: duration / 2,\r\n        translateX: [translateXVal, 0],\r\n        translateY: [-translateYVal, 0],\r\n        translateZ: [translateZVal, 0],\r\n        rotateY: [-rotateYVal, 0],\r\n        rotateZ: [-rotateZVal, 0],\r\n        opacity: [0, 1],\r\n    });\r\n    \r\n    timeline_old.play();\r\n}\r\n\r\nfunction Honeycomb(slideId, prevSlideId) {\r\n    \r\n    v"
      );
      this.l6("ar");
      this.n5("duration", " duration =", 47368, "", 47379, 0);
      this.a6();
      this.l6(" GetDuration(slideId) * 2;\r\n    \r\n    var");
      this.n5("blackboardClone", " blackboardClone =", 47420, "", 47438, 0);
      this.a6();
      this.l6(" null;\r\n    if");
      this.n5("(prevSlideId", " (prevSlideId =", 47452, "", 47467, 0);
      this.a6();
      this.l6(
         "= null)\r\n    {\r\n        blackboardClone = $('#blackboard').clone();\r\n        blackboardClone.attr('id', 'blackboardClone');\r\n        blackboardClone.insertBefore('#svgdiv');\r\n        prevSlideId = '#blackboardClone';\r\n    }\r\n\r\n    StackSlides(prevSlideId, '#blackboard');\r\n    $('#blackboard').show();\r\n    \r\n    var polys_old = GenerateHoneycombPolygons(true);\r\n    var polys_new = GenerateHoneycombPolygons(false);\r\n    $('#effectsclip').append(polys_old);\r\n    $('#svgdiv').html($('#svgdiv').html());\r\n    $(prevSlideId).css('clip-path', 'url(#effectsclip)');\r\n    \r\n    var oldScaleVal = 10;\r\n    var oldTranslateXVal = -10;\r\n    var oldTranslateYVal = -40;\r\n    var oldRotateZVal = -60;\r\n    \r\n    var newScaleVal = 0.3;\r\n    var newRotateZVal = 70;\r\n    \r\n    var timeline_old = anime.timeline({\r\n        targets: prevSlideId,\r\n        autoplay: false,\r\n        easing: 'easeInQuad',\r\n        complete: function(anim) {\r\n            $('#effectsclip').empty();\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n    "
      );
      this.l6(
         "        $(prevSlideId).css('clip-path', '');\r\n            $(prevSlideId).css('transform', '');\r\n            $(prevSlideId).hide();\r\n            if (blackboardClone != null)\r\n                blackboardClone.remove();\r\n        }\r\n    });\r\n    \r\n    var timeline_new = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        easing: 'easeOutSine',\r\n        complete: function(anim) {\r\n            $('#effectsclip1').empty();\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n            $(slideId).css('clip-path', '');\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    \r\n    timeline_old.add({\r\n        duration: duration,\r\n        scaleX: oldScaleVal,\r\n        scaleY: oldScaleVal,\r\n        translateX: oldTranslateXVal,\r\n        translateY: oldTranslateYVal,\r\n        rotateZ: oldRotateZVal\r\n    });\r\n    \r\n    timeline_new.add({\r\n        duration: duration / 1.5,\r\n        scaleX: [newScaleVal, 1],\r\n        scaleY: [newScaleVal, 1],\r\n        rotateZ: [newRotateZVal, 0]\r\n    });\r\n"
      );
      this.l6("    \r\n    \r\n    var");
      this.n5("timeline_remove", " timeline_remove =", 49534, "", 49552, 0);
      this.a6();
      this.l6(" anime.timeline({\r\n        autoplay: false,\r\n    });\r\n    \r\n    for (var");
      this.n5("i", " i =", 49624, "", 49628, 0);
      this.a6();
      this.l6(
         " 0; i < polys_old.length; i++) {\r\n        timeline_remove.add({\r\n            duration: duration / 1.5 / polys_old.length,\r\n            complete: function(anim) {\r\n                $('#effectsclip').find('polygon:first').remove();\r\n                $('#svgdiv').html($('#svgdiv').html());\r\n            }\r\n        });\r\n    }\r\n    \r\n    \r\n    var"
      );
      this.n5("timeline_add", " timeline_add =", 49969, "", 49984, 0);
      this.a6();
      this.l6(" anime.timeline({\r\n        autoplay: false,\r\n    });\r\n    \r\n    var");
      this.n5("indexBase", " indexBase =", 50051, "", 50063, 0);
      this.a6();
      this.l6(" timeline_add.id;\r\n    \r\n    for (var");
      this.n5("i", " i =", 50100, "", 50104, 0);
      this.a6();
      this.l6(
         " 0; i < polys_new.length; i++) {\r\n        timeline_add.add({\r\n            duration: duration / 1.5 / polys_new.length,\r\n            complete: function(anim) {\r\n                var"
      );
      this.n5("j", " j =", 50283, "", 50287, 0);
      this.a6();
      this.l6(
         " anim.id - indexBase - 1;\r\n                $('#effectsclip1').append(polys_new[j]);\r\n                $('#svgdiv').html($('#svgdiv').html());\r\n            }\r\n        });\r\n    }\r\n    \r\n    var"
      );
      this.n5("timeline_delay", " timeline_delay =", 50477, "", 50494, 0);
      this.a6();
      this.l6(
         " anime.timeline({\r\n        autoplay: false,\r\n    });\r\n    \r\n    timeline_delay.add({\r\n        duration: duration / 3,\r\n        complete: function(anim) {\r\n            \r\n            $('#blackboard').css(\"z-index\", 1);\r\n            $(slideId).css(\"z-index\", 2);\r\n            $(prevSlideId).css(\"z-index\", 3);\r\n    \r\n            $(slideId).css('transform', 'scaleX(' + (newScaleVal) + ') scaleY(' + (newScaleVal) + ') rotateZ(' + (newRotateZVal) + 'deg)');\r\n            $(slideId).css('clip-path', 'url(#effectsclip1)');\r\n            $(slideId).show();\r\n            timeline_new.play();\r\n            timeline_add.play();\r\n        }\r\n    });\r\n    \r\n    \r\n    timeline_old.play();\r\n    timeline_delay.play();\r\n    timeline_remove.play();\r\n}\r\n\r\nfunction Comb(slideId, prevSlideId) {\r\n    \r\n    var duration = GetDuration(slideId);\r\n    var direction = $(slideId).data(\"transitionDirection\");\r\n    var horizontal = direction == 'Horizontal';\r\n    \r\n    if (prevSlideId == null) \r\n        prevSlideId = '#blackboard';\r\n\r\n    StackSl"
      );
      this.l6(
         "ides(prevSlideId, slideId);\r\n    $(slideId).show();\r\n    \r\n    var timeline1 = CreateCloneAndTimeline(prevSlideId, 1);\r\n    var timeline2 = CreateCloneAndTimeline(prevSlideId, 2);\r\n    var timeline3 = CreateCloneAndTimeline(prevSlideId, 3);\r\n    var timeline4 = CreateCloneAndTimeline(prevSlideId, 4);\r\n    var timeline5 = CreateCloneAndTimeline(prevSlideId, 5);\r\n    var timeline6 = CreateCloneAndTimeline(prevSlideId, 6);\r\n    var timeline7 = CreateCloneAndTimeline(prevSlideId, 7);\r\n    var timeline8 = CreateCloneAndTimeline(prevSlideId, 8);\r\n    \r\n    $(prevSlideId).hide();\r\n    \r\n    var polys = GenerateCombPolygons(direction);\r\n    $('#effectsclip1').append(polys[0]);\r\n    $('#effectsclip2').append(polys[1]);\r\n    $('#effectsclip3').append(polys[2]);\r\n    $('#effectsclip4').append(polys[3]);\r\n    $('#effectsclip5').append(polys[4]);\r\n    $('#effectsclip6').append(polys[5]);\r\n    $('#effectsclip7').append(polys[6]);\r\n    $('#effectsclip8').append(polys[7]);\r\n    \r\n    $('#svgdiv').html($('#svgdiv').html());\r\n"
      );
      this.l6(
         "    \r\n    var translateXVal = horizontal ? frameWidth + 10 : 0;\r\n    var translateYVal = horizontal ? 0 : frameHeight + 10;\r\n    var delayVal = horizontal ? 150 : 0;\r\n    \r\n    timeline1.add({\r\n        duration: duration,\r\n        translateX: translateXVal,\r\n        translateY: translateYVal\r\n    });\r\n    \r\n    timeline2.add({\r\n        duration: duration,\r\n        translateX: -translateXVal,\r\n        translateY: -translateYVal\r\n    });\r\n    \r\n    timeline3.add({\r\n        duration: duration,\r\n        delay: delayVal,\r\n        translateX: translateXVal,\r\n        translateY: translateYVal\r\n    });\r\n    \r\n    timeline4.add({\r\n        duration: duration,\r\n        delay: delayVal,\r\n        translateX: -translateXVal,\r\n        translateY: -translateYVal\r\n    });\r\n    \r\n    timeline5.add({\r\n        duration: duration,\r\n        delay: delayVal * 2,\r\n        translateX: translateXVal,\r\n        translateY: translateYVal\r\n    });\r\n    \r\n    timeline6.add({\r\n        duration: duration,\r\n        delay: delayVal * 2,\r\n     "
      );
      this.l6(
         "   translateX: -translateXVal,\r\n        translateY: -translateYVal\r\n    });\r\n    \r\n    timeline7.add({\r\n        duration: duration,\r\n        delay: delayVal * 3,\r\n        translateX: translateXVal,\r\n        translateY: translateYVal\r\n    });\r\n    \r\n    timeline8.add({\r\n        duration: duration,\r\n        delay: delayVal * 3,\r\n        translateX: -translateXVal,\r\n        translateY: -translateYVal,\r\n        complete: function(anim) {\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n    \r\n    timeline1.play();\r\n    timeline2.play();\r\n    timeline3.play();\r\n    timeline4.play();\r\n    timeline5.play();\r\n    timeline6.play();\r\n    timeline7.play();\r\n    timeline8.play();\r\n}\r\n\r\nfunction CreateCloneAndTimeline(slideId, cloneNumber) {\r\n    \r\n    var cloneId = '#slideclone' + cloneNumber;\r\n    var effectsId = '#effectsclip' + cloneNumber;\r\n    var clone = $(slideId).clone();\r\n    clone.attr('id', 'slideclone' + cloneNumber);\r\n    clone.css('clip-path', 'url('"
      );
      this.l6(
         " + effectsId + ')');\r\n    clone.insertBefore('#svgdiv');\r\n    clone.show();\r\n    \r\n    var timeline_clone = anime.timeline({\r\n        targets: cloneId,\r\n        autoplay: false,\r\n        easing: 'easeInCubic',\r\n        complete: function(anim) {\r\n            \r\n            $(effectsId).empty();\r\n            $(cloneId).remove();\r\n        }\r\n    });\r\n    \r\n    return timeline_clone;\r\n}\r\n\r\n\r\nfunction Wheel(slideId, prevSlideId, wheelType) {\r\n    \r\n    var stepsCount = 160;\r\n    var sectors = GenerateWheelSectors(wheelType, stepsCount, frameWidth, frameHeight);\r\n    \r\n    AnimatePolygons(slideId, prevSlideId, sectors);\r\n}\r\n\r\nfunction Shape(slideId, prevSlideId, shapeType) {\r\n    \r\n    var stepsCount = 150;\r\n    \r\n    var polys = [];\r\n    if (shapeType == 'Circle')\r\n        polys = GenerateCircles(stepsCount, frameWidth, frameHeight);\r\n    else\r\n        polys = GenerateShapePolygons(stepsCount, shapeType, frameWidth, frameHeight);\r\n    \r\n    AnimatePolygons(slideId, prevSlideId, polys);\r\n}\r\n\r\nfunction Split(slideId"
      );
      this.l6(
         ", prevSlideId) {\r\n    \r\n    var stepsCount = 150;\r\n    \r\n    var out = $(slideId).data(\"transitionDirection\") == 'Out';\r\n    var horizontal = $(slideId).data(\"transitionExtra\") == 'Horizontal';\r\n    \r\n    var polys = [];\r\n    polys = GenerateSplitPolygons(stepsCount, frameWidth, frameHeight, horizontal, out);\r\n    \r\n    AnimatePolygons(slideId, prevSlideId, polys);\r\n}\r\n\r\nfunction Wipe(slideId, prevSlideId) {\r\n\r\n    var stepsCount = 150;\r\n    \r\n    var direction = $(slideId).data(\"transitionDirection\");\r\n    \r\n    var polys = [];\r\n    polys = GenerateWipePolygons(stepsCount, direction, frameWidth, frameHeight);\r\n    \r\n    AnimatePolygons(slideId, prevSlideId, polys);\r\n}\r\n\r\nfunction AnimatePolygons(slideId, prevSlideId, polys) {\r\n    \r\n    var duration = GetDuration(slideId);\r\n    var stepsCount = polys.length;\r\n    var curOpacity = 0.8;\r\n    \r\n    $(slideId).css('opacity', curOpacity);\r\n    $(slideId).show();\r\n\r\n    StackSlides(slideId, prevSlideId);\r\n    \r\n    $(slideId).css('clip-path', 'url(#effectsclip)');"
      );
      this.l6(
         "\r\n    \r\n    var timeline = anime.timeline({\r\n        targets: slideId,\r\n        autoplay: false,\r\n        complete: function(anim) {\r\n            $('#effectsclip').empty();\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n            $(slideId).css('clip-path', '');\r\n            $(prevSlideId).hide();\r\n            PlayTransitionEnd();\r\n        }\r\n    });\r\n\r\n    var indexBase = timeline.id;\r\n    var opacityStep = (1 - curOpacity) / stepsCount;\r\n    \r\n    for (var"
      );
      this.n5("i", " i =", 57109, "", 57113, 0);
      this.a6();
      this.l6(
         " 0; i < stepsCount; i++) {\r\n        \r\n        timeline.add({\r\n            duration: duration / stepsCount,\r\n            opacity: [curOpacity, curOpacity + opacityStep],\r\n            easing: 'linear',\r\n            complete: function(anim) {\r\n                \r\n                var j = anim.id - indexBase - 1;\r\n                $('#effectsclip').append(polys[j]);\r\n                $('#svgdiv').html($('#svgdiv').html());\r\n            }\r\n        });\r\n        \r\n        curOpacity += opacityStep;\r\n    }\r\n    \r\n    timeline.play();\r\n}\r\n\r\nfunction AnimatePolygonsForShape(shapeId, polys, duration, delay, slowerCenter) {\r\n\r\n    var stepsCount = polys.length;\r\n    \r\n    var clipId = shapeId.replace(' > #', '') + '-clip';\r\n    var width = parseInt($(shapeId).css('width').replace('px', ''));\r\n    var height = parseInt($(shapeId).css('height').replace('px', ''));\r\n    var curOpacity = 0.4;\r\n    \r\n    if ($(clipId).length == 0) {\r\n        $('#svgdiv > svg > defs').append('<clipPath id=\"' + clipId.replace('#', '') + '\" viewbox=\""
      );
      this.l6(
         "0 0 ' + width + ' ' + height + '\"></clipPath>');\r\n        $('#svgdiv').html($('#svgdiv').html());\r\n    }\r\n    \r\n    var timeline = anime.timeline({\r\n        targets: shapeId,\r\n        autoplay: false,\r\n        begin: function(anim) {\r\n            $(shapeId).show();\r\n            $(shapeId).css('opacity', curOpacity)\r\n            $(shapeId).css('clip-path', 'url(' + clipId + ')');\r\n        },\r\n        complete: function(anim) {\r\n            $(clipId).empty();\r\n            $(shapeId).css('clip-path', '');\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n        }\r\n    });\r\n\r\n    var indexBase = timeline.id;\r\n    var opacityStep = (1 - curOpacity) / stepsCount;"
      );
      this.n5("timelinePolysCache[indexBase]", "\r\n    timelinePolysCache[indexBase] =", 58807, "", 58844, 0);
      this.a6();
      this.l6(" polys;\r\n    \r\n    for (var");
      this.n5("i", " i =", 58871, "", 58875, 0);
      this.a6();
      this.l6(" 0; i < stepsCount; i++) {\r\n        \r\n        var");
      this.n5("slowingCoef", " slowingCoef =", 58924, "", 58938, 0);
      this.a6();
      this.l6(
         " slowerCenter ? (Math.abs(stepsCount / 2 - i) / stepsCount + 0.75) : 1;\r\n        \r\n        timeline.add({\r\n            duration: duration / stepsCount * slowingCoef,\r\n            delay:"
      );
      this.n5("(i", " (i =", 59123, "", 59128, 0);
      this.a6();
      this.l6(
         "= 0) ? delay : 0,\r\n            opacity: [curOpacity, curOpacity + opacityStep],\r\n            easing: 'linear',\r\n            complete: function(anim) {\r\n                \r\n                var j = anim.id - indexBase - 1;\r\n                clipContentCache[indexBase] += timelinePolysCache[indexBase][j];\r\n                $(clipId).html(clipContentCache[indexBase]);\r\n            }\r\n        });\r\n        \r\n        curOpacity += opacityStep;\r\n    }\r\n\r\n    return timeline;\r\n}\r\n\r\nfunction AnimatePolygonsForShapeExit(shapeId, polys, duration, delay, removeLast, slowerCenter) {\r\n\r\n    var stepsCount = polys.length;\r\n    \r\n    var clipId = shapeId.replace(' > #', '') + '-clip';\r\n    var width = parseInt($(shapeId).css('width').replace('px', ''));\r\n    var height = parseInt($(shapeId).css('height').replace('px', ''));\r\n    var curOpacity = 1.0;\r\n    \r\n    if ($(clipId).length == 0) {\r\n        $('#svgdiv > svg > defs').append('<clipPath id=\"' + clipId.replace('#', '') + '\" viewbox=\"0 0 ' + width + ' ' + height + '\"></clipPat"
      );
      this.l6(
         "h>');\r\n        $('#svgdiv').html($('#svgdiv').html());\r\n    }\r\n    \r\n    var timeline = anime.timeline({\r\n        targets: shapeId,\r\n        autoplay: false,\r\n        begin: function(anim) {\r\n\r\n            $(clipId).empty();\r\n            for (var ii = 0; ii < stepsCount; ii++)\r\n                clipContentCache[anim.id]"
      );
      this.n5("+", " +=", 60472, "", 60475, 0);
      this.a6();
      this.l6(
         " timelinePolysCache[anim.id][ii] + '\\n';\r\n                \r\n            $(clipId).html(clipContentCache[anim.id]);\r\n            $(shapeId).css('clip-path', 'url(' + clipId + ')');\r\n        },\r\n        complete: function(anim) {\r\n            $(shapeId).hide();\r\n            $(clipId).empty();\r\n            $(shapeId).css('clip-path', '');\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n        }\r\n    });\r\n\r\n    var indexBase = timeline.id;\r\n    var opacityStep = curOpacity / stepsCount;"
      );
      this.n5("timelinePolysCache[indexBase]", "\r\n    timelinePolysCache[indexBase] =", 60969, "", 61006, 0);
      this.a6();
      this.l6(" polys;\r\n    \r\n    for (var");
      this.n5("i", " i =", 61033, "", 61037, 0);
      this.a6();
      this.l6(" 0; i < stepsCount; i++) {\r\n        \r\n        var");
      this.n5("slowingCoef", " slowingCoef =", 61086, "", 61100, 0);
      this.a6();
      this.l6(
         " slowerCenter ? (Math.abs(stepsCount / 2 - i) / stepsCount + 0.75) : 1;\r\n        \r\n        timeline.add({\r\n            duration: duration / stepsCount * slowingCoef,\r\n            delay:"
      );
      this.n5("(i", " (i =", 61285, "", 61290, 0);
      this.a6();
      this.l6(
         "= 0) ? delay : 0,\r\n            opacity: [curOpacity, curOpacity - opacityStep],\r\n            easing: 'linear',\r\n            complete: function(anim) {\r\n                if (removeLast)\r\n                    clipContentCache[indexBase] = RemoveLastString(clipContentCache[indexBase], 1);\r\n                else\r\n                    clipContentCache[indexBase] = RemoveFirstString(clipContentCache[indexBase], 1);\r\n                \r\n                $(clipId).html(clipContentCache[indexBase]);\r\n            }\r\n        });\r\n        \r\n        curOpacity -= opacityStep;\r\n    }\r\n\r\n    return timeline;\r\n}\r\n\r\nfunction AnimateRandomBarsForShapes(shapeId, bars, duration, delay) {\r\n\r\n    var clipId = shapeId.replace(' > #', '') + '-clip';\r\n    var width = parseInt($(shapeId).css('width').replace('px', ''));\r\n    var height = parseInt($(shapeId).css('height').replace('px', ''));\r\n    var curOpacity = 0.0;\r\n    \r\n    if ($(clipId).length == 0) {\r\n        $('#svgdiv > svg > defs').append('<clipPath id=\"' + clipId.replace('#', '') +"
      );
      this.l6(
         " '\" viewbox=\"0 0 ' + width + ' ' + height + '\"></clipPath>');\r\n        $('#svgdiv').html($('#svgdiv').html());\r\n    }\r\n    \r\n    var bigSteps = 1;\r\n    var curStepBegin = 0;\r\n    var eachStepLengh = Math.floor(bars.length / Math.max(bigSteps - 1, 1));\r\n    \r\n    var bigStepOpacityBase, curMinOpacity, curMaxOpacity;\r\n    var curStepLength, curStepBars, maxBarLength;\r\n    \r\n    var"
      );
      this.n5("finalBars", " finalBars =", 62696, "", 62708, 0);
      this.a6();
      this.l6(" [];\r\n    var");
      this.n5("maxBarLengths", " maxBarLengths =", 62721, "", 62737, 0);
      this.a6();
      this.l6(" [];\r\n    \r\n    for (var");
      this.n5("i", " i =", 62761, "", 62765, 0);
      this.a6();
      this.l6(" 0; i < bigSteps; i++) {");
      this.n5("curStepLength", "\r\n                \r\n        curStepLength =", 62789, "", 62832, 0);
      this.a6();
      this.l6(" (i < bigSteps - 1) ? eachStepLengh : bars.length - curStepBegin;");
      this.n5("curStepBars", "\r\n        curStepBars =", 62897, "", 62920, 0);
      this.a6();
      this.l6(" bars.slice(curStepBegin, curStepBegin + curStepLength);");
      this.n5("maxBarLength", "\r\n        maxBarLength =", 62976, "", 63000, 0);
      this.a6();
      this.l6(
         " Math.max.apply(Math, $.map(curStepBars, function (el) { return el.length }));\r\n        maxBarLengths.push(maxBarLength);\r\n        \r\n        for (var"
      );
      this.n5("j", " j =", 63149, "", 63153, 0);
      this.a6();
      this.l6(" 0; j < maxBarLength; j++) {\r\n            \r\n            var");
      this.n5("microStepBars", " microStepBars =", 63212, "", 63228, 0);
      this.a6();
      this.l6(" []\r\n            \r\n            for(var");
      this.n5("k", " k =", 63266, "", 63270, 0);
      this.a6();
      this.l6(
         " 0; k < curStepBars.length; k++) {\r\n                if (j < curStepBars[k].length)\r\n                    microStepBars.push(curStepBars[k][j]);\r\n            }\r\n            \r\n            finalBars.push(microStepBars);\r\n        }\r\n        \r\n        curStepBegin"
      );
      this.n5("+", " +=", 63528, "", 63531, 0);
      this.a6();
      this.l6(" eachStepLengh;\r\n    }\r\n    \r\n    var");
      this.n5("timeline", " timeline =", 63568, "", 63579, 0);
      this.a6();
      this.l6(
         " anime.timeline({\r\n        targets: shapeId,\r\n        autoplay: false,\r\n        begin: function(anim) {\r\n            $(shapeId).show();\r\n            $(shapeId).css('opacity', curOpacity)\r\n            $(shapeId).css('clip-path', 'url(' + clipId + ')');\r\n        },\r\n        complete: function(anim) {\r\n            $(clipId).empty();\r\n            $(shapeId).css('clip-path', '');\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n        }\r\n    });\r\n    \r\n    var indexBase = timeline.id;\r\n    timelineBarsCache[indexBase] = finalBars;\r\n    \r\n    for (var i = 0; i < bigSteps; i++) {"
      );
      this.n5("bigStepOpacityBase", "\r\n        \r\n        bigStepOpacityBase =", 64164, "", 64204, 0);
      this.a6();
      this.l6(" (1 / bigSteps) * i;");
      this.n5("maxBarLength", "\r\n                \r\n        maxBarLength =", 64224, "", 64266, 0);
      this.a6();
      this.l6(" maxBarLengths[i];\r\n        \r\n        for (var");
      this.n5("j", " j =", 64312, "", 64316, 0);
      this.a6();
      this.l6(" 0; j < maxBarLength; j++) {");
      this.n5("curMinOpacity", "\r\n            \r\n            curMinOpacity =", 64344, "", 64387, 0);
      this.a6();
      this.l6(" bigStepOpacityBase + (1 / bigSteps / maxBarLength) * j;");
      this.n5("curMaxOpacity", "\r\n            curMaxOpacity =", 64443, "", 64472, 0);
      this.a6();
      this.l6(
         " bigStepOpacityBase + (1 / bigSteps / maxBarLength) * (j + 1);\r\n            \r\n            timeline.add({\r\n                duration: duration / bigSteps / maxBarLength,\r\n                opacity: [curMinOpacity, curMaxOpacity],\r\n                easing: 'linear',\r\n                complete: function(anim) {\r\n                    \r\n                    var ii = anim.id - indexBase - 1;\r\n                    for (var jj = 0; jj < timelineBarsCache[indexBase][ii].length; jj++)\r\n                        clipContentCache[indexBase]"
      );
      this.n5("+", " +=", 64996, "", 64999, 0);
      this.a6();
      this.l6(
         " timelineBarsCache[indexBase][ii][jj];\r\n                    \r\n                    $(clipId).html(clipContentCache[indexBase]);   \r\n                }\r\n            });\r\n        }\r\n        \r\n        curStepBegin"
      );
      this.n5("+", " +=", 65207, "", 65210, 0);
      this.a6();
      this.l6(
         " eachStepLengh;\r\n    }\r\n    \r\n    return timeline;\r\n}\r\n\r\nfunction AnimateRandomBarsForShapesExit(shapeId, bars, duration, delay, removeLast) {\r\n    \r\n    var"
      );
      this.n5("clipId", " clipId =", 65367, "", 65376, 0);
      this.a6();
      this.l6(
         " shapeId.replace(' > #', '') + '-clip';\r\n    var width = parseInt($(shapeId).css('width').replace('px', ''));\r\n    var height = parseInt($(shapeId).css('height').replace('px', ''));\r\n    var curOpacity = 1.0;\r\n    \r\n    if ($(clipId).length == 0) {\r\n        $('#svgdiv > svg > defs').append('<clipPath id=\"' + clipId.replace('#', '') + '\" viewbox=\"0 0 ' + width + ' ' + height + '\"></clipPath>');\r\n        $('#svgdiv').html($('#svgdiv').html());\r\n    }\r\n    \r\n    var bigSteps = 1;\r\n    var curStepBegin = 0;\r\n    var eachStepLengh = Math.floor(bars.length / Math.max(bigSteps - 1, 1));\r\n    \r\n    var bigStepOpacityBase, curMinOpacity, curMaxOpacity;\r\n    var curStepLength, curStepBars, maxBarLength;\r\n    \r\n    var finalBars = [];\r\n    var maxBarLengths = [];\r\n    \r\n    for (var i = 0; i < bigSteps; i++) {"
      );
      this.n5("curStepLength", "\r\n        \r\n        curStepLength =", 66186, "", 66221, 0);
      this.a6();
      this.l6(" (i < bigSteps - 1) ? eachStepLengh : bars.length - curStepBegin;");
      this.n5("curStepBars", "\r\n        curStepBars =", 66286, "", 66309, 0);
      this.a6();
      this.l6(" bars.slice(curStepBegin, curStepBegin + curStepLength);");
      this.n5("maxBarLength", "\r\n        maxBarLength =", 66365, "", 66389, 0);
      this.a6();
      this.l6(
         " Math.max.apply(Math, $.map(curStepBars, function (el) { return el.length }));\r\n        maxBarLengths.push(maxBarLength);\r\n        \r\n        for (var"
      );
      this.n5("j", " j =", 66538, "", 66542, 0);
      this.a6();
      this.l6(" 0; j < maxBarLength; j++) {\r\n            \r\n            var");
      this.n5("microStepBars", " microStepBars =", 66601, "", 66617, 0);
      this.a6();
      this.l6(" []\r\n            \r\n            for(var");
      this.n5("k", " k =", 66655, "", 66659, 0);
      this.a6();
      this.l6(
         " 0; k < curStepBars.length; k++) {\r\n                if (j < curStepBars[k].length)\r\n                    microStepBars.push(curStepBars[k][j]);\r\n            }\r\n            \r\n            finalBars.push(microStepBars);\r\n        }\r\n        \r\n        curStepBegin"
      );
      this.n5("+", " +=", 66917, "", 66920, 0);
      this.a6();
      this.l6(" eachStepLengh;\r\n    }\r\n    \r\n    var");
      this.n5("timeline", " timeline =", 66957, "", 66968, 0);
      this.a6();
      this.l6(
         " anime.timeline({\r\n        targets: shapeId,\r\n        autoplay: false,\r\n        begin: function(anim) {\r\n\r\n            $(clipId).empty();\r\n            for (var"
      );
      this.n5("k", " k =", 67127, "", 67131, 0);
      this.a6();
      this.l6(" 0; k < timelineBarsCache[anim.id].length; k++)\r\n                for (var");
      this.n5("p", " p =", 67204, "", 67208, 0);
      this.a6();
      this.l6(" 0; p < timelineBarsCache[anim.id][k].length; p++)\r\n                    clipContentCache[anim.id]");
      this.n5("+", " +=", 67305, "", 67308, 0);
      this.a6();
      this.l6(
         " timelineBarsCache[anim.id][k][p] + '\\n';\r\n            \r\n            exitTimelineIterationCounter[anim.id] = 0;\r\n                \r\n            $(clipId).html(clipContentCache[anim.id]);\r\n            $(shapeId).css('clip-path', 'url(' + clipId + ')');\r\n        },\r\n        complete: function(anim) {\r\n            $(shapeId).hide();\r\n            $(clipId).empty();\r\n            $(shapeId).css('clip-path', '');\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n        }\r\n    });\r\n    \r\n    var indexBase = timeline.id;\r\n    timelineBarsCache[indexBase] = finalBars;\r\n    \r\n    for (var i = 0; i < bigSteps; i++) {"
      );
      this.n5("bigStepOpacityBase", "\r\n        \r\n        bigStepOpacityBase =", 67924, "", 67964, 0);
      this.a6();
      this.l6(" (1 / bigSteps) * (1 - i);");
      this.n5("maxBarLength", "\r\n        maxBarLength =", 67990, "", 68014, 0);
      this.a6();
      this.l6(" maxBarLengths[i];\r\n        \r\n        for (var");
      this.n5("j", " j =", 68060, "", 68064, 0);
      this.a6();
      this.l6(" 0; j < finalBars[i].length; j++) {");
      this.n5("curMinOpacity", "\r\n            \r\n            curMinOpacity =", 68099, "", 68142, 0);
      this.a6();
      this.l6(" bigStepOpacityBase - (1 / bigSteps / maxBarLength) * j;");
      this.n5("curMaxOpacity", "\r\n            curMaxOpacity =", 68198, "", 68227, 0);
      this.a6();
      this.l6(
         " bigStepOpacityBase - (1 / bigSteps / maxBarLength) * (j + 1);\r\n            \r\n            timeline.add({\r\n                duration: duration / bigSteps / maxBarLength,\r\n                delay:"
      );
      this.n5("(i", " (i =", 68418, "", 68423, 0);
      this.a6();
      this.l6(
         "= 0) ? delay : 0,\r\n                opacity: [curMinOpacity, curMaxOpacity],\r\n                easing: 'linear',\r\n                \r\n                complete: function(anim) {\r\n                    var curBarsIndex = exitTimelineIterationCounter[indexBase];\r\n                    if (removeLast)\r\n                        clipContentCache[indexBase] = RemoveLastString(clipContentCache[indexBase], timelineBarsCache[indexBase][curBarsIndex].length);\r\n                    else\r\n                        clipContentCache[indexBase] = RemoveFirstString(clipContentCache[indexBase], timelineBarsCache[indexBase][curBarsIndex].length);\r\n                    \r\n                    exitTimelineIterationCounter[indexBase]++;\r\n                    $(clipId).html(clipContentCache[indexBase]);\r\n                }\r\n            });\r\n        }\r\n    }\r\n    \r\n    return timeline;\r\n}\r\n\r\nfunction AnimateDissolveForShapes(stepsCount, shapeId, tiles, duration, delay) {\r\n    \r\n    var clipId = shapeId.replace(' > #', '') + '-clip';\r\n    var width ="
      );
      this.l6(
         " parseInt($(shapeId).css('width').replace('px', ''));\r\n    var height = parseInt($(shapeId).css('height').replace('px', ''));\r\n    var curOpacity = 0.0;\r\n    \r\n    if ($(clipId).length == 0) {\r\n        $('#svgdiv > svg > defs').append('<clipPath id=\"' + clipId.replace('#', '') + '\" viewbox=\"0 0 ' + width + ' ' + height + '\"></clipPath>');\r\n        $('#svgdiv').html($('#svgdiv').html());\r\n    }\r\n        \r\n    var timeline = anime.timeline({\r\n        targets: shapeId,\r\n        autoplay: false,\r\n        begin: function(anim) {\r\n            $(shapeId).show();\r\n            $(shapeId).css('opacity', curOpacity)\r\n            $(shapeId).css('clip-path', 'url(' + clipId + ')');\r\n        },\r\n        complete: function(anim) {\r\n            $(clipId).empty();\r\n            $(shapeId).css('clip-path', '');\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n        }\r\n    });\r\n\r\n    var indexBase = timeline.id;\r\n    var opacityStep = (1 - curOpacity) / stepsCount;\r\n    var"
      );
      this.n5("tilesCount", " tilesCount =", 70422, "", 70435, 0);
      this.a6();
      this.l6(" Math.ceil(tiles.length / stepsCount);");
      this.n5("timelinePolysCache[indexBase]", "\r\n    timelinePolysCache[indexBase] =", 70473, "", 70510, 0);
      this.a6();
      this.l6(" tiles;\r\n    \r\n    for (var");
      this.n5("i", " i =", 70537, "", 70541, 0);
      this.a6();
      this.l6(
         " 0; i < stepsCount; i++) {\r\n        \r\n        timeline.add({\r\n            duration: duration / stepsCount,\r\n            opacity: [curOpacity, curOpacity + opacityStep],\r\n            easing: 'linear',\r\n            complete: function(anim) {\r\n                \r\n                var j = anim.id - indexBase - 1;\r\n                \r\n                for (var k = tilesCount * j; k < tilesCount * (j + 1) && k < timelinePolysCache[indexBase].length; k++)\r\n                    clipContentCache[indexBase]"
      );
      this.n5("+", " +=", 71036, "", 71039, 0);
      this.a6();
      this.l6(
         " timelinePolysCache[indexBase][k];\r\n                \r\n                $(clipId).html(clipContentCache[indexBase]);\r\n            }\r\n        });\r\n        \r\n        curOpacity"
      );
      this.n5("+", " +=", 71211, "", 71214, 0);
      this.a6();
      this.l6(
         " opacityStep;\r\n    }\r\n    \r\n    return timeline;\r\n}\r\n\r\nfunction AnimateDissolveForShapesExit(stepsCount, shapeId, tiles, duration, delay, removeLast) {\r\n    \r\n    var"
      );
      this.n5("clipId", " clipId =", 71380, "", 71389, 0);
      this.a6();
      this.l6(
         " shapeId.replace(' > #', '') + '-clip';\r\n    var width = parseInt($(shapeId).css('width').replace('px', ''));\r\n    var height = parseInt($(shapeId).css('height').replace('px', ''));\r\n    var curOpacity = 1.0;\r\n    \r\n    if ($(clipId).length == 0) {\r\n        $('#svgdiv > svg > defs').append('<clipPath id=\"' + clipId.replace('#', '') + '\" viewbox=\"0 0 ' + width + ' ' + height + '\"></clipPath>');\r\n        $('#svgdiv').html($('#svgdiv').html());\r\n    }\r\n\r\n    var opacityStep = curOpacity / stepsCount;\r\n    var tilesStep = Math.ceil(tiles.length / stepsCount);\r\n        \r\n    var timeline = anime.timeline({\r\n        targets: shapeId,\r\n        autoplay: false,\r\n        begin: function(anim) {\r\n\r\n            $(clipId).empty();\r\n            for(var i = 0; i < timelinePolysCache[anim.id].length; i++)\r\n                clipContentCache[anim.id]"
      );
      this.n5("+", " +=", 72233, "", 72236, 0);
      this.a6();
      this.l6(
         " timelinePolysCache[anim.id][i] + '\\n';\r\n                \r\n            $(clipId).html(clipContentCache[anim.id]);\r\n            $(shapeId).css('clip-path', 'url(' + clipId + ')');\r\n        },\r\n        complete: function(anim) {\r\n            $(shapeId).hide();\r\n            $(clipId).empty();\r\n            $(shapeId).css('clip-path', '');\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n        }\r\n    });    \r\n    \r\n    var indexBase = timeline.id;\r\n    timelinePolysCache[indexBase] = tiles;\r\n    \r\n    for (var i = 0; i < stepsCount; i++) {"
      );
      this.n5("curMinOpacity", "\r\n         \r\n        curMinOpacity =", 72783, "", 72819, 0);
      this.a6();
      this.l6(" 1 - curOpacity / stepsCount * i;");
      this.n5("curMaxOpacity", "\r\n        curMaxOpacity =", 72852, "", 72877, 0);
      this.a6();
      this.l6(
         " 1 - curOpacity / stepsCount * (i + 1);\r\n            \r\n        timeline.add({\r\n            duration: duration / stepsCount,\r\n            delay:"
      );
      this.n5("(i", " (i =", 73020, "", 73025, 0);
      this.a6();
      this.l6(
         "= 0) ? delay : 0,\r\n            opacity: [curMinOpacity, curMaxOpacity],\r\n            easing: 'linear',\r\n            complete: function(anim) {\r\n                if (removeLast)\r\n                    clipContentCache[indexBase] = RemoveLastString(clipContentCache[indexBase], tilesStep);\r\n                else\r\n                    clipContentCache[indexBase] = RemoveFirstString(clipContentCache[indexBase], tilesStep);\r\n                \r\n                $(clipId).html(clipContentCache[indexBase]);\r\n            }\r\n        });\r\n    }\r\n    \r\n    return timeline;\r\n}\r\n\r\nfunction AnimatePeekForShape(shapeId, polys, duration, delay, direction) {\r\n\r\n    var stepsCount = polys.length;\r\n    \r\n    var clipId = shapeId.replace(' > #', '') + '-clip';\r\n    var width = parseInt($(shapeId).css('width').replace('px', ''));\r\n    var height = parseInt($(shapeId).css('height').replace('px', ''));\r\n    var curOpacity = 0.0;\r\n    \r\n    if ($(clipId).length == 0) {\r\n        $('#svgdiv > svg > defs').append('<clipPath id=\"' + clipId.repla"
      );
      this.l6(
         "ce('#', '') + '\" viewbox=\"0 0 ' + width + ' ' + height + '\"></clipPath>');\r\n        $('#svgdiv').html($('#svgdiv').html());\r\n    }\r\n    \r\n    var vertical = direction == 'Bottom' || direction == 'Top';\r\n    var positiveMovement = direction == 'Top' || direction == 'Left';\r\n    var translateStep = vertical ? height / stepsCount : width / stepsCount;\r\n    if (positiveMovement)\r\n        translateStep"
      );
      this.n5("*", " *=", 74449, "", 74452, 0);
      this.a6();
      this.l6(" -1;\r\n    \r\n    var");
      this.n5("timeline", " timeline =", 74471, "", 74482, 0);
      this.a6();
      this.l6(
         " anime.timeline({\r\n        targets: shapeId,\r\n        autoplay: false,\r\n        begin: function(anim) {            \r\n            $(shapeId).css('opacity', curOpacity)\r\n            $(shapeId).css('clip-path', 'url(' + clipId + ')');\r\n            $(shapeId).css('transform', vertical ? ('translateY(' + (positiveMovement ? height : -height) + 'px)') : ('translateX(' + (positiveMovement ? width : -width) + 'px)'));\r\n            $(shapeId).show();\r\n        },\r\n        complete: function(anim) {\r\n            $(clipId).empty();\r\n            $(shapeId).css('clip-path', '');\r\n            $(shapeId).css({'transform': ''});\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n        }\r\n    });\r\n\r\n    var indexBase = timeline.id;\r\n    var opacityStep = (1 - curOpacity) / stepsCount;\r\n    \r\n    for (var"
      );
      this.n5("i", " i =", 75284, "", 75288, 0);
      this.a6();
      this.l6(" 0; i < stepsCount; i++) {\r\n        \r\n        var");
      this.n5("curTranslate", " curTranslate =", 75337, "", 75352, 0);
      this.a6();
      this.l6(" (stepsCount - i) * translateStep;\r\n        var");
      this.n5("nextTranslate", " nextTranslate =", 75399, "", 75415, 0);
      this.a6();
      this.l6(
         " (stepsCount - i - 1) * translateStep;\r\n        \r\n        timeline.add({\r\n            duration: duration / stepsCount,\r\n            delay:"
      );
      this.n5("(i", " (i =", 75553, "", 75558, 0);
      this.a6();
      this.l6(
         "= 0) ? delay : 0,\r\n            opacity: [curOpacity, curOpacity + opacityStep],\r\n            translateX: vertical ? 0 : [curTranslate, nextTranslate],\r\n            translateY: vertical ? [curTranslate, nextTranslate] : 0,\r\n            easing: 'linear',\r\n            complete: function(anim) {\r\n                \r\n                var j = anim.id - indexBase - 1;\r\n                clipContentCache[indexBase] += polys[j];\r\n                $(clipId).html(clipContentCache[indexBase]);\r\n            }\r\n        });\r\n        \r\n        curOpacity += opacityStep;\r\n    }\r\n\r\n    return timeline;\r\n}\r\n\r\nfunction AnimatePeekForShapeExit(shapeId, polys, duration, delay, direction, removeLast) {\r\n\r\n    var stepsCount = polys.length;\r\n    \r\n    var clipId = shapeId.replace(' > #', '') + '-clip';\r\n    var width = parseInt($(shapeId).css('width').replace('px', ''));\r\n    var height = parseInt($(shapeId).css('height').replace('px', ''));\r\n    var curOpacity = 1.0;\r\n    \r\n    if ($(clipId).length == 0) {\r\n        $('#svgdiv > svg > def"
      );
      this.l6(
         "s').append('<clipPath id=\"' + clipId.replace('#', '') + '\" viewbox=\"0 0 ' + width + ' ' + height + '\"></clipPath>');\r\n        $('#svgdiv').html($('#svgdiv').html());\r\n    }\r\n    \r\n    var vertical = direction == 'Bottom' || direction == 'Top';\r\n    var positiveMovement = direction == 'Bottom' || direction == 'Right';\r\n    var translateStep = vertical ? height / stepsCount : width / stepsCount;\r\n    if (!positiveMovement)\r\n        translateStep"
      );
      this.n5("*", " *=", 77029, "", 77032, 0);
      this.a6();
      this.l6(" -1;\r\n    \r\n    var");
      this.n5("timeline", " timeline =", 77051, "", 77062, 0);
      this.a6();
      this.l6(
         " anime.timeline({\r\n        targets: shapeId,\r\n        autoplay: false,\r\n        begin: function(anim) {\r\n\r\n            $(clipId).empty();\r\n            for (var"
      );
      this.n5("i", " i =", 77221, "", 77225, 0);
      this.a6();
      this.l6(" 0; i < timelinePolysCache[anim.id].length; i++)\r\n                clipContentCache[indexBase]");
      this.n5("+", " +=", 77318, "", 77321, 0);
      this.a6();
      this.l6(
         " timelinePolysCache[anim.id][i] + '\\n';\r\n                \r\n            $(clipId).html(clipContentCache[anim.id]);\r\n            $(shapeId).css('clip-path', 'url(' + clipId + ')');\r\n        },\r\n        complete: function(anim) {\r\n            $(shapeId).hide();\r\n            $(clipId).empty();\r\n            $(shapeId).css('clip-path', '');\r\n            $('#svgdiv').html($('#svgdiv').html());\r\n        }\r\n    });\r\n\r\n    var indexBase = timeline.id;\r\n    var opacityStep = curOpacity / stepsCount;"
      );
      this.n5("timelinePolysCache[indexBase]", "\r\n    timelinePolysCache[indexBase] =", 77814, "", 77851, 0);
      this.a6();
      this.l6(" polys;\r\n    \r\n    for (var");
      this.n5("i", " i =", 77878, "", 77882, 0);
      this.a6();
      this.l6(" 0; i < stepsCount; i++) {\r\n        \r\n        var");
      this.n5("curTranslate", " curTranslate =", 77931, "", 77946, 0);
      this.a6();
      this.l6(" i * translateStep;\r\n        var");
      this.n5("nextTranslate", " nextTranslate =", 77978, "", 77994, 0);
      this.a6();
      this.l6(" (i + 1) * translateStep;\r\n        \r\n        timeline.add({\r\n            duration: duration / stepsCount,\r\n            delay:");
      this.n5("(i", " (i =", 78119, "", 78124, 0);
      this.a6();
      this.l6(
         "= 0) ? delay : 0,\r\n            opacity: [curOpacity, curOpacity + opacityStep],\r\n            translateX: vertical ? 0 : [curTranslate, nextTranslate],\r\n            translateY: vertical ? [curTranslate, nextTranslate] : 0,\r\n            easing: 'linear',\r\n            complete: function(anim) {\r\n                \r\n                if (removeLast)\r\n                    clipContentCache[indexBase] = RemoveLastString(clipContentCache[indexBase], 1);\r\n                else\r\n                    clipContentCache[indexBase] = RemoveFirstString(clipContentCache[indexBase], 1);\r\n                \r\n                $(clipId).html(clipContentCache[indexBase]);\r\n            }\r\n        });\r\n        \r\n        curOpacity -= opacityStep;\r\n    }\r\n\r\n    return timeline;\r\n}\r\n\r\nfunction GenerateBars(vertical, width, height, minWidth, maxWidth, barSize) {\r\n    \r\n    var cacheKey = 'bars-' + width + 'x' + height + '-' + minWidth + 'x' + maxWidth + 'x' + barSize + '-' + (vertical ? 'Vert' : 'Hor');\r\n    \r\n    var result = polygonsCache[cach"
      );
      this.l6(
         "eKey];\r\n    if (!result) {\r\n        \r\n        result = [];\r\n        var curPosition = 0;\r\n        var limit = vertical ? width : height;\r\n        var widths = [];\r\n            \r\n        while (curPosition < limit) {\r\n            \r\n            var"
      );
      this.n5("nextBarWidth", " nextBarWidth =", 79394, "", 79409, 0);
      this.a6();
      this.l6(
         " Math.floor((Math.random() * (maxWidth - minWidth)) + minWidth);\r\n            if (curPosition + nextBarWidth > limit)\r\n                nextBarWidth = limit - curPosition;\r\n            \r\n            if (nextBarWidth > 1)\r\n                widths.push(nextBarWidth);\r\n            \r\n            curPosition += nextBarWidth;\r\n        };\r\n            \r\n    \r\n        var prevStart = 0;\r\n        for(var i = 0; i < widths.length; i++) {\r\n            \r\n            var"
      );
      this.n5("curBarPolygons", " curBarPolygons =", 79869, "", 79886, 0);
      this.a6();
      this.l6(" [];\r\n            var");
      this.n5("center", " center =", 79907, "", 79916, 0);
      this.a6();
      this.l6(" Math.floor((widths[i] + prevStart * 2) / 2);\r\n            \r\n            var");
      this.n5("left", " left =", 79992, "", 79999, 0);
      this.a6();
      this.l6(" center - barSize;\r\n            var");
      this.n5("right", " right =", 80034, "", 80042, 0);
      this.a6();
      this.l6(
         " center;\r\n            while (left >= prevStart || right < prevStart + widths[i]) {\r\n                \r\n                if (left >= prevStart)\r\n                    curBarPolygons.push(GenerateBarPolygon(vertical, left, width, height, barSize));\r\n                if (right < prevStart + widths[i])\r\n                    curBarPolygons.push(GenerateBarPolygon(vertical, right, width, height, barSize));\r\n                \r\n                left"
      );
      this.n5("-", " -=", 80479, "", 80482, 0);
      this.a6();
      this.l6(" barSize;\r\n                right");
      this.n5("+", " +=", 80514, "", 80517, 0);
      this.a6();
      this.l6(" barSize;\r\n            }\r\n            \r\n            result.push(curBarPolygons);\r\n            \r\n            prevStart");
      this.n5("+", " +=", 80634, "", 80637, 0);
      this.a6();
      this.l6(" widths[i];\r\n        }");
      this.n5("polygonsCache[cacheKey]", "\r\n        \r\n        polygonsCache[cacheKey] =", 80659, "", 80704, 0);
      this.a6();
      this.l6(
         " result;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateBarPolygon(vertical, start, width, height, barSize) { \r\n    if (vertical)\r\n        return `<polygon points=\"${start},${0} ${start + barSize},${0} ${start + barSize},${height} ${start},${height}\"/>`;\r\n    else\r\n        return `<polygon points=\"${0},${start} ${width},${start} ${width},${start + barSize} ${0},${start + barSize}\"/>`;\r\n}\r\n\r\nfunction GenerateDissolvePolygons(width, height, xFraction, yFraction) {\r\n    \r\n    var cacheKey = 'dissolve-' + width + 'x' + height + '-' + xFraction + '/' + yFraction;\r\n    \r\n    var result = polygonsCache[cacheKey];\r\n    if (!result) {\r\n        \r\n        result = [];\r\n        var xStep = width / xFraction;\r\n        var yStep = height / yFraction;\r\n        var eps = 0.5;\r\n        \r\n        for(var i = 0; i < xFraction; i++) {\r\n            for(var"
      );
      this.n5("j", " j =", 81560, "", 81564, 0);
      this.a6();
      this.l6(" 0; j < yFraction; j++) {\r\n            \r\n                var");
      this.n5("x", " x =", 81624, "", 81628, 0);
      this.a6();
      this.l6(" xStep * i;\r\n                var");
      this.n5("y", " y =", 81660, "", 81664, 0);
      this.a6();
      this.l6(
         " yStep * j;\r\n                \r\n                result.push(`<polygon points=\"${x - eps},${y - eps} ${x + xStep + eps},${y - eps} ${x + xStep + eps},${y + yStep + eps} ${x - eps},${y + yStep + eps}\"/>`);\r\n            }\r\n        }\r\n        \r\n        polygonsCache[cacheKey] = result;\r\n    }\r\n        \r\n    return result;\r\n}\r\n\r\nfunction GenerateShapePolygons(stepsCount, shapeType, width, height) {\r\n    \r\n    var cacheKey = shapeType + '-' + width + 'x' + height;\r\n    var result = polygonsCache[cacheKey];\r\n    if (!result) {\r\n        \r\n        result = [];\r\n        var centerX = width / 2;\r\n        var centerY = height / 2;\r\n        \r\n        var xStep = width / stepsCount / 2;\r\n        var yStep = height / stepsCount / 2;\r\n        if (shapeType == 'Diamond' || shapeType == 'DiamondIn' || shapeType == 'DiamondOut') {\r\n            xStep *= 2;\r\n            yStep *= 2;\r\n        }\r\n        \r\n        var x, y;\r\n        var eps = 1;\r\n        \r\n        for(var i = 0; i < stepsCount; i++) {"
      );
      this.n5("x", "\r\n            \r\n            x =", 82655, "", 82686, 0);
      this.a6();
      this.l6(" xStep * i;");
      this.n5("y", "\r\n            y =", 82697, "", 82714, 0);
      this.a6();
      this.l6(" yStep * i;\r\n            \r\n            if");
      this.n5("(shapeType", " (shapeType =", 82755, "", 82768, 0);
      this.a6();
      this.l6(
         "= 'ZoomOut') {\r\n                x += xStep;\r\n                y += yStep;\r\n            }\r\n            \r\n            if (shapeType == 'Plus' || shapeType == 'PlusIn' || shapeType == 'PlusOut')\r\n                result.push(`<polygon points=\"${-xStep},${centerY - y} ${centerX - x},${centerY - y} ${centerX - x},${-yStep} ${centerX + x},${-yStep} ${centerX + x},${centerY - y} ${width + xStep},${centerY - y} ${width + xStep},${centerY + y} ${centerX + x},${centerY + y} ${centerX + x},${height + yStep} ${centerX - x},${height + yStep} ${centerX - x},${centerY + y} ${-xStep},${centerY + y} ${0},${centerY + y - yStep - eps} ${centerX - x + xStep + eps},${centerY + y - yStep - eps} ${centerX - x + xStep + eps},${height} ${centerX + x - xStep - eps},${height} ${centerX + x - xStep - eps},${centerY + y - yStep - eps} ${width},${centerY + y - yStep - eps} ${width},${centerY - y + yStep + eps} ${centerX + x - xStep - eps},${centerY - y + yStep + eps} ${centerX + x - xStep - eps},${0} ${centerX - x + xStep + eps},${0} ${cent"
      );
      this.l6(
         "erX - x + xStep + eps},${centerY - y + yStep + eps} ${0},${centerY - y + yStep + eps} ${0},${centerY + y - yStep - eps} ${-xStep},${centerY + y}\"/>`);\r\n            else if (shapeType == 'Diamond' || shapeType == 'DiamondIn' || shapeType == 'DiamondOut')\r\n                result.push(`<polygon points=\"${centerX - x},${centerY} ${centerX},${centerY - y} ${centerX + x},${centerY} ${centerX},${centerY + y} ${centerX},${centerY + y - yStep} ${centerX + x - xStep},${centerY} ${centerX},${centerY - y + yStep} ${centerX - x + xStep},${centerY} ${centerX},${centerY + y - yStep} ${centerX},${centerY + y}\"/>`);\r\n            else if (shapeType == 'ZoomIn')\r\n                result.push(`<polygon points=\"${0},${0} ${width},${0} ${width},${y} ${x},${y} ${x},${height - y} ${width - x},${height - y} ${width - x},${y} ${width},${y} ${width},${height} ${0},${height}\"/>`);\r\n            else if (shapeType == 'ZoomOut')\r\n                result.push(`<polygon points=\"${centerX - x},${centerY - y} ${centerX + x},${centerY - y} ${cent"
      );
      this.l6(
         "erX + x},${centerY + y} ${centerX - x},${centerY + y}\"/>`);\r\n        }\r\n        \r\n        if (shapeType == 'DiamondOut' || shapeType == 'PlusOut')\r\n            result = result.reverse();\r\n    \r\n        polygonsCache[shapeType] = result;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateSplitPolygons(stepsCount, width, height, horizontal, out) {\r\n    \r\n    var cacheKey = 'split-' + width + 'x' + height + '-' + (horizontal ? 'Hor' : 'Vert') + (out ? 'Out' : 'In');\r\n    var result = polygonsCache[cacheKey];\r\n    if (!result) {\r\n        \r\n        result = [];\r\n        var centerX = width / 2;\r\n        var centerY = height / 2;\r\n        \r\n        var xStep = width / stepsCount / 2;\r\n        var yStep = height / stepsCount / 2;\r\n         \r\n        var eps = horizontal ? yStep : xStep;\r\n        \r\n        var x, y;\r\n        \r\n        for(var i = 0; i <= stepsCount; i++) {\r\n            \r\n            x = xStep * i;\r\n            y = yStep * i;\r\n            \r\n            if (horizontal) {\r\n                if (out)\r"
      );
      this.l6(
         "\n                    result.push(`<polygon points=\"${0},${centerY - y} ${width},${centerY - y} ${width},${centerY + y} ${0},${centerY + y}\"/>`);\r\n                else\r\n                    result.push(`<polygon points=\"${0},${0} ${width},${0} ${width},${y + eps} ${0},${y + eps} ${0},${height - y - eps} ${width},${height - y - eps} ${width},${height} ${0},${height}\"/>`);\r\n            }\r\n            else {\r\n                if (out)\r\n                    result.push(`<polygon points=\"${centerX - x},${0} ${centerX + x},${0} ${centerX + x},${height} ${centerX - x},${height}\"/>`);\r\n                else\r\n                    result.push(`<polygon points=\"${0},${0} ${0},${height} ${x + eps},${height} ${x + eps},${0} ${width - x - eps},${0} ${width - x - eps},${height} ${width},${height} ${width},${0}\"/>`);\r\n            }\r\n        }\r\n    \r\n        polygonsCache[cacheKey] = result;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateWipePolygons(stepsCount, direction, width, height) {\r\n    \r\n    var cacheKey = 'wipe-'"
      );
      this.l6(
         " + direction + '-' + width + 'x' + height;\r\n    var result = polygonsCache[cacheKey];\r\n    var horizontal = direction == 'Up' || direction == 'Down';\r\n    \r\n    if (!result) {\r\n        \r\n        result = [];\r\n        \r\n        var xStep = width / stepsCount;\r\n        var yStep = height / stepsCount;\r\n        var oppositeDir = (direction == 'Left' || direction == 'Up') ? -1 : 1;\r\n        \r\n        var x = direction == 'Left' ? width : -xStep;\r\n        var y = direction == 'Up' ? height : -yStep;\r\n        var eps = 0.8;\r\n        \r\n        for(var i = 0; i <= stepsCount; i++) {\r\n            \r\n            x += oppositeDir * xStep;\r\n            y += oppositeDir * yStep;\r\n            \r\n            if (horizontal)\r\n                result.push(`<polygon points=\"${0},${y} ${width},${y} ${width},${y + yStep + eps} ${0},${y + yStep + eps}\"/>`);\r\n            else\r\n                result.push(`<polygon points=\"${x},${0} ${x + xStep + eps},${0} ${x + xStep + eps},${height} ${x},${height}\"/>`);\r\n        }\r\n    \r\n        pol"
      );
      this.l6(
         "ygonsCache[cacheKey] = result;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateHoneycombPolygons(fullTile) {\r\n    \r\n    var cacheKey = 'honeycomb' + fullTile;\r\n    var result = polygonsCache[cacheKey];\r\n    \r\n    if (!result) {\r\n        \r\n        result = [];\r\n        \r\n        var sideLength = 50;\r\n        var gapLength = 10;\r\n        var angle = 75;\r\n        \r\n        var sinCoef = Math.sin(DegreesToRadians(angle));\r\n        var cosCoef = Math.cos(DegreesToRadians(angle));\r\n        var even = true;\r\n        var yShift = 0;\r\n        \r\n        var startX = fullTile ? -sideLength : sideLength;\r\n        var startY = fullTile ? -sideLength : sideLength * cosCoef + sideLength + gapLength * cosCoef * 3 + 10;\r\n        var maxX = fullTile ? frameWidth + sideLength : frameWidth - sideLength;\r\n        var maxY = fullTile ? frameHeight : frameHeight - sideLength * 2;\r\n        \r\n        for (var x = startX; x < maxX; x"
      );
      this.n5("+", " +=", 88817, "", 88820, 0);
      this.a6();
      this.l6(" sideLength * sinCoef + gapLength * sinCoef / 2)\r\n        {\r\n            for (var");
      this.n5("y", " y =", 88901, "", 88905, 0);
      this.a6();
      this.l6(" startY - yShift; y < maxY; y");
      this.n5("+", " +=", 88934, "", 88937, 0);
      this.a6();
      this.l6(" 2 * (sideLength + sideLength * cosCoef + gapLength * cosCoef * 3)) \r\n            {\r\n                var");
      this.n5("x1", " x1 =", 89041, "", 89046, 0);
      this.a6();
      this.l6(" x;\r\n                var");
      this.n5("y1", " y1 =", 89070, "", 89075, 0);
      this.a6();
      this.l6(" y;\r\n                var");
      this.n5("x2", " x2 =", 89099, "", 89104, 0);
      this.a6();
      this.l6(" x + sideLength * sinCoef;\r\n                var");
      this.n5("y2", " y2 =", 89151, "", 89156, 0);
      this.a6();
      this.l6(" y + sideLength * cosCoef;\r\n                var");
      this.n5("x3", " x3 =", 89203, "", 89208, 0);
      this.a6();
      this.l6(" x2;\r\n                var");
      this.n5("y3", " y3 =", 89233, "", 89238, 0);
      this.a6();
      this.l6(" y2 + sideLength;\r\n                var");
      this.n5("x4", " x4 =", 89276, "", 89281, 0);
      this.a6();
      this.l6(" x;\r\n                var");
      this.n5("y4", " y4 =", 89305, "", 89310, 0);
      this.a6();
      this.l6(" y3 + sideLength * cosCoef;\r\n                var");
      this.n5("x5", " x5 =", 89358, "", 89363, 0);
      this.a6();
      this.l6(" x - sideLength * sinCoef;\r\n                var");
      this.n5("y5", " y5 =", 89410, "", 89415, 0);
      this.a6();
      this.l6(" y3;\r\n                var");
      this.n5("x6", " x6 =", 89440, "", 89445, 0);
      this.a6();
      this.l6(" x5;\r\n                var");
      this.n5("y6", " y6 =", 89470, "", 89475, 0);
      this.a6();
      this.l6(
         " y2;\r\n                \r\n                result.push(`<polygon points=\"${x1},${y1} ${x2},${y2} ${x3},${y3} ${x4},${y4} ${x5},${y5} ${x6},${y6}\"/>`);\r\n            }\r\n            \r\n            even = !even;\r\n            yShift = even ? 0 : sideLength * cosCoef + sideLength + gapLength * cosCoef * 3;\r\n        }\r\n        \r\n        ShuffleArray(result);\r\n        \r\n        polygonsCache[cacheKey] = result;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateCombPolygons(direction) {\r\n    \r\n    var cacheKey = 'comb' + direction;\r\n    var result = polygonsCache[cacheKey];\r\n    var horizontal = direction == 'Horizontal';\r\n    \r\n    if (!result) {\r\n        \r\n        result = [];\r\n        var eps = 1;\r\n        \r\n        if (horizontal) {\r\n            var heightStep = frameHeight / 8 + eps;\r\n            for(var i = 0; i < 8; i++)\r\n                result.push(`<polygon points=\"${0},${heightStep * i - eps} ${frameWidth + 5},${heightStep * i - eps} ${frameWidth + 5},${heightStep * (i + 1) + eps} ${0},${heightStep * (i + "
      );
      this.l6(
         "1) + eps}\"/>`);\r\n            result = result.reverse();\r\n        }\r\n        else {\r\n            var widthStep = frameWidth / 8;\r\n            for(var i = 0; i < 8; i++)\r\n                result.push(`<polygon points=\"${widthStep * i - eps},${0} ${widthStep * i - eps},${frameHeight} ${widthStep * (i + 1) + eps},${frameHeight} ${widthStep * (i + 1) + eps},${0}\"/>`);\r\n        }\r\n        \r\n        polygonsCache[cacheKey] = result;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateWheelSectors(wheelType, stepsCount, width, height) {\r\n        \r\n    var cacheKey = wheelType + '-' + width + 'x' + height;\r\n    var result = polygonsCache[cacheKey];\r\n    if (!result) {\r\n        \r\n        result = [];\r\n        var angleStep = 360 / stepsCount;\r\n        var currentAngle = 0;\r\n        var radius = Math.max(width, height) + 10;\r\n        var centerX = width / 2;\r\n        var centerY = height / 2;\r\n        var angleFix = wheelType == 'WheelReverse' ? -2 : 2;\r\n        \r\n        var opts = {\r\n            cx: centerX,\r\n     "
      );
      this.l6(
         "       cy: centerY,\r\n            radius: radius,\r\n            start_angle: angleFix ,\r\n            end_angle: wheelType == 'WheelReverse' ? -angleStep: angleStep\r\n        };\r\n        \r\n        var start, end, largeArcFlag;\r\n        \r\n        for (var i = 0; i < stepsCount && opts.end_angle + angleFix < 362; i++) {"
      );
      this.n5("start", "\r\n            \r\n            start =", 91838, "", 91873, 0);
      this.a6();
      this.l6(" PolarToCartesian(opts.cx, opts.cy, opts.radius, opts.end_angle + angleFix);");
      this.n5("end", "\r\n            end =", 91949, "", 91968, 0);
      this.a6();
      this.l6(" PolarToCartesian(opts.cx, opts.cy, opts.radius, opts.start_angle - angleFix);");
      this.n5("largeArcFlag", "\r\n            largeArcFlag =", 92046, "", 92074, 0);
      this.a6();
      this.l6(
         " opts.end_angle - opts.start_angle <= 180 ? \"0\" : \"1\";\r\n            \r\n            var pathData = [\r\n                \"M\", start.x, start.y,\r\n                \"A\", opts.radius, opts.radius, 0, largeArcFlag, 0, end.x, end.y,\r\n                \"L\", opts.cx, opts.cy,\r\n                \"Z\"\r\n            ].join(\" \");\r\n            \r\n            if (wheelType == 'WheelReverse') {\r\n                opts.start_angle -= angleStep;\r\n                opts.end_angle -= angleStep;\r\n            }\r\n            else {\r\n                opts.start_angle += angleStep;\r\n                opts.end_angle += angleStep;\r\n            }\r\n            \r\n            result.push('<path d=\"' + pathData + '\"/>');\r\n        }\r\n        \r\n        if (wheelType == 'Wedge') {\r\n            var resultRearranged = [];\r\n            for (var i = 0; i < stepsCount / 2; i++) {\r\n                resultRearranged.push(result[i]);\r\n                resultRearranged.push(result[result.length - i]);\r\n            }"
      );
      this.n5("result", "\r\n            result =", 93040, "", 93062, 0);
      this.a6();
      this.l6(" resultRearranged;\r\n        }\r\n        \r\n        if");
      this.n5("(wheelType", " (wheelType =", 93113, "", 93126, 0);
      this.a6();
      this.l6(
         "= 'Wheel2') {\r\n            var resultRearranged = [];\r\n            for (var i = 0; i < stepsCount / 2; i++) {\r\n                resultRearranged.push(result[i]);\r\n                resultRearranged.push(result[stepsCount / 2 + i]);\r\n            }"
      );
      this.n5("result", "\r\n            result =", 93369, "", 93391, 0);
      this.a6();
      this.l6(" resultRearranged;\r\n        }\r\n        \r\n        if");
      this.n5("(wheelType", " (wheelType =", 93442, "", 93455, 0);
      this.a6();
      this.l6("= 'Wheel3') {\r\n            var resultRearranged = [];\r\n            var third = Math.floor(stepsCount / 3);\r\n            var");
      this.n5("third2", " third2 =", 93578, "", 93587, 0);
      this.a6();
      this.l6(" Math.floor(stepsCount / 3 * 2);\r\n            for (var");
      this.n5("i", " i =", 93641, "", 93645, 0);
      this.a6();
      this.l6(
         " 0; i < third; i++) {\r\n                resultRearranged.push(result[i]);\r\n                resultRearranged.push(result[third + i]);\r\n                resultRearranged.push(result[third2 + i]);\r\n            }"
      );
      this.n5("result", "\r\n            result =", 93851, "", 93873, 0);
      this.a6();
      this.l6(" resultRearranged;\r\n        }\r\n        \r\n        if");
      this.n5("(wheelType", " (wheelType =", 93924, "", 93937, 0);
      this.a6();
      this.l6("= 'Wheel4') {\r\n            var resultRearranged = [];\r\n            var quater = Math.floor(stepsCount / 4);\r\n            var");
      this.n5("half", " half =", 94061, "", 94068, 0);
      this.a6();
      this.l6(" stepsCount / 2;\r\n            var");
      this.n5("quater3", " quater3 =", 94101, "", 94111, 0);
      this.a6();
      this.l6(" Math.floor(stepsCount / 4 * 3);\r\n            for (var");
      this.n5("i", " i =", 94165, "", 94169, 0);
      this.a6();
      this.l6(
         " 0; i < quater; i++) {\r\n                resultRearranged.push(result[i]);\r\n                resultRearranged.push(result[quater + i]);\r\n                resultRearranged.push(result[half + i]);\r\n                resultRearranged.push(result[quater3 + i]);\r\n            }"
      );
      this.n5("result", "\r\n            result =", 94436, "", 94458, 0);
      this.a6();
      this.l6(" resultRearranged;\r\n        }\r\n        \r\n        if");
      this.n5("(wheelType", " (wheelType =", 94509, "", 94522, 0);
      this.a6();
      this.l6("= 'Wheel8') {\r\n            var resultRearranged = [];\r\n            var eight = Math.floor(stepsCount / 8);\r\n            var");
      this.n5("quater", " quater =", 94645, "", 94654, 0);
      this.a6();
      this.l6(" Math.floor(stepsCount / 4);\r\n            var");
      this.n5("eight3", " eight3 =", 94699, "", 94708, 0);
      this.a6();
      this.l6(" Math.floor(stepsCount / 8 * 3);\r\n            var");
      this.n5("half", " half =", 94757, "", 94764, 0);
      this.a6();
      this.l6(" stepsCount / 2;\r\n            var");
      this.n5("eight5", " eight5 =", 94797, "", 94806, 0);
      this.a6();
      this.l6(" Math.floor(stepsCount / 8 * 5);\r\n            var");
      this.n5("quater3", " quater3 =", 94855, "", 94865, 0);
      this.a6();
      this.l6(" Math.floor(stepsCount / 4 * 3);\r\n            var");
      this.n5("eight7", " eight7 =", 94914, "", 94923, 0);
      this.a6();
      this.l6(" Math.floor(stepsCount / 8 * 7);\r\n            for (var");
      this.n5("i", " i =", 94977, "", 94981, 0);
      this.a6();
      this.l6(
         " 0; i < eight; i++) {\r\n                resultRearranged.push(result[i]);\r\n                resultRearranged.push(result[eight + i]);\r\n                resultRearranged.push(result[quater + i]);\r\n                resultRearranged.push(result[eight3 + i]);\r\n                resultRearranged.push(result[half + i]);\r\n                resultRearranged.push(result[eight5 + i]);\r\n                resultRearranged.push(result[quater3 + i]);\r\n                resultRearranged.push(result[eight7 + i]);\r\n            }"
      );
      this.n5("result", "\r\n            result =", 95486, "", 95508, 0);
      this.a6();
      this.l6(" resultRearranged;\r\n        }");
      this.n5("polygonsCache[cacheKey]", "\r\n        \r\n        polygonsCache[cacheKey] =", 95537, "", 95582, 0);
      this.a6();
      this.l6(
         " result;    \r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateCircles(stepsCount, width, height) {\r\n    \r\n    var cacheKey = 'circles-' + width + 'x' + height;\r\n    \r\n    var result = polygonsCache[cacheKey];\r\n    if (!result) {\r\n    \r\n        result = [];\r\n        var centerX = width / 2;\r\n        var"
      );
      this.n5("centerY", " centerY =", 95892, "", 95902, 0);
      this.a6();
      this.l6(" height / 2;\r\n        \r\n        var");
      this.n5("minRadius", " minRadius =", 95937, "", 95949, 0);
      this.a6();
      this.l6(" 1;\r\n        var");
      this.n5("maxRadius", " maxRadius =", 95965, "", 95977, 0);
      this.a6();
      this.l6(" Math.max(width, height) / 2 * 1.4142;\r\n        var");
      this.n5("radiusStep", " radiusStep =", 96028, "", 96041, 0);
      this.a6();
      this.l6(" (maxRadius - minRadius) / stepsCount;\r\n        var");
      this.n5("radius", " radius =", 96092, "", 96101, 0);
      this.a6();
      this.l6(" minRadius;\r\n\r\n        \r\n        var");
      this.n5("opts", " opts =", 96137, "", 96144, 0);
      this.a6();
      this.l6(
         " {\r\n            cx: centerX,\r\n            cy: centerY,\r\n            radius: radius,\r\n            start_angle: 0,\r\n            end_angle: 359.999\r\n        };\r\n        \r\n        for(var"
      );
      this.n5("i", " i =", 96327, "", 96331, 0);
      this.a6();
      this.l6(" 0; i < stepsCount; i++) {");
      this.n5("start", "\r\n            \r\n            start =", 96357, "", 96392, 0);
      this.a6();
      this.l6(" PolarToCartesian(opts.cx, opts.cy, opts.radius, opts.end_angle);");
      this.n5("end", "\r\n            end =", 96457, "", 96476, 0);
      this.a6();
      this.l6(" PolarToCartesian(opts.cx, opts.cy, opts.radius, opts.start_angle);");
      this.n5("largeArcFlag", "\r\n            largeArcFlag =", 96543, "", 96571, 0);
      this.a6();
      this.l6(
         " opts.end_angle - opts.start_angle <= 180 ? \"0\" : \"1\";\r\n            \r\n            var pathData = [\r\n                \"M\", start.x, start.y,\r\n                \"A\", opts.radius, opts.radius, 0, largeArcFlag, 0, end.x, end.y,\r\n                \"L\", opts.cx, opts.cy,\r\n                \"Z\"\r\n            ].join(\" \");\r\n            \r\n            opts.radius += radiusStep;\r\n            \r\n            result.push('<path d=\"' + pathData + '\"/>');\r\n        }\r\n        \r\n        polygonsCache[cacheKey] = result;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateRings(stepsCount, width, height, out) {\r\n    \r\n    var cacheKey = 'rings' + '-' + width + 'x' + height + '-' + (out ? 'Out' : 'In');\r\n    var result = polygonsCache[cacheKey];\r\n    if (!result) {\r\n    \r\n        result = [];\r\n        var centerX = width / 2;\r\n        var centerY = height / 2;\r\n        \r\n        var minRadius = 1;\r\n        var maxRadius = Math.max(width, height) / 2 * 1.4142;\r\n        var radiusStep = (maxRadius - minRadius) / stepsCount;\r\n        var"
      );
      this.l6(
         " radius = minRadius;\r\n        var eps = 2;\r\n        \r\n        var opts = {\r\n            cx: centerX,\r\n            cy: centerY,\r\n            radius: radius,\r\n            start_angle: 0,\r\n            end_angle: 359.999\r\n        };\r\n        \r\n        \r\n        for(var i = 0; i < stepsCount; i++) {\r\n            var"
      );
      this.n5("pathData", " pathData =", 97907, "", 97918, 0);
      this.a6();
      this.l6(
         " [\r\n                \"M\", opts.cx, (opts.cy - opts.radius),\r\n                \"A\", opts.radius, opts.radius, 0, 1, 0, opts.cx, opts.cy + opts.radius,\r\n                \"A\", opts.radius, opts.radius, 0, 1, 0, opts.cx, opts.cy - opts.radius,\r\n                \"Z\",\r\n                \"M\", opts.cx, (opts.cy - opts.radius - radiusStep - eps),\r\n                \"A\", opts.radius - radiusStep, opts.radius - radiusStep, 0, 1, 1, opts.cx, opts.cy + opts.radius - radiusStep + eps,\r\n                \"A\", opts.radius - radiusStep, opts.radius - radiusStep, 0, 1, 1, opts.cx, opts.cy - opts.radius - radiusStep - eps,\r\n                \"Z\"\r\n            ].join(\" \");\r\n            \r\n            opts.radius += radiusStep;\r\n            \r\n            result.push('<path d=\"' + pathData + '\"/>');\r\n        }\r\n        \r\n        // fix: filling center hole"
      );
      this.n5("opts.radius", "\r\n        opts.radius =", 98750, "", 98773, 0);
      this.a6();
      this.l6(" minRadius\r\n        for(var");
      this.n5("i", " i =", 98800, "", 98804, 0);
      this.a6();
      this.l6(" 0; i < 3; i++) {");
      this.n5("start", "\r\n            start =", 98821, "", 98842, 0);
      this.a6();
      this.l6(" PolarToCartesian(opts.cx, opts.cy, opts.radius, opts.end_angle);");
      this.n5("end", "\r\n            end =", 98907, "", 98926, 0);
      this.a6();
      this.l6(" PolarToCartesian(opts.cx, opts.cy, opts.radius, opts.start_angle);");
      this.n5("largeArcFlag", "\r\n            largeArcFlag =", 98993, "", 99021, 0);
      this.a6();
      this.l6(
         " opts.end_angle - opts.start_angle <= 180 ? \"0\" : \"1\";\r\n            \r\n            var pathData = [\r\n                \"M\", start.x, start.y,\r\n                \"A\", opts.radius, opts.radius, 0, largeArcFlag, 0, end.x, end.y,\r\n                \"L\", opts.cx, opts.cy,\r\n                \"Z\"\r\n            ].join(\" \");\r\n            \r\n            opts.radius += radiusStep * 2;\r\n            \r\n            result.splice(i, 0, '<path d=\"' + pathData + '\"/>');\r\n        }\r\n        \r\n        if (out)\r\n            result = result.reverse();\r\n        \r\n        polygonsCache[cacheKey] = result;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateBlindsPolygons(stepsCount, width, height, horizontal) {\r\n    \r\n    var cacheKey = 'blinds-' + width + 'x' + height + '-' + (horizontal ? 'Hor' : 'Vert');\r\n    var result = polygonsCache[cacheKey];\r\n    if (!result) {\r\n        \r\n        result = [];\r\n        \r\n        var xStep = width / stepsCount / 6;\r\n        var yStep = height / stepsCount / 6;\r\n        \r\n        var sixth = horizonta"
      );
      this.l6(
         "l ? height / 6 : width / 6;\r\n        var third = horizontal ? height / 3 : width / 3;\r\n        var half = horizontal ? height / 2 : width / 2;\r\n        var third2 = horizontal ? height / 3 * 2 : width / 3 * 2;\r\n        var sixth5 = horizontal ? height / 6 * 5 : width / 6 * 5;\r\n         \r\n        var eps = horizontal ? yStep : xStep;\r\n        \r\n        var x, y;\r\n        \r\n        for(var i = 0; i < stepsCount; i++) {"
      );
      this.n5("x", "\r\n            \r\n            x =", 100465, "", 100496, 0);
      this.a6();
      this.l6(" xStep * i;");
      this.n5("y", "\r\n            y =", 100507, "", 100524, 0);
      this.a6();
      this.l6(
         " yStep * i;\r\n            \r\n            if (horizontal) {\r\n                result.push(`<polygon points=\"${0},${y} ${width},${y} ${width},${y + yStep + eps} ${0},${y + yStep + eps}\"/>`);\r\n                result.push(`<polygon points=\"${0},${sixth + y} ${width},${sixth + y} ${width},${sixth + y + yStep + eps} ${0},${sixth + y + yStep + eps}\"/>`);\r\n                result.push(`<polygon points=\"${0},${third + y} ${width},${third + y} ${width},${third + y + yStep + eps} ${0},${third + y + yStep + eps}\"/>`);\r\n                result.push(`<polygon points=\"${0},${half + y} ${width},${half + y} ${width},${half + y + yStep + eps} ${0},${half + y + yStep + eps}\"/>`);\r\n                result.push(`<polygon points=\"${0},${third2 + y} ${width},${third2 + y} ${width},${third2 + y + yStep + eps} ${0},${third2 + y + yStep + eps}\"/>`);\r\n                result.push(`<polygon points=\"${0},${sixth5 + y} ${width},${sixth5 + y} ${width},${sixth5 + y + yStep + eps} ${0},${sixth5 + y + yStep + eps}\"/>`);\r\n            }\r\n            e"
      );
      this.l6(
         "lse {\r\n                result.push(`<polygon points=\"${x},${0} ${x + xStep + eps},${0} ${x + xStep + eps},${height} ${x},${height}\"/>`);\r\n                result.push(`<polygon points=\"${sixth + x},${0} ${sixth + x + xStep + eps},${0} ${sixth + x + xStep + eps},${height} ${sixth + x},${height}\"/>`);\r\n                result.push(`<polygon points=\"${third + x},${0} ${third + x + xStep + eps},${0} ${third + x + xStep + eps},${height} ${third + x},${height}\"/>`);\r\n                result.push(`<polygon points=\"${half + x},${0} ${half + x + xStep + eps},${0} ${half + x + xStep + eps},${height} ${half + x},${height}\"/>`);\r\n                result.push(`<polygon points=\"${third2 + x},${0} ${third2 + x + xStep + eps},${0} ${third2 + x + xStep + eps},${height} ${third2 + x},${height}\"/>`);\r\n                result.push(`<polygon points=\"${sixth5 + x},${0} ${sixth5 + x + xStep + eps},${0} ${sixth5 + x + xStep + eps},${height} ${sixth5 + x},${height}\"/>`);\r\n            }\r\n        }\r\n    \r\n        polygonsCache[cacheKey] = r"
      );
      this.l6(
         "esult;\r\n    }\r\n    \r\n    return result;\r\n}\r\n\r\nfunction GenerateStripsPolygons(width, height, fraction, direction) {\r\n    \r\n    var cacheKey = 'strips-' + width + 'x' + height + '-' + fraction + '-' + direction;\r\n        \r\n    var result = polygonsCache[cacheKey];\r\n    if (!result) {\r\n        \r\n        result = [];\r\n        var sortedPolys = {};\r\n        var xStep = width / fraction;\r\n        var yStep = height / fraction;\r\n        var eps = 0.5;\r\n        \r\n        for(var i = 0; i < fraction; i++) {\r\n            for(var"
      );
      this.n5("j", " j =", 103097, "", 103101, 0);
      this.a6();
      this.l6(" 0; j < fraction; j++) {\r\n                \r\n                var");
      this.n5("x", " x =", 103164, "", 103168, 0);
      this.a6();
      this.l6(" xStep * i;\r\n                var");
      this.n5("y", " y =", 103200, "", 103204, 0);
      this.a6();
      this.l6(" yStep * j;\r\n                \r\n                var");
      this.n5("sum", " sum =", 103254, "", 103260, 0);
      this.a6();
      this.l6(" i + j;\r\n                \r\n                if");
      this.n5("(sortedPolys[sum]", " (sortedPolys[sum] =", 103305, "", 103325, 0);
      this.a6();
      this.l6(
         "= null)\r\n                    sortedPolys[sum] = [];\r\n                \r\n                if (direction == 'DownRight')\r\n                    sortedPolys[sum].push(`<polygon points=\"${x - eps},${y - eps} ${x + xStep + eps},${y - eps} ${x + xStep + eps},${y + yStep + eps} ${x - eps},${y + yStep + eps}\"/>`);\r\n                else if (direction == 'DownLeft')\r\n                    sortedPolys[sum].push(`<polygon points=\"${width - x + eps},${y - eps} ${width - x - xStep - eps},${y - eps} ${width - x - xStep - eps},${y + yStep + eps} ${width - x + eps},${y + yStep + eps}\"/>`);\r\n                else if (direction == 'UpRight')\r\n                    sortedPolys[sum].push(`<polygon points=\"${x - eps},${height - y + eps} ${x + xStep + eps},${height - y + eps} ${x + xStep + eps},${height - y - yStep - eps} ${x - eps},${height - y - yStep - eps}\"/>`);\r\n                else if (direction == 'UpLeft')\r\n                    sortedPolys[sum].push(`<polygon points=\"${width - x + eps},${height - y + eps} ${width - x - xStep - eps},$"
      );
      this.l6(
         "{height - y + eps} ${width - x - xStep - eps},${height - y - yStep - eps} ${width - x + eps},${height - y - yStep - eps}\"/>`);\r\n            }\r\n        }\r\n\r\n        for (var key in sortedPolys) {\r\n            for(var i = 0; i < sortedPolys[key].length; i++)\r\n                result.push(sortedPolys[key][i]);\r\n        }"
      );
      this.n5("polygonsCache[cacheKey]", "\r\n        \r\n        polygonsCache[cacheKey] =", 104667, "", 104712, 0);
      this.a6();
      this.l6(
         " result;\r\n    }\r\n        \r\n    return result;\r\n}\r\n\r\n\r\nfunction PolarToCartesian(centerX, centerY, radius, angleInDegrees) {\r\n    var"
      );
      this.n5("angleInRadians", " angleInRadians =", 104844, "", 104861, 0);
      this.a6();
      this.l6(
         " (angleInDegrees - 90) * Math.PI / 180.0;\r\n\r\n    return {\r\n        x: centerX + (radius * Math.cos(angleInRadians)),\r\n        y: centerY + (radius * Math.sin(angleInRadians))\r\n    };\r\n}\r\n\r\nfunction DegreesToRadians (angle) {\r\n  return angle * (Math.PI / 180);\r\n}\r\n\r\nfunction ShuffleArray(array) {\r\n    var"
      );
      this.n5("currentIndex", " currentIndex =", 105166, "", 105181, 0);
      this.a6();
      this.l6(" array.length;\r\n    var temporaryValue, randomIndex;\r\n    \r\n    while (0");
      this.n5("!", " !=", 105253, "", 105256, 0);
      this.a6();
      this.l6(
         "= currentIndex) {\r\n        randomIndex = Math.floor(Math.random() * currentIndex);\r\n        currentIndex -= 1;\r\n        temporaryValue = array[currentIndex];\r\n        array[currentIndex] = array[randomIndex];\r\n        array[randomIndex] = temporaryValue;\r\n    }\r\n    \r\n    return array;\r\n}\r\n\r\nfunction RemoveFirstString(text, count) {\r\n\r\n    var lines = text.split('\\n');\r\n    lines.splice(0, count);\r\n    return lines.join('\\n');    \r\n}\r\n\r\nfunction RemoveLastString(text, count) {\r\n\r\n    var lines = text.split('\\n');\r\n    lines.splice(lines.length - count, count);\r\n    return lines.join('\\n');\r\n}\r\n\r\nfunction StackSlides(foreground, background) {\r\n    $(background).css(\"z-index\", 1);\r\n    $(foreground).css(\"z-index\", 2);\r\n}\r\n\r\nfunction GetDuration(slideId) {\r\n    var transitionSpeed = $(slideId).data(\"transitionSpeed\");\r\n    \r\n    var duration = 700;\r\n    if(transitionSpeed == 'Fast') { duration = 400; } \r\n    else if(transitionSpeed == 'Medium') { duration = 700; } \r\n    else if(transitionSpeed == 'Slow') { durat"
      );
      this.l6(
         "ion = 1500; } \r\n    \r\n    return duration;\r\n}\r\n\r\nfunction ShowNext() {\n      \n    if (currentVisiblePage < maxVisiblePage) {\n        var prevSlideId = '#slide-' + currentVisiblePage++;\n        var slideId = '#slide-' + currentVisiblePage;\n        \n        if ( "
      );
      this.k5(var2);
      this.l6(
         " )\n            PrepareAndPlayTransition(slideId, prevSlideId, 'next');\n    }\n}\n\r\nfunction ShowPrev() {\n      \n    if (currentVisiblePage > 1) {\n        var prevSlideId = '#slide-' + currentVisiblePage--;\n        var slideId = '#slide-' + currentVisiblePage;\n        \n        if ( "
      );
      this.k5(var2);
      this.l6(" )\n            PrepareAndPlayTransition(slideId, prevSlideId, 'all');\n    }\n}\n\r\n");
   }
}
