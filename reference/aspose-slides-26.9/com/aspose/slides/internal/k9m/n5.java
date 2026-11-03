package com.aspose.slides.internal.k9m;

import com.aspose.slides.internal.r5t.c4;
import com.aspose.slides.internal.r5t.k5;
import com.aspose.slides.internal.u5b.l6;
import com.aspose.slides.ms.System.h0;
import com.aspose.slides.ms.System.z7;

public class n5 implements z7 {
   private h0 n5;
   private Object l6;
   private k5 k5;
   private boolean u3;
   private Object a6;

   public n5(l6 var1) {
      this.n5 = var1.getCallback();
      this.l6 = var1.getState();
      this.a6 = var1.getDelegate();
   }

   private void a6() {
      synchronized (this) {
         if (this.k5 == null) {
            this.k5 = new k5(this.u3);
         }
      }
   }

   public void u3() {
      synchronized (this) {
         this.u3 = true;
         if (this.k5 != null) {
            this.k5.l6();
         }
      }

      if (this.n5 != null) {
         this.n5.n5(this);
      }
   }

   @Override
   public Object n5() {
      return this.l6;
   }

   @Override
   public c4 l6() {
      this.a6();
      return this.k5;
   }

   @Override
   public boolean k5() {
      return this.u3;
   }
}
