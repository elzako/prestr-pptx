package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class a1 extends com.aspose.slides.internal.n3.h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("stylistic", "styleset");

   @Override
   public String n5() {
      return "font-variant-alternates";
   }

   @Override
   public int l6() {
      return 126;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.d2;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      if (var1.n5() == 41) {
         String var3 = com.aspose.slides.ms.System.d1.a6(var1.h0());
         var3 = com.aspose.slides.ms.System.d1.l6(var3, 0, var3.length() - 1);
         switch (l6.n5(var3)) {
            case 0:
               com.aspose.slides.internal.z8.y4 var6 = var1.c8();
               if (var6 == null) {
                  throw this.k5(var3);
               }

               return new com.aspose.slides.internal.y4.t2(var3, com.aspose.slides.internal.y4.t9.k5(var6.t2()));
            case 1:
               com.aspose.slides.internal.z8.y4 var4 = var1.c8();
               if (var4 == null) {
                  throw this.k5(var3);
               }

               return new com.aspose.slides.internal.y4.t2(var3, com.aspose.slides.internal.y4.t9.k5(var4.t2()));
         }
      }

      return super.n5(var1, var2);
   }

   static {
      n5.n5("normal", l6$n5.d2);
      n5.n5("stylistic", l6$n5.h9);
      n5.n5("historical-forms", l6$n5.r7);
      n5.n5("styleset", l6$n5.n9);
      n5.n5("character-variant", l6$n5.a2);
      n5.n5("swash", l6$n5.h1);
      n5.n5("ornaments", l6$n5.t6);
      n5.n5("annotation", l6$n5.v6);
   }
}
