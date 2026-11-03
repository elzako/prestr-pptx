package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.Queue;
import com.aspose.slides.Collections.Generic.LinkedList;
import com.aspose.slides.Collections.Generic.LinkedListNode;
import com.aspose.slides.Collections.Generic.List;

class f5 {
   private f0 l6;
   private String k5;
   private LinkedList<f5$n5> u3;
   private Queue a6;
   private boolean u9;
   private com.aspose.slides.ms.System.i1 h0;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.i1> n5 = new j3(this);

   public f5(f0 var1, String var2) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = new LinkedList<>();
      this.a6 = new Queue();
   }

   public v8 n5(w1 var1, boolean[] var2) {
      synchronized (this.l6) {
         return this.l6(var1, var2);
      }
   }

   static void n5(v8 var0, w1 var1) {
      if (var0.u3()) {
         boolean var2 = false;
         a5 var3 = var0.a6();
         boolean var4 = var1.y4() != null && !var1.y4().l6(var1.e2());
         f2 var5 = !var4 ? var1.h0() : var1.y4().n5();
         a5 var6 = var5 != null ? var5.n5(var1.e2(), "NTLM") : null;
         if (var3 == null
            || var6 == null
            || !com.aspose.slides.ms.System.d1.a6(var3.n5(), var6.n5())
            || !com.aspose.slides.ms.System.d1.a6(var3.l6(), var6.l6())
            || !com.aspose.slides.ms.System.d1.a6(var3.k5(), var6.k5())) {
            var2 = true;
         }

         if (!var2) {
            boolean var7 = var1.q0();
            boolean var8 = var0.u9();
            var2 = !var7 || var7 != var8;
         }

         if (var2) {
            var0.n5(false);
            var0.k5();
         }
      }
   }

   private f5$n5 k5() {
      for (f5$n5 var2 : this.u3) {
         if (!var2.u9()) {
            this.u3.removeItem(var2);
            this.u3.addFirst(var2);
            return var2;
         }
      }

      return null;
   }

   private v8 l6(w1 var1, boolean[] var2) {
      f5$n5 var3 = this.k5();
      if (var3 != null) {
         var2[0] = false;
         n5(var3.u3(), var1);
         return var3.u3();
      } else if (this.l6.l6() <= this.u3.size() && this.u3.size() != 0) {
         var2[0] = false;
         var3 = this.u3.getLast().getValue();
         this.u3.removeItem(var3);
         this.u3.addFirst(var3);
         return var3.u3();
      } else {
         var2[0] = true;
         var3 = new f5$n5(this);
         this.u3.addFirst(var3);
         return var3.u3();
      }
   }

   public String n5() {
      return this.k5;
   }

   Queue l6() {
      return this.a6;
   }

   boolean n5(com.aspose.slides.ms.System.s4 var1, com.aspose.slides.ms.System.j5[] var2) {
      com.aspose.slides.ms.System.j5 var3 = com.aspose.slides.ms.System.j5.t2().m3();

      while (true) {
         List var4 = null;
         boolean var10;
         synchronized (this.l6) {
            if (this.u9) {
               com.aspose.slides.ms.System.j5.l6.u3(var2[0]);
               return true;
            }

            int var6 = 0;
            LinkedListNode var7 = this.u3.getFirst();

            while (var7 != null) {
               f5$n5 var8 = (f5$n5)var7.getValue();
               LinkedListNode var9 = var7;
               var7 = var7.getNext();
               var6++;
               if (!var8.u9()) {
                  if (var6 <= this.l6.l6() && com.aspose.slides.ms.System.s4.u9(com.aspose.slides.ms.System.j5.t2(var3, var8.h0()), var1)) {
                     if (com.aspose.slides.ms.System.j5.n5(var8.h0(), var2[0])) {
                        var8.h0().u3(var2[0]);
                     }
                  } else {
                     if (var4 == null) {
                        var4 = new List();
                     }

                     var4.addItem(var8.u3());
                     this.u3.remove(var9);
                  }
               }
            }

            var10 = this.u3.size() == 0;
         }

         if (var4 == null) {
            return var10;
         }

         for (Object recoveredElement$var14$4001 : var4) {
            v8 var14 = (v8)recoveredElement$var14$4001;
            var14.n5(false);
         }
      }
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 n5(f5 var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static f0 n5(f5 var0) {
      return var0.l6;
   }
}
