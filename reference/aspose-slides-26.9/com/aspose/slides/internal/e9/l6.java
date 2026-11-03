package com.aspose.slides.internal.e9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.e1.a0;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.j5;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.m1;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.n3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.s3;
import com.aspose.slides.internal.e1.s7;
import com.aspose.slides.internal.e1.t2;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.e1.x8;
import com.aspose.slides.internal.e1.y4;
import com.aspose.slides.internal.e1.z1;
import com.aspose.slides.internal.e1.z3;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.w0.c8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class l6 extends y4 {
   private w1 n5;
   private List<l6$n5> l6 = new List<>();
   private y1 k5 = y1.n5.y4();
   private Stack<n3> u3 = new Stack<>();
   private Dictionary<m3, Boolean> a6;

   public l6(Dictionary<m3, Boolean> var1) {
      this.a6 = var1;
   }

   public final void n5(List<w1> var1, y1 var2) {
      var2.a6(this.k5);
      if (var1.size() != 0) {
         float var3 = 0.0F;
         w1 var4 = new w1(((w1)var1.get_Item(0)).l6(), ((w1)var1.get_Item(0)).k5());
         List var5 = new List();

         for (int var6 = 0; var6 < var1.size(); var6++) {
            w1 var7 = (w1)var1.get_Item(var6);
            y1 var8 = new y1();
            if (this.a6.size() > 0) {
               l6$l6 var9 = new l6$l6(this.a6);
               var9.l6(var7);
               n5((m3)var9.n5()).a6(var8);
            } else {
               n5((m3)var7).a6(var8);
            }

            if ((var8.l6() <= var7.k5() || var8.k5() <= var7.k5()) && var4.t2() == 0) {
               var5.addItem(var7);
            } else if (!this.n5(var1)) {
               var5.addItem(var7);
            } else {
               for (int var11 = 0; var11 < var7.t2(); var11++) {
                  t2 var10 = new t2();
                  var10.n5(var7.n5(var11));
                  var4.n5(var10);
                  var10.n5(new c8(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, var3));
               }

               var3 += var8.k5();
            }
         }

         if (var4.t2() > 0) {
            this.l6(var4);
            this.n5(var5, new f2(this.n5.l6(), this.n5.k5()));
         }

         var1.clear();
         var1.addRange(var5);
      }
   }

   private boolean n5(List<w1> var1) {
      if (var1 != null && var1.size() >= 2) {
         for (int var2 = 0; var2 < var1.size(); var2++) {
            if (var2 + 1 >= var1.size()) {
               return true;
            }

            if (((w1)var1.get_Item(var2)).u3() != ((w1)var1.get_Item(var2 + 1)).u3() || ((w1)var1.get_Item(var2)).a6() != ((w1)var1.get_Item(var2 + 1)).a6()) {
               return false;
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public static m1 n5(m1 var0, y1 var1) {
      if (var0.a6() != 0) {
         return var0.a6() == 7 ? new m1(var1.y4(), var0.u9(), var0.h0()) : new m1(var0.a6(), var1.y4(), var0.h0());
      } else {
         return new m1(var1.y4(), var0.k5(), var0.h0());
      }
   }

   private t2 k5(t2 var1) {
      t2 var2 = this.u9(var1);

      for (int var3 = 0; var3 < var1.t2(); var3++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(var3), t2.class)) {
            var2.n5(this.k5(com.aspose.slides.internal.v6g.k5.n5(var1.n5(var3), t2.class)));
         } else {
            var2.n5(var1.n5(var3));
         }
      }

      return var2;
   }

   private static t2 u3(t2 var0) {
      t2 var1 = new t2();
      if (var0.u3() != null) {
         var1.n5(var0.u3().k5());
      }

      var1.n5(var0.a6());

      for (int var2 = 0; var2 < var0.t2(); var2++) {
         var1.n5(var0.n5(var2));
      }

      return var1;
   }

   @Override
   public void n5(w1 var1) {
      this.n5 = new w1(var1.l6(), var1.k5());
      this.u3.push(this.n5);
   }

   private void n5(List<w1> var1, f2 var2) {
      for (boolean var3 = true; this.l6.size() > 0; var3 = false) {
         this.n5 = new w1(var2.l6(), var2.k5());
         List var4 = new List();
         float var5 = 0.0F;
         List var6 = new List();
         List$Enumerator var7 = this.l6.iterator();

         try {
            while (var7.hasNext()) {
               l6$n5 var8 = (l6$n5)var7.next();
               t2 var9 = this.k5(var8.n5());
               var6.addItem(new l6$n5(var9, var8.l6(), var8.u3(), var8.k5()));
               if (var9.u3() == null) {
                  var9.n5(new c8());
               }

               if (!var3) {
                  var9.u3().l6(0.0F, -this.k5.k5() + this.k5.t2());
               }

               y1 var10 = n5((m3)var9).y4();
               var4.addItem(var10.y4());
               if (!var8.l6() && !var8.u3() && var10.t2() <= this.k5.l6() && var10.l6() > this.k5.l6() && var10.k5() <= this.k5.k5()) {
                  float var11 = this.k5.l6() - var10.t2();
                  if (!var8.k5() || var11 / this.k5.k5() < 0.3) {
                     var5 = q1.n5(var5, var11);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         float var22 = this.k5.l6() - var5 - 1.0F;

         for (int var23 = 0; var23 < var4.size(); var23++) {
            y1 var25 = ((y1)var4.get_Item(var23)).y4();
            l6$n5 var27 = this.l6.get_Item(var23);
            if (!var27.l6() && !var27.u3() && var25.t2() <= var22 && var25.l6() > var22 && var25.k5() <= this.k5.k5() && var22 - var25.t2() < 5.0F) {
               var5 = q1.n5(var5, var22 - var25.t2());
            }
         }

         int var24 = 0;
         this.l6.clear();
         float var26 = this.k5.l6() - var5;
         List$Enumerator var28 = var6.iterator();

         try {
            while (var28.hasNext()) {
               l6$n5 var12 = (l6$n5)var28.next();
               y1 var13 = ((y1)var4.get_Item(var24++)).y4();
               if (var13.t2() >= var26 && var13.k5() <= this.k5.k5()) {
                  this.l6.addItem(new l6$n5(var12.n5(), var12.l6(), var12.u3(), var12.k5()));
                  var12.n5().u3().l6(0.0F, var5);
               } else if ((var12.l6() || !(var13.k5() > this.k5.k5())) && !var12.u3()) {
                  this.n5.n5(var12.n5());
               } else {
                  t2 var14 = u3(var12.n5());
                  if (var13.l6() > var26) {
                     this.l6.addItem(new l6$n5(var12.n5(), false, var12.u3(), var12.k5()));
                     var12.n5().u3().l6(0.0F, var5);
                  }

                  this.a6(var14);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
               var28.dispose();
            }
         }

         var1.addItem(this.n5);
      }
   }

   private void a6(t2 var1) {
      c4 var2 = new c4();
      var2.l6(new y1(0.0F, this.k5.n3(), this.n5.l6(), this.k5.k5()));
      t2 var3 = new t2();
      r4 var4 = new r4();
      var4.n5(var2);
      var3.n5(var4);
      var3.n5(var1);
      this.n5.n5(var3);
   }

   @Override
   public void l6(w1 var1) {
      this.u3.pop();
   }

   private t2 u9(t2 var1) {
      t2 var2 = new t2();
      if (var1.u3() != null) {
         var2.n5(var1.u3().k5());
      }

      if (var1.a6() != null) {
         var2.n5(var1.a6());
         if (var1.a6().u3() != null) {
            var2.a6().n5(var1.a6().u3().k5());
         }
      }

      return var2;
   }

   @Override
   public void n5(t2 var1) {
      t2 var2 = this.u9(var1);
      this.u3.peek().n5(var2);
      this.u3.push(var2);
   }

   @Override
   public void l6(t2 var1) {
      this.u3.pop();
   }

   public static y1 n5(m3 var0) {
      com.aspose.slides.internal.e1.h0 var1 = new com.aspose.slides.internal.e1.h0();
      return var1.n5(var0);
   }

   private t2 n5() {
      t2 var1 = new t2();
      if (this.u3.size() > 1) {
         n3[] var2 = this.u3.toArray(new n3[0]);

         for (int var3 = var2.length - 2; var3 >= 0; var3--) {
            t2 var4 = this.u9((t2)var2[var3]);
            var1.n5(var4);
            var1 = var4;
         }
      }

      return var1;
   }

   private t2 k5(m3 var1) {
      return var1.y2() == null ? (t2)var1 : this.k5(var1.y2());
   }

   private t2 h0(t2 var1) {
      if (var1.t2() == 0) {
         return null;
      }

      t2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(0), t2.class);
      if (var2 == null) {
         return var1;
      }

      t2 var3 = this.h0(var2);
      if (var3 == null) {
         return null;
      }

      var1.l6(var2);
      if (var3.a6() == null) {
         if (var3.u3() != null) {
            if (var1.u3() == null) {
               var1.n5(new c8());
            }

            var1.u3().n5(var3.u3(), 0);

            for (int var4 = 0; var4 < var3.t2(); var4++) {
               var1.n5(var3.n5(var4));
            }
         }
      } else {
         var1.n5(var3);
      }

      return var1;
   }

   private void u3(m3 var1) {
      t2 var2 = this.n5();
      var2.n5(var1);
      t2 var3 = this.k5((m3)var2);
      t2 var4 = this.h0(var3);
      if (var4 != null) {
         t2 var5 = new t2();
         var5.n5(var4);
         var3 = var5;
         this.l6
            .addItem(
               new l6$n5(
                  var3,
                  this.a6.containsKey(var1),
                  com.aspose.slides.internal.v6g.k5.l6(var1, r4.class) && ((r4)var1).n3() != null,
                  com.aspose.slides.internal.v6g.k5.l6(var1, r4.class)
               )
            );
      }
   }

   @Override
   public void n5(z1 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(r4 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(k7 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.u9 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(j5 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(s3 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(s7 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(x8 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(a0 var1) {
      this.u3(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.c8 var1) {
      this.u3(var1);
   }

   @Override
   public boolean n5(z3 var1) {
      this.u3(var1);
      return true;
   }
}
