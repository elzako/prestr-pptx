package com.aspose.slides.internal.d5;

import com.aspose.slides.Collections.Stack;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.a0.m3;
import com.aspose.slides.internal.d2.e2;
import com.aspose.slides.internal.d2.s7;
import com.aspose.slides.internal.d2.t9;
import com.aspose.slides.internal.d2.z1;
import com.aspose.slides.ms.System.IDisposable;

public class h0 {
   private List<com.aspose.slides.internal.d2.c8> n5;
   private List<com.aspose.slides.internal.d2.c8> l6;
   private int k5;
   private t9 u3;
   private t9 a6;
   private Stack u9;
   private Stack h0;
   private Dictionary<s7, Integer> c8 = new Dictionary<>();

   public h0(List<com.aspose.slides.internal.d2.c8> var1) {
      this.n5 = var1;
      this.l6 = new List<>();
      this.k5 = -1;
      this.u9 = new Stack();
      this.h0 = new Stack();
   }

   public final List<com.aspose.slides.internal.d2.c8> n5() {
      if (this.n5 != null) {
         List$Enumerator var1 = this.n5.iterator();

         try {
            while (var1.hasNext()) {
               com.aspose.slides.internal.d2.c8 var2 = (com.aspose.slides.internal.d2.c8)var1.next();
               this.n5(var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }

      this.u3();
      return this.l6;
   }

   private void n5(com.aspose.slides.internal.d2.c8 var1) {
      this.n5(a6(var1), u3(var1), var1);
   }

   private void n5(List<s7> var1, t9 var2, com.aspose.slides.internal.d2.c8 var3) {
      if (this.a6 == null || var2 != this.a6) {
         this.l6(var2, var3);
         this.k5(var1, var2);
         this.l6(var1, var2, var3);
      }
   }

   private boolean n5(t9 var1, com.aspose.slides.internal.d2.c8 var2) {
      return this.u3 != null && var1 != this.u3 ? true : this.k5 != -1 && var2.h0() != this.k5;
   }

   private void l6() {
      this.n5((t9)null);
   }

   private void n5(t9 var1) {
      if (this.a6 != null) {
         k5(this.a6);
         if (this.h0.size() != 0) {
            ((s7)this.h0.peek()).n5(this.a6);
         } else {
            this.l6.addItem(this.a6);
         }
      }

      this.a6 = null;
   }

   private void l6(t9 var1, com.aspose.slides.internal.d2.c8 var2) {
      if (this.n5(var1, var2)) {
         this.n5(var1);
      }
   }

   private boolean n5(List<s7> var1, t9 var2) {
      if (var1 == null || var1.size() == 0) {
         return this.u9.size() != 0;
      }

      if (this.u9.size() == 0) {
         return false;
      }

      s7 var3 = (s7)var1.get_Item(0);
      s7 var4 = (s7)this.u9.peek();
      return var3 != var4 && !n5(var3, var4);
   }

   private void k5() {
      this.l6((List<s7>)null, (t9)null);
   }

   private void l6(List<s7> var1, t9 var2) {
      if (var1 != null && var1.size() != 0) {
         com.aspose.slides.internal.r4.u3 var7 = new com.aspose.slides.internal.r4.u3(var1);

         while (var7.l6()) {
            s7 var4 = (s7)var7.k5();
            s7 var5 = this.u9.size() == 0 ? null : (s7)this.u9.peek();
            if (var5 != null) {
               if (var4 == var5) {
                  break;
               }

               this.u9.pop();
               s7 var6 = (s7)this.h0.pop();
               if (this.h0.size() == 0) {
                  this.l6.addItem(var6);
               } else {
                  ((s7)this.h0.peek()).n5(var6);
               }

               if (this.u9.size() != 0 && this.u9.peek() == var4) {
                  break;
               }
            }
         }
      } else {
         while (this.h0.size() != 0) {
            this.u9.pop();
            s7 var3 = (s7)this.h0.pop();
            if (this.h0.size() == 0) {
               this.l6.addItem(var3);
            } else {
               ((s7)this.h0.peek()).n5(var3);
            }
         }
      }
   }

   private void k5(List<s7> var1, t9 var2) {
      if (this.n5(var1, var2)) {
         this.l6(var1, var2);
      }
   }

   private void u3() {
      this.l6();
      this.k5();
   }

   private void l6(List<s7> var1, t9 var2, com.aspose.slides.internal.d2.c8 var3) {
      if (!this.l6(var3)) {
         if (var1 != null && var1.size() != 0) {
            this.n5(var1);
         }

         if (var2 != null) {
            this.k5(var2, var3);
         } else {
            this.k5(var3);
         }

         this.k5 = var3.h0();
         this.u3 = var2;
      } else if (this.a6 != null) {
         this.l6();
         this.u3 = null;
      } else {
         this.u3 = null;
      }
   }

   private boolean l6(com.aspose.slides.internal.d2.c8 var1) {
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.d2.c8 var3 = (com.aspose.slides.internal.d2.c8)var2.next();
            if (var1.n5(var3)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   private void n5(List<s7> var1) {
      List var2 = new List();
      List$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            s7 var4 = (s7)var3.next();
            if (this.u9.contains(var4)) {
               break;
            }

            var2.insertItem(0, var4);
            if (this.c8.containsKey(var4)) {
               this.c8.set_Item(var4, this.c8.get_Item(var4) + 1);
            } else {
               this.c8.addItem(var4, 1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      List$Enumerator var13 = var2.iterator();

      try {
         while (var13.hasNext()) {
            s7 var5 = (s7)var13.next();
            this.u9.push(var5);
            this.h0.push(n5(var5, this.n5(var5)));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   private int n5(s7 var1) {
      if (var1.x8.size() == 1) {
         return 3;
      } else {
         int var2 = this.c8.get_Item(var1);
         if (var2 == 1) {
            return 0;
         } else {
            return var2 == var1.x8.size() ? 1 : 2;
         }
      }
   }

   private void k5(t9 var1, com.aspose.slides.internal.d2.c8 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, z1.class)) {
         this.a6 = var1;
      } else {
         if (this.a6 == null) {
            this.a6 = l6(var1);
         }

         this.a6.n5((com.aspose.slides.internal.a0.l6)var2);
      }
   }

   private void k5(com.aspose.slides.internal.d2.c8 var1) {
      if (this.h0.size() == 0) {
         this.l6.addItem(var1);
      } else {
         ((s7)this.h0.peek()).n5(var1);
      }
   }

   private static s7 n5(s7 var0, int var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.d2.k5.class)) {
         return n5((com.aspose.slides.internal.d2.k5)var0, var1);
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.d2.a6.class)
            ? n5((com.aspose.slides.internal.d2.a6)var0, var1)
            : l6(var0, var1);
      }
   }

   private static s7 n5(com.aspose.slides.internal.d2.k5 var0, int var1) {
      com.aspose.slides.internal.d2.k5 var2 = new com.aspose.slides.internal.d2.k5();
      if (var0 != null) {
         n5(var2, var0, var1);
         n5(var2, var0);
      }

      return var2;
   }

   private static void n5(com.aspose.slides.internal.d2.k5 var0, com.aspose.slides.internal.d2.k5 var1) {
      m3 var2 = var1.m1();
      if (var2 != null) {
         String[] var3 = var2.u3();
         if (var3.length > 0) {
            String var4 = var3[0];
            m3 var5 = new m3(var4, var0);
            var0.n5(var5);
            var2.n5(var5);
         }
      }
   }

   private static s7 n5(com.aspose.slides.internal.d2.a6 var0, int var1) {
      com.aspose.slides.internal.d2.a6 var2 = new com.aspose.slides.internal.d2.a6();
      if (var0 != null) {
         n5(var2, var0, var1);
         n5(var2, var0);
      }

      return var2;
   }

   private static void n5(com.aspose.slides.internal.d2.a6 var0, com.aspose.slides.internal.d2.a6 var1) {
      var0.l6(var1.l6());
      var0.t2(var1.m1());
   }

   private static s7 l6(s7 var0, int var1) {
      s7 var2 = new s7();
      if (var0 != null) {
         n5(var2, var0, var1);
      }

      return var2;
   }

   private static void n5(s7 var0, s7 var1, int var2) {
      var0.n5(var1.q0());
      switch (var2) {
         case 0:
            var0.n5(16, null);
            var0.n5(20, null);
            var0.n5(28, null);
            break;
         case 1:
            var0.n5(15, null);
            var0.n5(19, null);
            var0.n5(27, null);
            break;
         case 2:
            var0.n5(20, null);
            var0.n5(19, null);
            var0.n5(16, null);
            var0.n5(15, null);
            var0.n5(28, null);
            var0.n5(27, null);
         case 3:
      }

      var0.k5(var1.e_());
      var0.t9(var1.w1());
   }

   private static t9 l6(t9 var0) {
      t9 var1 = new t9();
      if (var0 != null) {
         var1.n5(var0.q0());
         var1.k5(var0.e_());
         var1.t9(var0.w1());
         var1.n3(var0.m3());
         var1.t2(var0.m1());
         var1.s7(var0.k7());
      }

      return var1;
   }

   private static void k5(t9 var0) {
      int var1 = 0;
      List$Enumerator var2 = var0.d_().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.d2.c8 var3 = (com.aspose.slides.internal.d2.c8)var2.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3, e2.class)) {
               e2 var4 = (e2)var3;
               if (var4.k7()) {
                  var1++;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (var1 > 0) {
         var0.l6(var0.l6() + var1 * var0.m1());
      }
   }

   private static t9 u3(com.aspose.slides.internal.d2.c8 var0) {
      t9 var1 = null;

      while (var1 == null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, t9.class)) {
            var1 = (t9)var0;
         } else {
            com.aspose.slides.internal.a0.l6 var2 = var0.t4();
            if (!com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.d2.c8.class)) {
               break;
            }

            var0 = (com.aspose.slides.internal.d2.c8)var2;
         }
      }

      return var1;
   }

   private static List<s7> a6(com.aspose.slides.internal.d2.c8 var0) {
      List var1 = new List();
      com.aspose.slides.internal.a0.l6 var2 = var0.t4();

      while (var2 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.d2.c8.class)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var2, s7.class) && !com.aspose.slides.internal.v6g.k5.l6(var2, t9.class)) {
               var1.addItem((s7)var2);
            }

            var2 = ((com.aspose.slides.internal.d2.c8)var2).t4();
         } else {
            var2 = null;
         }
      }

      return var1;
   }

   private static boolean n5(s7 var0, s7 var1) {
      return var0.t4() == var1;
   }
}
