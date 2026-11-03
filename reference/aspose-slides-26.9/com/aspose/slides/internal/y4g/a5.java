package com.aspose.slides.internal.y4g;

import com.aspose.slides.internal.o8m.j4;

public class a5 {
   private com.aspose.slides.internal.i2i.k5 n5;
   private com.aspose.slides.internal.o8m.z6 l6;
   private j4 k5 = new j4();
   private byte[] u3;
   private String[] a6;
   private boolean u9;
   private boolean h0;
   private int[] c8;

   public boolean n5() {
      return this.u9;
   }

   public void n5(boolean var1) {
      this.u9 = var1;
   }

   public com.aspose.slides.internal.i2i.k5 l6() {
      return this.n5;
   }

   public void n5(com.aspose.slides.internal.i2i.k5 var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.o8m.z6 k5() {
      return this.l6;
   }

   public j4 u3() {
      return this.k5;
   }

   public void n5(j4 var1) {
      var1.n5(this.k5);
   }

   public void n5(byte[] var1) {
      this.u3 = var1;
   }

   public boolean a6() {
      return this.h0;
   }

   public void l6(boolean var1) {
      this.h0 = var1;
   }

   public void n5(int[] var1) {
      this.c8 = var1;
   }

   public void n5(String[] var1) {
      this.a6 = var1;
   }

   public void u9() {
      if (this.n5 != null && this.n5.size() != 0) {
         this.l6 = new com.aspose.slides.internal.x8w.u9(this.n5.n5(0).c8().n5());
         this.l6.n5(this.n5.n5(0).c8().l6(false).n5());
      } else {
         this.l6 = null;
      }
   }
}
