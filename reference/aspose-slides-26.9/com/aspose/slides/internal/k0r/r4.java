package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class r4 extends e6r {
   private List<e6r> n5 = new List<>(10);
   private boolean l6 = false;

   public final boolean n3() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
      if (!var1) {
         this.y4();
      }
   }

   public void y4() {
   }

   public final List<e6r> e2() {
      return this.n5;
   }

   public final e6r l6(int var1) {
      return this.n5.get_Item(var1);
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("{0} Start\n",new Object[]{ com.aspose.slides.ms.System.j8.n5(this).s7()});
      var1.n5("Self: {0}\n",new Object[]{ super.toString()});

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         var1.n5("{0}\n",new Object[]{ this.e2().get_Item(var2)});
      }

      var1.n5("{0} End\n",new Object[]{ com.aspose.slides.ms.System.j8.n5(this).s7()});
      return var1.toString();
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.x8().getPosition() + this.w1().a6();

      while (var1.x8().getPosition() < var2) {
         e6r var4 = p5k.n5(var1, this);
         this.e2().addItem(var4);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         e6r var3 = this.e2().get_Item(var2);
         if (com.aspose.slides.internal.v6g.k5.l6(var3, d0.class)) {
            d0 var4 = (d0)var3;
            if (var4.e2().size() == 0) {
               continue;
            }
         }

         this.e2().get_Item(var2).l6(var1);
      }
   }

   @Override
   public int n5() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         e6r var3 = this.e2().get_Item(var2);
         if (com.aspose.slides.internal.v6g.k5.l6(var3, d0.class)) {
            d0 var4 = (d0)var3;
            if (var4.e2().size() == 0) {
               continue;
            }
         }

         var1 += var3.n5() + 8;
      }

      return var1;
   }

   public final e6r k5(int var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         e6r var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), e6r.class);
         if (var3.r4() == var1) {
            return var3.d2();
         }
      }

      return null;
   }

   public static List<e6r> n5(r4 var0, int var1) {
      List var2 = new List();
      n5(var0.e2(), var1, var2);
      return var2;
   }

   public final void n5(e6r var1) {
      int[] var2 = this.k5();
      var1.l6(this);
      byte var3 = 0;

      while (var3 + 1 < var2.length && (var2[var3] != (var1.r4() & 65535) || var2[var3 + 1] != Integer.MAX_VALUE && var2[var3 + 1] != var1.w1().k5())) {
         var3 += 2;
      }

      if (var3 + 1 >= var2.length) {
         this.e2().addItem(var1);
      } else {
         int var4 = 0;
         int var5 = 0;

         while (var4 < this.e2().size()) {
            e6r var6 = this.e2().get_Item(var4);
            if (var2[var5] == (var6.r4() & 65535) && (var2[var5 + 1] == Integer.MAX_VALUE || var2[var5 + 1] == var6.w1().k5())) {
               var4++;
            } else {
               int var7 = var5 + 2;

               while (var7 + 1 < var2.length && (var2[var7] != (var6.r4() & 65535) || var2[var7 + 1] != Integer.MAX_VALUE && var2[var7 + 1] != var6.w1().k5())) {
                  var7 += 2;
               }

               if (var7 + 1 >= var2.length) {
                  this.e2().insertItem(var4, var1);
                  return;
               }

               if (var7 > var3) {
                  this.e2().insertItem(var4, var1);
                  return;
               }

               var5 = var7;
            }
         }

         this.e2().addItem(var1);
      }
   }

   r4() {
      this.w1().n5((byte)15);
      this.w1().n5(0);
   }

   r4(int var1) {
      this.w1().n5((byte)15);
      this.w1().n5(var1);
   }

   public final e6r n5(int var1, short var2) {
      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         e6r var4 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var3), e6r.class);
         if (var4.r4() == var1 && var4.w1().k5() == var2) {
            return var4.d2();
         }
      }

      return null;
   }

   protected final z1 l6(short var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.e2().get_Item(var2), z1.class) && this.e2().get_Item(var2).w1().k5() == var1) {
            return (z1)this.e2().get_Item(var2);
         }
      }

      return null;
   }

   protected int[] k5() {
      throw new NotImplementedException();
   }

   private static void n5(IGenericEnumerable<e6r> var0, int var1, List<e6r> var2) {
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            e6r var4 = (e6r)var3.next();
            if (var4.r4() == var1) {
               var2.addItem(var4);
            } else {
               e6r var5 = com.aspose.slides.internal.v6g.k5.n5(var4, r4.class);
               if (var5 != null) {
                  n5(((r4)var5).e2(), var1, var2);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
