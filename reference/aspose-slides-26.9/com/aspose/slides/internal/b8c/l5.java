package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.Queue;
import com.aspose.slides.Collections.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.UpaException;

public final class l5 extends z1 {
   private n2 a6;
   private c5 u9;
   private Stack h0;
   private l0 c8;
   private boolean t2;
   private int s7;
   private boolean x8;

   public l5(int var1) {
      this(var1, true);
   }

   public l5(int var1, boolean var2) {
      super(var1);
      this.x8 = var2;
   }

   @Override
   public void n5(x5 var1) {
      throw new InvalidOperationException();
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.Xml.k6 var1, x5 var2, int[] var3) {
      throw new InvalidOperationException();
   }

   @Override
   public boolean l6(x5 var1) {
      throw new InvalidOperationException();
   }

   public final void a6() {
      this.a6 = new n2();
      this.u9 = new c5();
      this.h0 = new Stack();
   }

   public final void u9() {
      this.h0.push(null);
   }

   public final void h0() {
      l0 var1 = (l0)this.h0.pop();
      if (var1 != null) {
         if (this.h0.size() == 0) {
            this.c8 = var1;
            this.t2 = false;
         } else {
            p7 var2 = (p7)this.h0.pop();
            if (var2 != null) {
               var2.l6(var1);
               var1 = var2;
               this.t2 = true;
            } else {
               this.t2 = false;
            }

            this.h0.push(var1);
         }
      }
   }

   public final boolean n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      return this.a6.l6(var1);
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1, Object var2) {
      this.n5(new a8(this.u9.n5(this.a6.n5(var1, var2), var2)));
   }

   public final void n5(i4 var1, Object var2) {
      this.a6.n5(var1, var2, false);
      this.n5(new q3(var1, var2));
   }

   private void n5(l0 var1) {
      if (this.h0.size() > 0) {
         p7 var2 = (p7)this.h0.pop();
         if (var2 != null) {
            var2.l6(var1);
            var1 = var2;
         }
      }

      this.h0.push(var1);
      this.t2 = true;
   }

   public final void c8() {
      l0 var1 = (l0)this.h0.pop();
      n3 var2 = new n3();
      var2.n5(var1);
      this.h0.push(var2);
   }

   public final void t2() {
      l0 var1 = (l0)this.h0.pop();
      z0 var2 = new z0();
      var2.n5(var1);
      this.h0.push(var2);
   }

   public final void s7() {
      this.n5(new z9());
   }

   public final void x8() {
      this.n5(new u2());
   }

   public final void n3() {
      this.n5(new w9());
   }

   public final void n5(com.aspose.slides.ms.System.c4 var1, com.aspose.slides.ms.System.c4 var2) {
      f4 var3 = new f4(var1.l6(), var2.l6());
      int var4 = this.u9.n5(-2, var3);
      var3.n5(var4);
      z0 var5 = new z0();
      var5.l6(var3);
      this.n5(var5);
      this.s7++;
   }

   private void n5(p7 var1) {
      if (this.h0.size() > 0) {
         l0 var2 = (l0)this.h0.pop();
         p7 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, p7.class);
         if (this.t2 && var3 != null) {
            var1.n5(var3.k5());
            var3.l6(var1);
         } else {
            var1.n5(var2);
            var2 = var1;
         }

         this.h0.push(var2);
      } else if (this.c8 != null) {
         var1.n5(this.c8);
         this.c8 = var1;
      }
   }

   public final z1 l6(boolean var1) {
      if (this.c8 == null) {
         if (this.l6() == 3) {
            String var13 = this.u3() ? "Any" : "TextOnly";
            return this.u3() ? u3 : l6;
         } else {
            return n5;
         }
      } else {
         z0 var2 = new z0();
         var2.n5(this.c8);
         a8 var3 = new a8(this.u9.n5(this.a6.n5(com.aspose.slides.ms.System.Xml.k6.n5, null), null));
         var2.l6(var3);
         this.c8.n5(var2, this.a6, this.u9);
         int var4 = this.a6.n5();
         int var5 = this.u9.n5();
         s7 var6 = new s7(var5);
         s7 var7 = new s7(var5);
         s7[] var8 = new s7[var5];

         for (int var9 = 0; var9 < var5; var9++) {
            var8[var9] = new s7(var5);
         }

         var2.n5(var6, var7, var8);
         if (this.s7 <= 0) {
            int[][] var16 = (int[][])null;
            if (!this.a6.l6()) {
               if (this.x8) {
                  this.n5(var6, var8);
               }
            } else if (var1) {
               var16 = this.n5(var6, var8, var3.l6());
            }

            return var16 != null
               ? new u8(var16, this.a6, this.l6(), this.u3(), var2.l6().n5())
               : new p4(var6, var8, this.a6, this.u9, var3.l6(), this.l6(), this.u3(), var2.l6().n5());
         } else {
            s7 var14 = null;
            s7[] var10 = new s7[]{var14};
            s7[] var11 = this.n5(var6, var8, var10);
            var14 = var10[0];
            if (this.x8) {
               this.n5(this.n5(var6, var14, var11));

               for (int var12 = 0; var12 < var5; var12++) {
                  this.n5(this.n5(var8[var12], var14, var11));
               }
            }

            return new m8(var6, var8, this.a6, this.u9, var3.l6(), this.l6(), var2.l6().n5(), var14, this.s7);
         }
      }
   }

   private s7[] n5(s7 var1, s7[] var2, s7[] var3) {
      int var4 = this.u9.n5();
      var3[0] = new s7(var4);
      s7[] var5 = new s7[this.s7];
      int var6 = 0;

      for (int var7 = var4 - 1; var7 >= 0; var7--) {
         d9 var8 = this.u9.n5(var7).n5();
         if (var8.n5 == -2) {
            f4 var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6, f4.class);
            s7 var10 = new s7(var4);
            var10.l6();
            var10.l6(var2[var7]);
            if (com.aspose.slides.ms.System.c4.h0(var9.u3(), var9.k5())) {
               var10.l6(var9.a6());
            }

            for (int var11 = var10.u3(-1); var11 != -1; var11 = var10.u3(var11)) {
               if (var11 > var7) {
                  d9 var12 = this.u9.n5(var11).n5();
                  if (var12.n5 == -2) {
                     f4 var13 = com.aspose.slides.internal.v6g.k5.n5(var12.l6, f4.class);
                     var10.l6(var5[var13.l6()]);
                  }
               }
            }

            var5[var6] = var10;
            var9.n5(var6++);
            var3[0].l6(var7);
         }
      }

      return var5;
   }

   private void n5(s7 var1) {
      Object[] var2 = new Object[this.a6.n5()];

      for (int var3 = var1.u3(-1); var3 != -1; var3 = var1.u3(var3)) {
         d9 var4 = this.u9.n5(var3).n5();
         int var5 = var4.n5;
         if (var5 >= 0) {
            if (var2[var5] != null) {
               throw new UpaException(var2[var5], var4.l6);
            }

            var2[var5] = var4.l6;
         }
      }
   }

   private s7 n5(s7 var1, s7 var2, s7[] var3) {
      if (var1.k5(var2)) {
         s7 var4 = new s7(this.u9.n5());
         var4.l6(var1);
         var4.n5(var2);
         var1 = var1.k5();

         for (int var5 = var4.u3(-1); var5 != -1; var5 = var4.u3(var5)) {
            f4 var6 = com.aspose.slides.internal.v6g.k5.n5(this.u9.n5(var5).l6, f4.class);
            var1.l6(var3[var6.l6()]);
         }
      }

      return var1;
   }

   private void n5(s7 var1, s7[] var2) {
      this.l6(var1);

      for (int var3 = 0; var3 < this.u9.n5(); var3++) {
         this.l6(var2[var3]);
      }
   }

   private void l6(s7 var1) {
      Object[] var2 = new Object[this.a6.n5()];

      for (int var3 = var1.u3(-1); var3 != -1; var3 = var1.u3(var3)) {
         int var4 = this.u9.n5(var3).n5;
         if (var2[var4] == null) {
            var2[var4] = this.u9.n5(var3).l6;
         } else if (var2[var4] != this.u9.n5(var3).l6) {
            throw new UpaException(var2[var4], this.u9.n5(var3).l6);
         }
      }
   }

   private int[][] n5(s7 var1, s7[] var2, int var3) {
      short var4 = 8192;
      int var5 = this.u9.n5();
      int var6 = 8192 / var5;
      int var7 = this.a6.n5();
      ArrayList var8 = new ArrayList();
      Hashtable var9 = new Hashtable();
      var9.addItem(new s7(var5), -1);
      Queue var10 = new Queue();
      int var11 = 0;
      var10.enqueue(var1);
      var9.addItem(var1, 0);
      var8.addItem(new int[var7 + 1]);

      while (var10.size() > 0) {
         s7 var12 = (s7)var10.dequeue();
         int[] var13 = com.aspose.slides.internal.v6g.k5.k5(var8.get_Item(var11), int[].class);
         if (var12.n5(var3)) {
            var13[var7] = 1;
         }

         for (int var14 = 0; var14 < var7; var14++) {
            s7 var15 = new s7(var5);

            for (int var16 = var12.u3(-1); var16 != -1; var16 = var12.u3(var16)) {
               if (var14 == this.u9.n5(var16).n5) {
                  var15.l6(var2[var16]);
               }
            }

            Object var18 = var9.get_Item(var15);
            if (var18 != null) {
               var13[var14] = com.aspose.slides.internal.v6g.k5.u3(var18, int.class);
            } else {
               int var17 = var9.size() - 1;
               if (var17 >= var6) {
                  return (int[][])null;
               }

               var10.enqueue(var15);
               var9.addItem(var15, var17);
               var8.addItem(new int[var7 + 1]);
               var13[var14] = var17;
            }
         }

         var11++;
      }

      return com.aspose.slides.internal.v6g.k5.k5(var8.toArray(com.aspose.slides.internal.v6g.k5.n5(int[].class)), int[][].class);
   }
}
