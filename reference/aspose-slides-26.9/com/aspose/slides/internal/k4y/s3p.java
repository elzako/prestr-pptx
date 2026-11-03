package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s3p extends b3 {
   private b1u n5;
   private w2w l6;
   private n1c k5;
   private x8z u3;
   private i2j a6;
   private v6v u9;
   private m9b h0;
   private t1n c8;
   private m1z t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "orgChart", "chMax", "chPref", "bulletEnabled", "dir", "hierBranch", "animOne", "animLvl", "resizeHandles"
   );

   public s3p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new s3p$1(this, var1));
   }

   public s3p() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("dgm", var2, "orgChart");
      }

      if (this.l6 != null) {
         this.l6.n5("dgm", var2, "chMax");
      }

      if (this.k5 != null) {
         this.k5.n5("dgm", var2, "chPref");
      }

      if (this.u3 != null) {
         this.u3.n5("dgm", var2, "bulletEnabled");
      }

      if (this.a6 != null) {
         this.a6.n5("dgm", var2, "dir");
      }

      if (this.u9 != null) {
         this.u9.n5("dgm", var2, "hierBranch");
      }

      if (this.h0 != null) {
         this.h0.n5("dgm", var2, "animOne");
      }

      if (this.c8 != null) {
         this.c8.n5("dgm", var2, "animLvl");
      }

      if (this.t2 != null) {
         this.t2.n5("dgm", var2, "resizeHandles");
      }

      var2.s7();
   }

   public final i2j n5() {
      if (this.a6 != null) {
         throw new Exception("Only one <dir> element can be added.");
      }

      this.a6 = new i2j();
      return this.a6;
   }

   public final v6v l6() {
      if (this.u9 != null) {
         throw new Exception("Only one <hierBranch> element can be added.");
      }

      this.u9 = new v6v();
      return this.u9;
   }

   public final b1u k5() {
      return this.n5;
   }

   public final w2w u3() {
      return this.l6;
   }

   public final n1c a6() {
      return this.k5;
   }

   public final x8z u9() {
      return this.u3;
   }

   public final i2j h0() {
      return this.a6;
   }

   public final v6v c8() {
      return this.u9;
   }

   public final m9b t2() {
      return this.h0;
   }

   public final t1n s7() {
      return this.c8;
   }

   public final m1z x8() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return s7;
   }

   // $VF: synthetic method
   static b1u n5(s3p var0, b1u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w2w n5(s3p var0, w2w var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static n1c n5(s3p var0, n1c var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static x8z n5(s3p var0, x8z var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static i2j n5(s3p var0, i2j var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static v6v n5(s3p var0, v6v var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static m9b n5(s3p var0, m9b var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static t1n n5(s3p var0, t1n var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static m1z n5(s3p var0, m1z var1) {
      return var0.t2 = var1;
   }
}
