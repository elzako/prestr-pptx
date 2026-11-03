package com.aspose.slides;

class o5i extends r6o<Presentation> {
   public o5i(TemplateContext<Presentation> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Presentation var1 = this.u3().getObject();
      String var2 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.n3.l6(this.u3().getGlobal().<Boolean>get("navigationEnabled")));
      String var3 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.n3.l6(this.u3().getGlobal().<Boolean>get("animateTransitions")));
      String var4 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.n3.l6(this.u3().getGlobal().<Boolean>get("animateShapes")));
      int var5 = var1.getSlides().size();
      this.l6("\r\nvar currentVisiblePage = 0;\r\nvar maxVisiblePage = ");
      this.n5(var5);
      this.l6(";\r\n\r\n$(document).ready(function(){\r\n      \r\n    if (");
      this.k5(var2);
      this.l6(")\r\n        InitNavigation();\r\n    \r\n    if (!");
      this.k5(var3);
      this.l6(
         ")\r\n        ShowSlide(1);\r\n    else\r\n        currentVisiblePage = 1;\r\n    ChangeThumbSelection(1);\r\n});\r\n\r\nfunction InitNavigation() {\r\n      \r\n    if ($(\".navigationArea\")[0].scrollHeight <= $(\".navigationArea\")[0].clientHeight) {\r\n        $(\".navigationArea\").css('width', '222');    \r\n        $('.navigationArea').addClass('navigationAreaBorder');\r\n    }\r\n    else {\r\n        $(\".navigationArea\").css('width', '');    \r\n        $('.navigationArea').removeClass('navigationAreaBorder');\r\n    }\r\n    \r\n    SetThumbnailClickHandler();\r\n}\r\n\r\nfunction RemoveThumbnailClickHandler() {\r\n    $(\".slideThumb\").unbind();\r\n}\r\n\r\nfunction SetThumbnailClickHandler() {\r\n    RemoveThumbnailClickHandler();\r\n    $(\".slideThumb\").click(function(){ ShowSlide($(this).data('number')); });\r\n}\r\n\r\nfunction ShowSlide(nextVisiblePage) {\r\n    \r\n    if (nextVisiblePage != currentVisiblePage) {         \r\n        ChangeThumbSelection(nextVisiblePage);\r\n        var prevSlideId = '#slide-' + currentVisiblePage;\r\n        var slideId = '#slide-' + n"
      );
      this.l6("extVisiblePage;\r\n        currentVisiblePage = nextVisiblePage;\r\n        \r\n        if (");
      this.k5(var3);
      this.l6(") {\r\n            if (");
      this.k5(var4);
      this.l6(
         ")\r\n                PauseAllEffects(animations);\r\n            \r\n            PrepareAndPlayTransition(slideId, prevSlideId);\r\n        }\r\n        else {\r\n            StackSlides(slideId, prevSlideId);\r\n            $(prevSlideId).hide();\r\n            $(slideId).show();\r\n            \r\n            if ("
      );
      this.k5(var4);
      this.l6(
         ") {\r\n                PauseAllEffects(prevAnimations);\r\n                RestoreAllEffects(prevAnimations);\r\n                AnimateShapes(slideId);\r\n                PlayNextAnimationsForTarget('slide');\r\n            }\r\n        }\r\n    }\r\n    else {\r\n        \r\n        if ("
      );
      this.k5(var4);
      this.l6(
         ") {\r\n            PauseAllEffects(animations);\r\n            RestoreAllEffects(animations);\r\n            PrepareAllEffects(animations);\r\n            ResetAnimationIndicies();\r\n            PlayNextAnimationsForTarget('slide');\r\n        }\r\n    }\r\n}\r\n\r\nfunction ChangeThumbSelection(nextVisiblePage) {\r\n    $('.slideThumb').removeClass('navigationSelected');\r\n    $('#slideThumb-' + nextVisiblePage).addClass('navigationSelected');\r\n}"
      );
   }
}
