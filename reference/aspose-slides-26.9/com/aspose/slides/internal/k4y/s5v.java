package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s5v extends b3 {
   private byte n5;
   private byte l6;
   private u2q k5;
   private b5b u3;
   private z4 a6;
   private z4 u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("clrSpc", "dir", "cBhvr", "by", "from", "to");

   public s5v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      s5v$1 var2 = new s5v$1(this);
      n5(var1, var2);
      n5(var1, new s5v$2(this, var1));
   }

   public s5v() {
      this.x8();
      this.k5 = new u2q();
   }

   private void x8() {
      this.n5 = -1;
      this.l6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("clrSpc", e0.n5(this.n5));
      }

      if (this.l6 != -1) {
         var2.l6("dir", o2.n5(this.l6));
      }

      this.k5.n5("p", var2, "cBhvr");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "by");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "from");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "to");
      }

      var2.s7();
   }

   public final b5b n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <by> element can be added.");
      }

      this.u3 = new b5b();
      return this.u3;
   }

   public final z4 l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <from> element can be added.");
      }

      this.a6 = new z4();
      return this.a6;
   }

   public final z4 k5() {
      if (this.u9 != null) {
         throw new Exception("Only one <to> element can be added.");
      }

      this.u9 = new z4();
      return this.u9;
   }

   public final byte u3() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte a6() {
      return this.l6;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
   }

   public final u2q u9() {
      return this.k5;
   }

   public final b5b h0() {
      return this.u3;
   }

   public final z4 c8() {
      return this.a6;
   }

   public final z4 t2() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return h0;
   }

   // $VF: synthetic method
   static byte n5(s5v var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte l6(s5v var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u2q n5(s5v var0, u2q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b5b n5(s5v var0, b5b var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static z4 n5(s5v var0, z4 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static z4 l6(s5v var0, z4 var1) {
      return var0.u9 = var1;
   }
}
