package com.aspose.slides.internal.r5t;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.x9;
import java.util.concurrent.CountDownLatch;

public abstract class c4 implements IDisposable {
   protected final Object l6 = new Object();
   protected boolean k5 = false;
   protected int u3 = 0;
   private CountDownLatch n5 = null;
   protected static final x9 a6 = new x9(-1L);
   private boolean u9 = false;

   protected c4() {
      this.n5 = new CountDownLatch(1);
   }

   CountDownLatch k5() {
      return this.n5;
   }

   void n5(CountDownLatch var1) {
      this.n5 = var1;
   }

   public void u3() {
      this.dispose();
   }

   @Override
   public void dispose() {
      this.u9 = true;
   }

   public boolean a6() {
      return this.n5(-1, false);
   }

   public boolean n5(int var1, boolean var2) {
      if (var1 < -1) {
         throw new ArgumentOutOfRangeException("timeout");
      }

      synchronized (this.l6) {
         boolean var4 = false;
         if (this.k5) {
            this.n5();
            return true;
         }

         boolean var10000;
         try {
            if (var1 == -1) {
               this.l6.wait();
               this.n5();
               return true;
            }

            this.l6.wait(var1 == 0 ? 1L : var1);
            var4 = this.k5;
            this.n5();
            var10000 = var4;
         } catch (InterruptedException var7) {
            throw new t9(var7.getMessage());
         }

         return var10000;
      }
   }

   private void n5() {
      synchronized (this.l6) {
         if (this.u3 == 0 && this.k5) {
            this.k5 = false;
            this.n5(new CountDownLatch(1));
         }
      }
   }
}
