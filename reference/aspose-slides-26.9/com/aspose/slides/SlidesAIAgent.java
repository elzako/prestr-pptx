package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.DOMResourcesUtils;

public class SlidesAIAgent {
   private final IAIWebClient n5;

   public SlidesAIAgent(IAIWebClient aiClient) {
      if (aiClient == null) {
         throw new ArgumentNullException("aiClient", "AI client instance is not provided.");
      }

      this.n5 = aiClient;
      com.aspose.slides.internal.c6.a0.l6 = new SlidesAIAgent$1(this);
      com.aspose.slides.internal.c6.a0.n5 = new SlidesAIAgent$2(this);
   }

   public SlidesAIAgent() {
      this.n5 = new AsposeAIWebClient();
   }

   public final void translate(IPresentation presentation, String language) {
      n5(presentation, language);
      String var3 = com.aspose.slides.internal.c6.o0.n5(SlideUtil.getAllTextFrames(presentation, true));
      com.aspose.slides.internal.c6.b3 var4 = new com.aspose.slides.internal.c6.b3(presentation, var3, language);
      String[] var5 = var4.n5();
      String[] var6 = new String[var5.length];

      for (int var7 = 0; var7 < var5.length; var7++) {
         var6[var7] = this.n5.callChat(var5[var7]);
      }

      var4.n5(var6);
   }

   public final IPresentation generatePresentation(String description, int presentationContentAmount) {
      if (description != null && !description.isEmpty()) {
         try {
            com.aspose.slides.internal.z0k.t4 var3 = DOMResourcesUtils.getResourceStream("aiTemplate.pptx");
            Presentation var4 = new Presentation(var3);
            return this.generatePresentation(description, presentationContentAmount, var4);
         } catch (RuntimeException var5) {
            throw new SlidesAIAgentException("Failed to load template", var5);
         }
      } else {
         throw new ArgumentException("Description can't be null or empty.");
      }
   }

   public final IPresentation generatePresentation(String description, int presentationContentAmount, IPresentation presentationTemplate) {
      if (com.aspose.slides.ms.System.d1.n5(description)) {
         throw new ArgumentException("Description can't be null or empty.", "description");
      } else if (presentationTemplate == null) {
         throw new ArgumentNullException("presentationTemplate", "Presentation template is not provided.");
      } else {
         return com.aspose.slides.internal.c6.y4.n5(this.n5, description, presentationContentAmount, presentationTemplate);
      }
   }

   private static void n5(IPresentation var0, String var1) {
      if (var0 == null) {
         throw new ArgumentNullException("presentation", "Presentation instance is not provided.");
      }

      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("Language value can't be null or empty");
      }
   }
}
