package com.aspose.slides;

class l6c {
   public static l2w n5(XamlOptions var0) {
      switch (var0.t2()) {
         case 0:
            return new z6c();
         case 1:
            return new u0i();
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static c5j l6(XamlOptions var0) {
      switch (var0.t2()) {
         case 0:
            return new x0z();
         case 1:
            return new w5t();
         default:
            throw new t1c("Unknown xaml type.");
      }
   }

   public static t5e k5(XamlOptions var0) {
      switch (var0.t2()) {
         case 0:
            f9h var2 = new f9h("<AbsoluteLayout{0}>", "</AbsoluteLayout>");
            return new q6y(var2);
         case 1:
            f9h var1 = new f9h("<Canvas{0}>", "</Canvas>");
            return new m9g(var1);
         default:
            throw new t1c("Unknown xaml type.");
      }
   }
}
