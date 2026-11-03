package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s1q extends b3 {
   private boolean n5;
   private boolean l6;
   private q8e k5;
   private g7 u3;
   private r9o a6;
   private y1g u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "isPhoto", "userDrawn", "ph", "audioCd", "wavAudioFile", "audioFile", "videoFile", "quickTimeFile", "custDataLst", "extLst"
   );

   public s1q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      s1q$1 var2 = new s1q$1(this);
      n5(var1, var2);
      n5(var1, new s1q$2(this, var1));
   }

   public s1q() {
      this.s7();
   }

   private void s7() {
      this.n5 = false;
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("isPhoto", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("userDrawn", this.l6 ? "1" : "0");
      }

      if (this.k5 != null) {
         this.k5.n5("p", var2, "ph");
      }

      if (this.u3 != null) {
         switch (h0.n5(this.u3.n5())) {
            case 3:
               ((e1)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 4:
               ((x7n)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 5:
               ((g0)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 6:
               ((z8m)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 7:
               ((m4d)this.u3.k5()).n5("a", var2, this.u3.n5());
         }
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "custDataLst");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final q8e n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <ph> element can be added.");
      }

      this.k5 = new q8e();
      return this.k5;
   }

   public final r9o l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <custDataLst> element can be added.");
      }

      this.a6 = new r9o();
      return this.a6;
   }

   public final void n5(x8 var1) {
      this.u9 = (y1g)var1;
   }

   public final g7 n5(String var1) {
      if (this.u3 != null) {
         throw new Exception("Media already is initialized.");
      }

      switch (h0.n5(var1)) {
         case 3:
            this.u3 = new g7("audioCd", new e1());
            break;
         case 4:
            this.u3 = new g7("wavAudioFile", new x7n());
            break;
         case 5:
            this.u3 = new g7("audioFile", new g0());
            break;
         case 6:
            this.u3 = new g7("videoFile", new z8m());
            break;
         case 7:
            this.u3 = new g7("quickTimeFile", new m4d());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u3;
   }

   public final boolean k5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean u3() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final q8e a6() {
      return this.k5;
   }

   public final g7 u9() {
      return this.u3;
   }

   public final void n5(g7 var1) {
      this.u3 = var1;
   }

   public final r9o h0() {
      return this.a6;
   }

   public final x8 c8() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return h0;
   }

   // $VF: synthetic method
   static boolean n5(s1q var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(s1q var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static q8e n5(s1q var0, q8e var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(s1q var0, g7 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static r9o n5(s1q var0, r9o var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(s1q var0, y1g var1) {
      return var0.u9 = var1;
   }
}
