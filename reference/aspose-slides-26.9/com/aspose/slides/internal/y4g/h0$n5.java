package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.Exception;

class h0$n5 implements com.aspose.slides.ms.System.z7 {
   private Object n5 = new Object();
   private com.aspose.slides.ms.System.h0 l6;
   private Object k5;
   private Exception u3;
   private com.aspose.slides.internal.r5t.k5 a6;
   private byte[] u9;
   private com.aspose.slides.internal.z0k.t4 h0;
   private boolean c8;
   private byte[] t2;

   public h0$n5(com.aspose.slides.ms.System.h0 var1, Object var2, byte[] var3, com.aspose.slides.internal.z0k.t4 var4) {
      this.l6 = var1;
      this.k5 = var2;
      this.t2 = var3;
      this.h0 = var4;
   }

   public com.aspose.slides.internal.z0k.t4 u3() {
      return this.h0;
   }

   public byte[] a6() {
      return this.u9;
   }

   public byte[] u9() {
      return this.t2;
   }

   @Override
   public Object n5() {
      return this.k5;
   }

   public Exception h0() {
      return this.u3;
   }

   public boolean c8() {
      return !this.k5() ? false : null != this.u3;
   }

   @Override
   public com.aspose.slides.internal.r5t.c4 l6() {
      synchronized (this.n5) {
         if (this.a6 == null) {
            this.a6 = new com.aspose.slides.internal.r5t.k5(this.c8);
         }
      }

      return this.a6;
   }

   @Override
   public boolean k5() {
      synchronized (this.n5) {
         return this.c8;
      }
   }

   private void n5(Exception var1, byte[] var2) {
      synchronized (this.n5) {
         if (!this.c8) {
            this.c8 = true;
            this.u3 = var1;
            this.u9 = var2;
            if (this.a6 != null) {
               this.a6.l6();
            }

            if (this.l6 != null) {
               this.l6.n5(this, null, null);
            }
         }
      }
   }

   public void n5(Exception var1) {
      this.n5(var1, null);
   }

   public void n5(byte[] var1) {
      this.n5(null, var1);
   }
}
