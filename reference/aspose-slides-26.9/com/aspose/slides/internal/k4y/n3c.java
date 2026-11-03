package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n3c extends b3 {
   private g7 n5;
   private h6l l6;
   private q9u k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("effectLst", "effectDag", "scene3d", "sp3d");

   public n3c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new n3c$1(this, var1));
   }

   public n3c() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (u3.n5(this.n5.n5())) {
            case 0:
               ((o9b)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 1:
               ((f8y)this.n5.k5()).n5("a", var2, this.n5.n5());
         }
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "scene3d");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "sp3d");
      }

      var2.s7();
   }

   public final h6l n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <scene3d> element can be added.");
      }

      this.l6 = new h6l();
      return this.l6;
   }

   public final q9u l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <sp3d> element can be added.");
      }

      this.k5 = new q9u();
      return this.k5;
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("EffectProperties already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 0:
            this.n5 = new g7("effectLst", new o9b());
            break;
         case 1:
            this.n5 = new g7("effectDag", new f8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.n5;
   }

   public final g7 k5() {
      return this.n5;
   }

   public final h6l u3() {
      return this.l6;
   }

   public final q9u a6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u3;
   }

   // $VF: synthetic method
   static g7 n5(n3c var0, g7 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static h6l n5(n3c var0, h6l var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static q9u n5(n3c var0, q9u var1) {
      return var0.k5 = var1;
   }
}
