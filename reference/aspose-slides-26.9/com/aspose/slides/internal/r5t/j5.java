package com.aspose.slides.internal.r5t;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Timer;

public final class j5 implements IDisposable {
   private Timer n5;
   private j5$n5 l6;
   private long k5 = z8.n5;
   private long u3 = z8.n5;
   private boolean a6 = false;

   public j5(w1 var1, Object var2, int var3, int var4) {
      this.n5(var1, var2, var3, var4);
   }

   private void n5(w1 var1, Object var2, long var3, long var5) {
      if (var1 == null) {
         throw new ArgumentNullException("callback");
      }

      if (var3 < z8.n5) {
         throw new ArgumentOutOfRangeException("dueTime");
      }

      if (var5 < z8.n5) {
         throw new ArgumentOutOfRangeException("period");
      }

      this.k5 = var3;
      this.u3 = var5;
      this.n5 = new Timer(true);
      this.l6 = new j5$n5(this, var1, var2);
      if (this.k5 != z8.n5) {
         if (this.u3 != z8.n5 && this.u3 != 0L) {
            this.n5.schedule(this.l6, this.k5, this.u3);
         } else {
            this.n5.schedule(this.l6, this.k5);
         }
      }
   }

   public boolean n5(int var1, int var2) {
      return this.n5((long)var1, (long)var2);
   }

   @Override
   public void dispose() {
      if (!this.a6) {
         this.a6 = true;
         this.n5.cancel();
         this.l6 = null;
         this.n5 = null;
         this.k5 = z8.n5;
         this.u3 = z8.n5;
      }
   }

   private boolean n5(long var1, long var3) {
      if (var1 > 4294967294L) {
         throw new ArgumentOutOfRangeException("dueTime", "Due time too large");
      }

      if (var3 > 4294967294L) {
         throw new ArgumentOutOfRangeException("period", "Period too large");
      }

      if (var1 < z8.n5) {
         throw new ArgumentOutOfRangeException("dueTime");
      }

      if (var3 < z8.n5) {
         throw new ArgumentOutOfRangeException("period");
      }

      if (this.a6) {
         return false;
      }

      this.k5 = var1;
      this.u3 = var3;
      this.n5.cancel();
      this.l6.cancel();
      this.n5 = new Timer(true);
      if (this.k5 != z8.n5) {
         if (this.u3 != z8.n5 && this.u3 != 0L) {
            this.n5.schedule(this.l6.n5(), this.k5, this.u3);
         } else {
            this.n5.schedule(this.l6.n5(), this.k5);
         }
      }

      return true;
   }
}
