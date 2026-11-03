package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Queue;

public final class x8 {
   private p3 n5;

   public x8(p3 var1) {
      this.n5 = var1;
   }

   public final y4 n5() {
      int var1 = 0;
      int[] var2 = new int[]{0};
      y4 var3 = this.n5(var2);
      var1 = var2[0];
      return var1 <= 1 ? var3 : this.n5(var1);
   }

   private y4 n5(int[] var1) {
      var1[0] = this.l6();
      if (var1[0] != 1 && var1[0] != 0) {
         return var1[0] == -1 ? null : null;
      }

      y4 var2 = new y4(1);
      var2.n5(this.n5.u9());
      return var2;
   }

   private void n5(a5 var1, int var2) {
      v0 var3 = new v0(this.n5.u3().n5());
      a5 var4 = var1;
      var4.n5(var2);
      int var5 = 0;

      while (true) {
         for (int var6 = 0; var6 < 3; var6++) {
            if (!var4.l6()[var6].k5()) {
               a5 var7 = var4.l6()[var6].n5(var4);
               if (var7 != null && var7.k5() == -1) {
                  var7.n5(var2);
                  var3.n5(var7);
                  var5++;
               }
            }
         }

         if (--var5 < 0) {
            var1.n5(var2);
            return;
         }

         var4 = var3.n5();
      }
   }

   private y4 n5(int var1) {
      int var2 = this.n5.u3().n5();

      for (int var3 = 0; var3 < var2; var3++) {
         this.n5.u3().l6(var3).n5(-1);
      }

      int var10 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         if (this.n5.u3().l6(var4).k5() == -1) {
            this.n5(this.n5.u3().l6(var4), var10);
            var10++;
         }
      }

      f5 var11 = this.l6(var1);
      z1 var5 = this.k5(var1);
      y4 var6 = new y4(var1);

      for (int var7 = 0; var7 < var1; var7++) {
         n3 var8 = new n3(var11.n5(var7), var5.n5(var7));
         x8 var9 = new x8(var8);
         var9.l6();
         var6.n5(var8);
      }

      return var6;
   }

   private f5 l6(int var1) {
      f5 var2 = new f5(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.n5(new i9());
      }

      List var10 = new List();
      int var4 = this.n5.n5().n5();

      for (int var5 = 0; var5 < var4; var5++) {
         var10.clear();
         int var6 = this.n5.n5().l6(var5).u3().n5();

         for (int var7 = 0; var7 < var6; var7++) {
            if (var10.indexOf(this.n5.n5().l6(var5).u3().l6(var7).k5()) == -1) {
               var10.addItem(this.n5.n5().l6(var5).u3().l6(var7).k5());
            }
         }

         int var11 = var10.size();
         this.n5.n5().l6(var5).n5(new j4[var1]);

         for (int var8 = 0; var8 < var11; var8++) {
            j4 var9 = new j4(this.n5.n5().l6(var5));
            this.n5.n5().l6(var5).u9()[(Integer)var10.get_Item(var8)] = var9;
            var2.n5((Integer)var10.get_Item(var8)).n5(var9);
         }
      }

      return var2;
   }

   private z1 k5(int var1) {
      z1 var2 = new z1(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.n5(new t9());
      }

      int var8 = this.n5.l6().n5();

      for (int var4 = 0; var4 < var8; var4++) {
         if (this.n5.l6().l6(var4).k5()) {
            e2 var5 = this.n5.l6().l6(var4);
            a5 var6 = var5.l6()[0];
            a5 var7 = var5.l6()[1];
            if (var6 != null && var7 != null) {
               if (var6.k5() == var7.k5()) {
                  this.n5(var2, var5, var6.k5());
               } else {
                  this.n5(var2, var5, var6.k5());
                  this.n5(var2, var5, var7.k5());
               }
            } else if (var6 != null && var7 == null) {
               this.n5(var2, var5, var6.k5());
            } else if (var6 == null && var7 != null) {
               this.n5(var2, var5, var7.k5());
            }
         }
      }

      return var2;
   }

   private void n5(z1 var1, e2 var2, int var3) {
      if (!var2.n5()[0].u9()[var3].n5(var2.n5()[1].u9()[var3])) {
         var1.n5(var3).n5(new e2(var2.n5()[0].u9()[var3], var2.n5()[1].u9()[var3]));
      }
   }

   private int l6() {
      if (this.n5.a6() == null) {
         return -1;
      }

      int var1 = this.k5();
      this.u3();
      return var1;
   }

   private int k5() {
      t9 var1 = new t9();
      int var2 = this.n5.l6().n5();

      for (int var3 = 0; var3 < var2; var3++) {
         if (this.n5.l6().l6(var3).k5()) {
            var1.n5(this.n5.l6().l6(var3));
         }
      }

      a5 var10 = this.n5.a6().l6().l6(0).a6();
      int var4 = 0;
      int var5 = 0;
      this.n5(var10, var4);
      z1 var6 = new z1();
      var6.n5(new t9());
      var6.n5(new t9());
      int var7 = var1.n5();

      for (int var8 = 0; var8 < var7; var8++) {
         if (var1.l6(var8).l6()[0].k5() != 0 && var1.l6(var8).l6()[1].k5() != 0) {
            var6.n5(1).n5(var1.l6(var8));
         } else {
            var6.n5(0).n5(var1.l6(var8));
         }
      }

      while (var6.n5(var4).n5() > 0) {
         for (int var12 = 0; var12 < var6.n5(var4).n5(); var12++) {
            var10 = this.n5(var6, var4, var12);
            if (var10 != null) {
               this.n5(var10, var4 + 1);
               if ((var4 + 1) % 2 == 1) {
                  var5++;
               }
            }
         }

         t9 var13 = var6.n5(var4 + 1);
         var6.n5(var4 + 1, new t9());
         var6.n5(new t9());

         for (int var9 = 0; var9 < var13.n5(); var9++) {
            if (var13.l6(var9).l6()[0].k5() != var4 + 1 && var13.l6(var9).l6()[1].k5() != var4 + 1) {
               var6.n5(var4 + 2).n5(var13.l6(var9));
            } else {
               var6.n5(var4 + 1).n5(var13.l6(var9));
            }
         }

         var4++;
      }

      return var5;
   }

   private a5 n5(z1 var1, int var2, int var3) {
      a5 var4 = null;
      if (var1.n5(var2).l6(var3).l6()[0].k5() == -1) {
         var4 = var1.n5(var2).l6(var3).l6()[0];
      }

      if (var1.n5(var2).l6(var3).l6()[1].k5() == -1) {
         var4 = var1.n5(var2).l6(var3).l6()[1];
      }

      return var4;
   }

   private void u3() {
      Queue var1 = new Queue(this.n5.l6().n5());

      for (int var2 = 0; var2 < this.n5.l6().n5(); var2++) {
         var1.enqueue(this.n5.l6().l6(var2));
      }

      int var3 = var1.size();

      for (int var4 = 0; var4 < var3; var4++) {
         e2 var5 = (e2)var1.dequeue();
         if (!var5.k5()) {
            if (var5.l6()[0] != null && var5.l6()[1] != null && var5.l6()[0].k5() % 2 == 0 && var5.l6()[1].k5() % 2 == 0) {
               z6.n5(this.n5, var5, false);
            }

            if (var5.l6()[0] == null && var5.l6()[1] != null && var5.l6()[1].k5() % 2 == 0
               || var5.l6()[1] == null && var5.l6()[0] != null && var5.l6()[0].k5() % 2 == 0) {
               z6.n5(this.n5, var5, false);
            }
         }
      }

      var3 = this.n5.l6().n5();

      for (int var8 = 0; var8 < var3; var8++) {
         e2 var6 = this.n5.l6().l6(var8);
         if (var6.k5() && var6.l6()[0] != null && var6.l6()[1] != null) {
            if (var6.l6()[0].k5() % 2 == 0) {
               z6.n5(this.n5, var6.l6()[0], true);
            } else if (var6.l6()[1].k5() % 2 == 0) {
               z6.n5(this.n5, var6.l6()[1], true);
            }
         }
      }
   }
}
