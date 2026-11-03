package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.Exception;

class e5$n5 implements com.aspose.slides.ms.System.z7 {
   private final Object n5 = new Object();
   private com.aspose.slides.ms.System.h0 l6;
   private Object k5;
   private Exception u3;
   private com.aspose.slides.internal.r5t.k5 a6;
   private boolean u9;
   private int h0;
   private boolean c8;
   private boolean t2;
   private byte[] s7;
   private int x8;
   private int n3;

   public e5$n5(com.aspose.slides.ms.System.h0 var1, Object var2, byte[] var3, int var4, int var5, boolean var6, boolean var7) {
      this.l6 = var1;
      this.k5 = var2;
      this.s7 = var3;
      this.x8 = var4;
      this.n3 = var5;
      this.c8 = var6;
      this.t2 = var7;
   }

   public boolean u3() {
      return this.t2;
   }

   public boolean a6() {
      return this.c8;
   }

   public byte[] u9() {
      return this.s7;
   }

   public int h0() {
      return this.x8;
   }

   public int c8() {
      return this.n3;
   }

   public int t2() {
      return this.h0;
   }

   @Override
   public Object n5() {
      return this.k5;
   }

   public Exception s7() {
      return this.u3;
   }

   public boolean x8() {
      return !this.k5() ? false : null != this.u3;
   }

   @Override
   public com.aspose.slides.internal.r5t.c4 l6() {
      synchronized (this.n5) {
         if (this.a6 == null) {
            this.a6 = new com.aspose.slides.internal.r5t.k5(this.u9);
         }
      }

      return this.a6;
   }

   @Override
   public boolean k5() {
      synchronized (this.n5) {
         return this.u9;
      }
   }

   private void n5(Exception var1, int var2) {
      synchronized (this.n5) {
         if (this.u9) {
            return;
         }

         this.u9 = true;
         this.u3 = var1;
         this.h0 = var2;
         if (this.a6 != null) {
            this.a6.l6();
         }
      }

      if (this.l6 != null) {
         this.l6.n5(this, null, null);
      }
   }

   public void n5(Exception var1) {
      this.n5(var1, 0);
   }

   public void n5(int var1) {
      this.n5(null, var1);
   }

   public void n3() {
      this.n5(null, 0);
   }
}
