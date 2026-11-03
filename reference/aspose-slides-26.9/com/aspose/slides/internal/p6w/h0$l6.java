package com.aspose.slides.internal.p6w;

import com.aspose.slides.Collections.Queue;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.r5t.c4;
import com.aspose.slides.internal.r5t.r4;
import com.aspose.slides.ms.System.z7;

final class h0$l6 implements z7 {
   public h0 n5;
   public com.aspose.slides.internal.s0c.n5 l6;
   private Object s7;
   private com.aspose.slides.ms.System.h0 x8;
   private c4 n3;
   private RuntimeException y4;
   public com.aspose.slides.internal.g8v.q0 k5;
   public byte[] u3;
   public int a6;
   public int u9;
   public int h0;
   private int e2;
   private boolean t9;
   public boolean c8;
   int t2;
   private int z1;

   h0$l6() {
   }

   public h0$l6(h0 var1, Object var2, com.aspose.slides.ms.System.h0 var3, int var4) {
      this.n5 = var1;
      this.c8 = var1.n5;
      this.l6 = com.aspose.slides.internal.p6w.h0.n5(var1);
      this.s7 = var2;
      this.x8 = var3;
      this.z1 = var4;
      this.h0 = 0;
   }

   public void u3() {
      if (this.y4 != null) {
         throw this.y4;
      }

      if (this.t2 != 0) {
         throw new q0(this.t2);
      }
   }

   private void n5(Queue var1) {
      Object[] var2 = var1.toArray(new Object[0]);
      var1.clear();
      r4 var3 = null;

      for (int var4 = 0; var4 < com.aspose.slides.ms.System.u3.n5((Object)(var2)).a6(); var4++) {
         h0$l6 var5 = (h0$l6)var2[var4];
         var3 = new x8(this, var5);
         com.aspose.slides.internal.r5t.z1.n5(var3, null);
      }
   }

   private void n5(Object var1) {
      this.a6();
   }

   public void a6() {
      if (this.z1 != 2 && this.n5.l6) {
         this.y4 = new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(this.n5.getClass()).toString());
      }

      this.n5(true);
      Queue var1 = null;
      if (this.z1 == 2 || this.z1 == 3) {
         var1 = com.aspose.slides.internal.p6w.h0.l6(this.n5);
      } else if (this.z1 == 4 || this.z1 == 5) {
         var1 = com.aspose.slides.internal.p6w.h0.k5(this.n5);
      }

      if (var1 != null) {
         h0$n5 var2 = null;
         h0$l6 var3 = null;
         synchronized (var1) {
            var1.dequeue();
            if (var1.size() > 0) {
               var3 = (h0$l6)var1.peek();
               if (!this.n5.l6) {
                  h0$k5 var5 = new h0$k5(var3);
                  var2 = this.n5(var5, var3.z1);
               } else {
                  this.n5(var1);
               }
            }
         }

         if (var2 != null) {
            var2.n5(null, var3);
         }
      }

      if (this.x8 != null) {
         this.x8.n5(this);
      }
   }

   private h0$n5 n5(h0$k5 var1, int var2) {
      switch (var2) {
         case 2:
            return new n3(this, var1);
         case 3:
            return new y4(this, var1);
         case 4:
            return new e2(this, var1);
         case 5:
            return new t9(this, var1);
         default:
            return null;
      }
   }

   public void n5(int var1) {
      this.e2 = var1;
      this.a6();
   }

   public void n5(RuntimeException var1) {
      this.y4 = var1;
      this.a6();
   }

   @Override
   public Object n5() {
      return this.s7;
   }

   @Override
   public c4 l6() {
      synchronized (this) {
         if (this.n3 == null) {
            this.n3 = new com.aspose.slides.internal.r5t.k5(this.t9);
         }
      }

      return this.n3;
   }

   @Override
   public boolean k5() {
      return this.t9;
   }

   public void n5(boolean var1) {
      this.t9 = var1;
      synchronized (this) {
         if (this.n3 != null && var1) {
            ((com.aspose.slides.internal.r5t.k5)this.n3).l6();
         }
      }
   }

   public int u9() {
      return this.e2;
   }

   public void l6(int var1) {
      this.e2 = var1;
   }

   // $VF: synthetic method
   static void n5(h0$l6 var0, Object var1) {
      var0.n5(var1);
   }
}
