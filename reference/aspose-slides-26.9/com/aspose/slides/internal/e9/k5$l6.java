package com.aspose.slides.internal.e9;

import com.aspose.slides.Collections.Generic.Queue;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.e1.a0;
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
import com.aspose.slides.internal.w0.c8;

public class k5$l6 extends y4 {
   private w1 n5;
   private Stack<t2> l6 = new Stack<>();
   private Stack<t2> k5 = new Stack<>();
   private Queue<t2> u3 = new Queue<>();

   public final w1 n5() {
      return this.n5;
   }

   private n3 l6() {
      return this.k5.peek();
   }

   @Override
   public void n5(w1 var1) {
      this.n5 = new w1(var1.l6(), var1.k5());
   }

   private k5$n5 k5() {
      c8 var1 = new c8();
      com.aspose.slides.internal.f2.u3 var2 = com.aspose.slides.internal.e9.k5.q0();
      k5$n5 var3 = null;
      t2[] var4 = this.l6.toArray(new t2[0]);
      m1 var5 = null;

      for (int var6 = var4.length - 1; var6 >= 0; var6--) {
         t2 var7 = com.aspose.slides.internal.v6g.k5.n5(var4[var6], k5$n5.class);
         if (var7 != null && var7.u9() != null) {
            var5 = var7.u9();
         }

         if (var7 != null && ((k5$n5)var7).n5().a6() != 9) {
            var2 = ((k5$n5)var7).n5();
         } else if (var7 == null) {
            var7 = com.aspose.slides.internal.v6g.k5.n5(var4[var6], t2.class);
         }

         if (var7.a6() != null) {
            k5$n5 var8 = new k5$n5();
            if (var7.a6() != null) {
               var8.n5(var7.a6().y4());
            }

            if (var7.u3() != null) {
               var8.n5(var7.u3().k5());
            }

            if (!var1.n5()) {
               k5$n5 var9 = new k5$n5();
               var9.n5(var1);
               var1 = new c8();
               var9.n5(var8);
               if (var3 != null) {
                  var3.n5(var9);
               }
            } else if (var3 != null) {
               var3.n5(var8);
            }

            var3 = var8;
         } else if (var7.u3() != null) {
            var1.n5(var7.u3().k5(), 0);
         }
      }

      if (var3 == null) {
         var3 = new k5$n5();
         var3.n5(var1);
      } else if (!var1.n5()) {
         k5$n5 var10 = new k5$n5();
         var10.n5(var1);
         var3.n5(var10);
         var3 = var10;
      }

      var3.n5(var2);
      if (var5 != null) {
         var3.n5(var5);
      }

      return var3;
   }

   @Override
   public void n5(t2 var1) {
      this.l6.push(var1);
      k5$n5 var2 = this.k5();
      this.k5.push(var2);
      if (var2.y2() != null) {
         com.aspose.slides.internal.f2.u3 var3 = var2.n5();
         var2 = this.n5(var2.y2());
         var2.n5(var3);
      }

      this.u3.enqueue(var2);
   }

   private k5$n5 n5(m3 var1) {
      return var1.y2() == null ? (k5$n5)var1 : this.n5(var1.y2());
   }

   @Override
   public void l6(t2 var1) {
      this.l6.pop();
      this.k5.pop();
      if (this.l6.size() == 0) {
         while (this.u3.size() != 0) {
            k5$n5 var2 = (k5$n5)this.u3.dequeue();
            if (var2.t2() > 0) {
               this.n5.n5(var2);
            }
         }
      }
   }

   @Override
   public void n5(z1 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(r4 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(k7 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.u9 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(j5 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(s3 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(s7 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(x8 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(a0 var1) {
      this.l6().n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.c8 var1) {
      this.l6().n5(var1);
   }

   @Override
   public boolean n5(z3 var1) {
      this.l6().n5(var1);
      return true;
   }
}
