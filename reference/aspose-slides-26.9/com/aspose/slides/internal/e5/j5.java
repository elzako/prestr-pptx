package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.h2;

public class j5 implements com.aspose.slides.internal.h2.s3 {
   @Override
   public final a5 l6(int var1, a5 var2, h2 var3, w1 var4) {
      int var5 = var2.a6();
      if (var1 == 1) {
         switch (var5) {
            case 1:
               return com.aspose.slides.internal.h2.z8.n5(1, "ABSOLUTE");
            case 51:
               return com.aspose.slides.internal.h2.z8.n5(51, "FIXED");
            case 110:
            case 136:
               return com.aspose.slides.internal.h2.z8.n5(110, "RELATIVE");
            case 206:
               return com.aspose.slides.internal.h2.z8.n5(206, "ABSOLUTERELATIVE");
            case 215:
               return com.aspose.slides.internal.h2.z8.n5(215, "INLINEABSOLUTE");
         }
      }

      if (var1 == 203) {
         switch (var5) {
            case 1:
               return com.aspose.slides.internal.h2.z8.n5(136, "STATIC");
            case 51:
               return com.aspose.slides.internal.h2.z8.n5(136, "STATIC");
            case 110:
               return com.aspose.slides.internal.h2.z8.n5(110, "RELATIVE");
            case 136:
               return com.aspose.slides.internal.h2.z8.n5(136, "STATIC");
            case 206:
               return com.aspose.slides.internal.h2.z8.n5(206, "ABSOLUTERELATIVE");
            case 215:
               return com.aspose.slides.internal.h2.z8.n5(215, "INLINEABSOLUTE");
         }
      }

      return null;
   }
}
