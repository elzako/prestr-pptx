package com.aspose.slides.internal.z0k;

import com.aspose.slides.ms.System.j3;

@j3
final class y2 extends a0 {
   private a0 n5;
   private boolean a6;

   public y2(a0 var1, boolean var2) {
      this.n5 = var1;
      this.a6 = var2;
   }

   @Override
   public void u3() {
      if (!this.a6) {
         synchronized (this) {
            this.n5.u3();
         }
      }
   }

   @Override
   public void k5() {
      synchronized (this) {
         this.n5.k5();
      }
   }

   @Override
   public void a_(boolean var1) {
      synchronized (this) {
         this.n5.a_(var1);
      }
   }

   @Override
   public void n5(char var1) {
      synchronized (this) {
         this.n5.n5(var1);
      }
   }

   @Override
   public void n5(char[] var1) {
      synchronized (this) {
         this.n5.n5(var1);
      }
   }

   @Override
   public void n5(int var1) {
      synchronized (this) {
         this.n5.n5(var1);
      }
   }

   @Override
   public void n5(Object var1) {
      synchronized (this) {
         this.n5.n5(var1);
      }
   }

   @Override
   public void n5(String var1) {
      synchronized (this) {
         this.n5.n5(var1);
      }
   }

   @Override
   public void n5(String var1, Object var2) {
      synchronized (this) {
         this.n5.n5(var1, var2);
      }
   }

   @Override
   public void n5(String var1, Object[] var2) {
      synchronized (this) {
         this.n5.n5(var1, var2);
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      synchronized (this) {
         this.n5.n5(var1, var2, var3);
      }
   }

   @Override
   public void n5(String var1, Object var2, Object var3) {
      synchronized (this) {
         this.n5.n5(var1, var2, var3);
      }
   }

   @Override
   public void n5(String var1, Object var2, Object var3, Object var4) {
      synchronized (this) {
         this.n5.n5(var1, var2, var3, var4);
      }
   }

   @Override
   public void Z_() {
      synchronized (this) {
         this.n5.Z_();
      }
   }

   @Override
   public void k5(boolean var1) {
      synchronized (this) {
         this.n5.k5(var1);
      }
   }

   @Override
   public void l6(int var1) {
      synchronized (this) {
         this.n5.l6(var1);
      }
   }

   @Override
   public void l6(Object var1) {
      synchronized (this) {
         this.n5.l6(var1);
      }
   }

   @Override
   public void l6(String var1) {
      synchronized (this) {
         this.n5.l6(var1);
      }
   }

   @Override
   public void l6(String var1, Object var2) {
      synchronized (this) {
         this.n5.l6(var1, var2);
      }
   }

   @Override
   public void l6(String var1, Object[] var2) {
      synchronized (this) {
         this.n5.l6(var1, var2);
      }
   }

   @Override
   public void l6(String var1, Object var2, Object var3) {
      synchronized (this) {
         this.n5.l6(var1, var2, var3);
      }
   }

   @Override
   public void l6(String var1, Object var2, Object var3, Object var4) {
      synchronized (this) {
         this.n5.l6(var1, var2, var3, var4);
      }
   }

   @Override
   public com.aspose.slides.internal.l7h.j5 l6() {
      synchronized (this) {
         return this.n5.l6();
      }
   }

   @Override
   public void k5(String var1) {
      synchronized (this) {
         this.n5.k5(var1);
      }
   }
}
