package com.aspose.slides.internal.f5;

import com.aspose.slides.ms.System.d1;

public class d5 extends a6 implements com.aspose.slides.internal.j3.c4 {
   public d5(String var1, z1 var2) {
      super(var1, var2);
   }

   public final com.aspose.slides.internal.j3.c4 n5(int var1) {
      int var2 = this.l6() - var1;
      String var3 = this.n5(var1, var2);
      this.l6(var1, var2);
      com.aspose.slides.internal.j3.c4 var4 = this.y4().u9(var3);
      this.y2().l6(com.aspose.slides.internal.v6g.k5.n5(var4, r4.class), this);
      return var4;
   }

   public final boolean k5() {
      for (int var1 = 0; var1 < this.n5().length(); var1++) {
         char var2 = this.n5().charAt(var1);
         if (!com.aspose.slides.ms.System.t9.t9(var2)) {
            return false;
         }
      }

      return true;
   }

   public final String u3() {
      return this.e5();
   }

   public final com.aspose.slides.internal.j3.c4 a6(String var1) {
      this.b3();
      r4 var2 = this.y2();
      r4 var3 = this.d5();
      this.y2().l6(this);
      if (d1.n5(var1)) {
         return null;
      }

      com.aspose.slides.internal.j3.c4 var4 = var2.y4().u9(var1);
      if (var3 != null) {
         var2.l6(com.aspose.slides.internal.v6g.k5.n5(var4, r4.class), var3);
      } else {
         var2.u3(var4);
      }

      return var4;
   }

   @Override
   public String h0() {
      return this.y4().u9;
   }

   @Override
   public byte n3() {
      return 3;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 l6(boolean var1) {
      return this.y4().u9(this.n5());
   }

   @Override
   public String c8() {
      return this.n5();
   }

   @Override
   public String e5() {
      return this.c8();
   }

   @Override
   public void t9(String var1) {
      this.a6(var1);
   }

   @Override
   public String t2() {
      return this.h0();
   }

   @Override
   public String toString() {
      return super.toString();
   }
}
