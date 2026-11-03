package com.aspose.slides;

final class c3t {
   private int n5;
   private com.aspose.slides.internal.x4g.m1 l6;
   private float k5;
   private float u3;
   private float a6;

   private void n5(com.aspose.slides.internal.x4g.m1 var1) {
      this.l6 = var1;
      this.n5 = var1 != null && !var1.l6() ? 4 : 0;
   }

   public c3t(com.aspose.slides.internal.x4g.m1 var1, int var2) {
      this.n5(var1);
      this.n5 = var2;
   }

   public static c3t n5() {
      return new c3t(0, null, 0.0F, 0.0F, 0.0F);
   }

   public static c3t n5(float var0, float var1, float var2) {
      var0 %= 360.0F;
      if (var0 < 0.0F) {
         var0 += 360.0F;
      }

      if (var0 == 0.0F) {
         return n5();
      }

      com.aspose.slides.internal.x4g.m1 var3 = new com.aspose.slides.internal.x4g.m1();
      var3.n5(var0, new com.aspose.slides.internal.o9b.w1(var1, var2));
      return new c3t(3, var3, var0, var1, var2);
   }

   private c3t(int var1, com.aspose.slides.internal.x4g.m1 var2, float var3, float var4, float var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public final String l6() {
      if (this.u3()) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      switch (this.n5) {
         case 1:
            return com.aspose.slides.ms.System.d1.n5(
               "tt{0}_{1}e",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[4]), com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[5])
            });
         case 2:
            return com.aspose.slides.ms.System.d1.n5(
               "ts{0}_{1}e",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[0]), com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[3])
            });
         case 3:
            return com.aspose.slides.ms.System.d1.n5(
               "tr{0}_{1}_{2}e",new Object[]{
               com.aspose.slides.ms.System.Xml.f4.n5(this.k5),
               com.aspose.slides.ms.System.Xml.f4.n5(this.u3),
               com.aspose.slides.ms.System.Xml.f4.n5(this.a6)
            });
         case 4:
            return com.aspose.slides.ms.System.d1.n5(
               "tm{0}_{1}_{2}_{3}_{4}_{5})",new Object[]{
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[0]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[1]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[2]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[3]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[4]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[5])
            });
         default:
            return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public final String k5() {
      if (this.u3()) {
         return null;
      }

      switch (this.n5) {
         case 1:
            return this.l6.n5()[5] != 0.0F
               ? com.aspose.slides.ms.System.d1.n5(
                  "translate({0}, {1})",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[4]), com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[5])
               })
               : com.aspose.slides.ms.System.d1.n5("translate({0})", new Object[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[4])});
         case 2:
            return this.l6.n5()[3] != this.l6.n5()[0]
               ? com.aspose.slides.ms.System.d1.n5(
                  "scale({0}, {1})",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[0]), com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[3])
               })
               : com.aspose.slides.ms.System.d1.n5("scale({0})", new Object[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[0])});
         case 3:
            if (this.a6 == 0.0F) {
               if (this.u3 == 0.0F) {
                  return com.aspose.slides.ms.System.d1.n5("rotate({0})", new Object[]{com.aspose.slides.ms.System.Xml.f4.n5(this.k5)});
               }

               return com.aspose.slides.ms.System.d1.n5(
                  "rotate({0}, {1})",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(this.k5), com.aspose.slides.ms.System.Xml.f4.n5(this.u3)
               });
            }

            return com.aspose.slides.ms.System.d1.n5(
               "rotate({0}, {1}, {2})",new Object[]{
               com.aspose.slides.ms.System.Xml.f4.n5(this.k5),
               com.aspose.slides.ms.System.Xml.f4.n5(this.u3),
               com.aspose.slides.ms.System.Xml.f4.n5(this.a6)
            });
         case 4:
            return com.aspose.slides.ms.System.d1.n5(
               "matrix({0}, {1}, {2}, {3}, {4}, {5})",new Object[]{
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[0]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[1]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[2]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[3]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[4]),
               com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5()[5])
            });
         default:
            return null;
      }
   }

   public static String n5(c3t var0) {
      return var0 == null ? com.aspose.slides.ms.System.d1.n5 : var0.l6();
   }

   public static String n5(c3t var0, String var1) {
      return var0 == null ? com.aspose.slides.ms.System.d1.n5 : com.aspose.slides.ms.System.d1.n5(var1, new Object[]{var0.l6()});
   }

   public static String l6(c3t var0) {
      return var0 == null ? null : var0.k5();
   }

   public final boolean u3() {
      return this.n5 == 0 || this.l6.l6();
   }
}
