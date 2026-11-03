package com.aspose.slides.internal.l6;

import com.aspose.slides.internal.n5.y2;

public class u3 extends n5 {
   public y2 u9;
   protected int h0 = -1;
   protected int c8 = -1;
   public u3 t2;
   public int s7 = -1;

   public u3() {
   }

   public u3(u3 var1) {
      super(var1);
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
   }

   public u3(y2 var1) {
      this.u9 = var1;
   }

   public y2 n3() {
      return this.u9;
   }

   @Override
   public n3 y4() {
      return new u3(this);
   }

   @Override
   public boolean k5() {
      return this.u9 == null;
   }

   @Override
   public int s7() {
      return this.u9 == null ? 0 : this.u9.n5();
   }

   @Override
   public String x8() {
      return this.u9 == null ? null : this.u9.l6();
   }

   @Override
   public int c8() {
      if (this.u9 != null && this.u9.k5() != 0) {
         return this.u9.k5();
      } else {
         return this.n5() > 0 ? this.n5(0).c8() : 0;
      }
   }

   @Override
   public int t2() {
      if (this.u9 != null && this.u9.u3() != -1) {
         return this.u9.u3();
      } else {
         return this.n5() > 0 ? this.n5(0).t2() : 0;
      }
   }

   @Override
   public int e2() {
      return this.h0 == -1 && this.u9 != null ? this.u9.u9() : this.h0;
   }

   @Override
   public void a6(int var1) {
      this.h0 = var1;
   }

   @Override
   public int t9() {
      return this.c8 == -1 && this.u9 != null ? this.u9.u9() : this.c8;
   }

   @Override
   public void u9(int var1) {
      this.c8 = var1;
   }

   @Override
   public int a6() {
      return this.s7;
   }

   @Override
   public n3 u9() {
      return this.t2;
   }

   @Override
   public void l6(n3 var1) {
      this.t2 = (u3)var1;
   }

   @Override
   public void u3(int var1) {
      this.s7 = var1;
   }

   @Override
   public String toString() {
      if (this.k5()) {
         return "nil";
      } else if (this.s7() == 0) {
         return "<errornode>";
      } else {
         return this.u9 == null ? null : this.u9.l6();
      }
   }
}
