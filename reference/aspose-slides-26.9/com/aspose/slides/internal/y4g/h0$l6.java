package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.Exception;

class h0$l6 implements com.aspose.slides.ms.System.z7 {
   private final Object n5 = new Object();
   private com.aspose.slides.ms.System.h0 l6;
   private Object k5;
   private Exception u3;
   private com.aspose.slides.internal.r5t.k5 a6;
   private com.aspose.slides.internal.n4m.n5 u9;
   private boolean h0;

   public h0$l6(com.aspose.slides.ms.System.h0 var1, Object var2, com.aspose.slides.internal.n4m.n5 var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u9 = var3;
   }

   public com.aspose.slides.internal.n4m.n5 u3() {
      return this.u9;
   }

   @Override
   public Object n5() {
      return this.k5;
   }

   public Exception a6() {
      return this.u3;
   }

   public boolean u9() {
      return !this.k5() ? false : null != this.u3;
   }

   @Override
   public com.aspose.slides.internal.r5t.c4 l6() {
      synchronized (this.n5) {
         if (this.a6 == null) {
            this.a6 = new com.aspose.slides.internal.r5t.k5(this.h0);
         }
      }

      return this.a6;
   }

   @Override
   public boolean k5() {
      synchronized (this.n5) {
         return this.h0;
      }
   }

   public void n5(Exception var1) {
      synchronized (this.n5) {
         if (!this.h0) {
            this.h0 = true;
            if (this.a6 != null) {
               this.a6.l6();
            }

            if (this.l6 != null) {
               this.l6.n5(this, null, null);
            }

            this.u3 = var1;
         }
      }
   }

   public void h0() {
      this.n5(null);
   }
}
