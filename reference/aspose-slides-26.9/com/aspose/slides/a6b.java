package com.aspose.slides;

class a6b {
   public static r8k n5(IShape var0, XamlOptions var1) {
      switch (var1.t2()) {
         case 0:
            return new c5a(var0, var1);
         case 1:
            return new m9o(var0, var1);
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static r8k n5(IAutoShape var0, XamlOptions var1) {
      switch (var1.t2()) {
         case 0:
            return new r6g(var0, var1);
         case 1:
            return new t4l(var0, var1);
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static r8k l6(IShape var0, XamlOptions var1) {
      switch (var1.t2()) {
         case 0:
            return new m2u(var0, var1);
         case 1:
            return new e3f(var0, var1);
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static r2w n5(IPictureFrame var0, XamlOptions var1) {
      switch (var1.t2()) {
         case 0:
            return new t7t(var0, var1);
         case 1:
            return new l5c(var0, var1);
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static r8k n5(IParagraph var0, XamlOptions var1) {
      switch (var1.t2()) {
         case 0:
            return new g1u(var0, var1);
         case 1:
            return new m1p(var0, var1);
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static r8k n5(IShape var0, XamlOptions var1, String var2) {
      switch (var1.t2()) {
         case 0:
            return new a1s(var0, var1, var2);
         case 1:
            return new e1v(var0, var1, var2);
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static e5n n5(XamlOptions var0) {
      switch (var0.t2()) {
         case 0:
            return var0.y4();
         case 1:
            return var0.n3();
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static e5n l6(XamlOptions var0) {
      switch (var0.t2()) {
         case 0:
            return var0.x8();
         case 1:
            return var0.s7();
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static e5n k5(XamlOptions var0) {
      switch (var0.t2()) {
         case 0:
            return var0.t9();
         case 1:
            return var0.e2();
         default:
            throw new t1c("Unknown xaml type.");
      }
   }
}
