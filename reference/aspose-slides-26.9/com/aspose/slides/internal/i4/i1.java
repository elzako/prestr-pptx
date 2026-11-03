package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.Stack;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

public class i1 implements j8, w2 {
   private j9 h0;
   private y9 c8;
   private a1 t2;
   private com.aspose.slides.internal.l7h.a5 s7 = new com.aspose.slides.internal.l7h.a5();
   private String x8 = com.aspose.slides.ms.System.d1.n5;
   private a8 n3 = new a8();
   private Stack y4 = new Stack();
   protected com.aspose.slides.Collections.Generic.Stack<y9> n5 = new com.aspose.slides.Collections.Generic.Stack<>();
   private com.aspose.slides.Collections.Generic.Stack<String> e2;
   protected boolean l6;
   protected g7 k5;
   protected int u3;
   protected j5 a6 = null;
   protected z1 u9 = null;

   public final com.aspose.slides.Collections.Generic.Stack<String> n5() {
      return this.e2;
   }

   public final void n5(com.aspose.slides.Collections.Generic.Stack<String> var1) {
      this.e2 = var1;
   }

   protected final void n5(y1 var1) {
      this.n5.push(new y9(this.s7(), var1));
   }

   protected final void n5(y9 var1) {
      this.n5.push(var1);
   }

   protected final void l6() {
      this.n5.pop();
   }

   protected final void n5(String var1) {
      if (this.a6 != null && com.aspose.slides.ms.System.d1.a6(this.a6.u9(), var1)) {
         this.a6 = null;
      }
   }

   protected final boolean k5() {
      return this.l6 || this.u9 != null || this.a6 != null;
   }

   @Override
   public final j9 u3() {
      return this.h0;
   }

   public final y9 a6() {
      return this.c8;
   }

   public final a1 u9() {
      return this.t2;
   }

   public final void n5(a1 var1) {
      this.t2 = var1;
   }

   @Override
   public final g7 h0() {
      return this.k5;
   }

   public final y1 c8() {
      return this.n3.n5;
   }

   @Override
   public final g7 t2() {
      return this.n3.l6;
   }

   @Override
   public final void n5(g7 var1) {
      this.n3.l6 = var1;
      this.n3.n5 = null;
   }

   public final void n5(g7 var1, y1 var2) {
      this.n3.l6 = var1;
      this.n3.n5 = var2;
   }

   public final y9 s7() {
      return this.n5.peek();
   }

   @Override
   public final void n5(u5 var1) {
      this.s7 = new com.aspose.slides.internal.l7h.a5();
      this.l6 = false;
      this.x8 = com.aspose.slides.ms.System.d1.n5;
      IGenericEnumerator var2 = var1.n5().iterator();

      try {
         while (var2.hasNext()) {
            h6 var3 = (h6)var2.next();
            a1 var4 = (a1)var3.n5();
            this.t2 = var4;
            this.n5((g7)null);
            var4.n5(this);
            if (this.l6) {
               this.l6 = false;
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void n5(t2 var1) {
      switch (var1.k5()) {
         case 0:
            var1.l6().n5(this);
            break;
         case 1:
            new s7(12, var1.n5(), var1.l6()).n5(this);
            break;
         case 2:
            new s7(11, var1.n5(), var1.l6()).n5(this);
            break;
         case 3:
            new s7(10, var1.n5(), var1.l6()).n5(this);
            break;
         case 4:
            new s7(9, var1.n5(), var1.l6()).n5(this);
            break;
         case 5:
            new s7(8, var1.n5(), var1.l6()).n5(this);
            break;
         case 6:
            new s7(19, var1.n5(), var1.l6()).n5(this);
            break;
         case 7:
            new s7(20, var1.n5(), var1.l6()).n5(this);
            break;
         case 8:
            new s7(21, var1.n5(), var1.l6()).n5(this);
            break;
         case 9:
            new s7(14, var1.n5(), var1.l6()).n5(this);
            break;
         case 10:
            new s7(15, var1.n5(), var1.l6()).n5(this);
            break;
         case 11:
            new s7(16, var1.n5(), var1.l6()).n5(this);
            break;
         default:
            throw new NotSupportedException();
      }

      g7 var2 = this.t2();
      i6 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class);
      if (var3 == null) {
         var3 = new i6(var1.n5(), null);
      }

      this.n5(var3, var2);
      this.n5(var2);
   }

   public final void n5(i6 var1, g7 var2) {
      y2 var3 = null;
      if (!com.aspose.slides.internal.v6g.k5.l6(var1.n5(), p3.class)) {
         throw new j3("The left member of an assignment must be a member");
      }

      this.n5((Object)var2);
      y1 var4;
      if (var1.l6() != null) {
         var1.l6().n5(this);
         var4 = com.aspose.slides.internal.v6g.k5.n5(this.t2(), y1.class);
         if (var4 == null) {
            throw new j3("Attempt to assign to an undefined variable.");
         }
      } else {
         var4 = this.s7();
         String var5 = ((s0)var1.n5()).n5();
         y2[] var6 = new y2[]{var3};
         this.s7().n5(var5, var6);
         var3 = var6[0];
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(), s0.class)) {
         String var9 = ((s0)var1.n5()).n5();
         var4.n5(var9, var2);
         this.n5(var2);
      } else {
         v3 var10 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), v3.class);
         var10.n5().n5(this);
         j4 var7 = com.aspose.slides.internal.v6g.k5.n5(var4, j4.class);
         if (var7 != null && var7.a0() != null) {
            var7.a0().n5(var7, this.t2(), var2);
            this.n5(var2);
            return;
         }

         var4.n5(this.t2(), var2);
         this.n5(var2);
      }
   }

   @Override
   public final void n5(m1 var1) {
      IGenericEnumerator var2 = var1.n5().iterator();

      try {
         do {
            if (!var2.hasNext()) {
               return;
            }

            a1 var3 = (a1)var2.next();
            var3.n5(this);
         } while (!this.k5());
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void n5(n3 var1) {
      a1 var2 = this.u9();
      IGenericEnumerator var3 = var1.n5().iterator();

      label56: {
         try {
            do {
               if (!var3.hasNext()) {
                  break label56;
               }

               h6 var4 = (h6)var3.next();
               a1 var5 = (a1)var4.n5();
               this.n5((a1)var4.n5());
               this.n5((g7)null);
               var5.n5(this);
            } while (!this.k5());
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return;
      }

      this.n5(var2);
   }

   @Override
   public final void n5(j5 var1) {
      this.a6 = var1;
   }

   @Override
   public final void n5(z1 var1) {
      this.u9 = var1;
   }

   @Override
   public final void n5(d2 var1) {
      do {
         var1.l6().n5(this);
         this.n5(var1.u9());
         if (this.k5()) {
            if (this.u9 != null && com.aspose.slides.ms.System.d1.a6(var1.u9(), this.u9.u9())) {
               this.u9 = null;
            }

            return;
         }

         var1.n5().n5(this);
         this.n5((Object)this.t2());
      } while (this.t2().n5());
   }

   @Override
   public final void n5(d5 var1) {
   }

   @Override
   public final void n5(b3 var1) {
      var1.n5().n5(this);
   }

   @Override
   public final void n5(z7 var1) {
      boolean var2 = true;
      String var3 = com.aspose.slides.ms.System.d1.n5;
      if (com.aspose.slides.internal.v6g.k5.l6(var1.n5(), c5.class)) {
         var2 = ((c5)var1.n5()).n5();
         var3 = ((c5)var1.n5()).l6();
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1.n5(), s0.class)) {
            throw new NotSupportedException("Only variable declaration are allowed in a for in loop");
         }

         var2 = true;
         var3 = ((s0)var1.n5()).n5();
      }

      var1.l6().n5(this);
      y1 var4 = com.aspose.slides.internal.v6g.k5.n5(this.t2(), y1.class);
      if (!com.aspose.slides.internal.v6g.k5.l6(this.t2().C_(), IEnumerable.class)) {
         if (var4 == null) {
            throw new InvalidOperationException("The property can't be enumerated");
         }

         List var18 = new List(var4.k5());
         IGenericEnumerator var19 = var4.a6().iterator();

         try {
            while (var19.hasNext()) {
               String var7 = (String)var19.next();
               var18.addItem(var7);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
               var19.dispose();
            }
         }

         var18.sort();

         for (int var20 = 0; var20 < var18.size(); var20++) {
            String var8 = (String)var18.get_Item(var20);
            this.s7().n5(var3, this.u3().c4().u9(var8));
            var1.k5().n5(this);
            this.n5(var1.u9());
            if (this.k5()) {
               if (this.u9 != null && com.aspose.slides.ms.System.d1.a6(var1.u9(), this.u9.u9())) {
                  this.u9 = null;
               }

               return;
            }

            this.n5(var1.u9());
         }
      } else {
         IGenericEnumerator var5 = ((IGenericEnumerable)this.t2().C_()).iterator();

         try {
            while (true) {
               if (!var5.hasNext()) {
                  return;
               }

               g7 var6 = (g7)var5.next();
               this.s7().n5(var3, var6);
               var1.k5().n5(this);
               this.n5(var1.u9());
               if (this.k5()) {
                  if (this.u9 != null && com.aspose.slides.ms.System.d1.a6(var1.u9(), this.u9.u9())) {
                     this.u9 = null;
                  }
                  break;
               }

               this.n5(var1.u9());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }

   @Override
   public final void n5(j6 var1) {
      var1.l6().n5(this);
      if (!com.aspose.slides.internal.v6g.k5.l6(this.t2(), y1.class)) {
         throw new n1(this.h0.c4().u9("Invalid expression in 'with' statement"));
      }

      this.n5((y1)this.t2());

      try {
         var1.n5().n5(this);
      } finally {
         this.l6();
      }
   }

   @Override
   public final void n5(v4 var1) {
      if (var1.n5() != null) {
         var1.n5().n5(this);
      }

      if (var1.l6() != null) {
         var1.l6().n5(this);
      } else {
         this.n5(this.u3().t9().n5(true));
      }

      this.n5((Object)this.t2());

      while (this.t2().n5()) {
         var1.u3().n5(this);
         this.n5(var1.u9());
         if (this.k5()) {
            if (this.u9 != null && com.aspose.slides.ms.System.d1.a6(var1.u9(), this.u9.u9())) {
               this.u9 = null;
            }

            return;
         }

         if (var1.k5() != null) {
            var1.k5().n5(this);
         }

         if (var1.l6() != null) {
            var1.l6().n5(this);
         } else {
            this.n5(this.u3().t9().n5(true));
         }
      }
   }

   public final u6 n5(y0 var1) {
      u6 var2 = this.u3().y4().s7();
      var2.n5(var1.k5());
      var2.h0(var1.n5());
      var2.n5(this.s7());
      var2.n5(var1.l6());
      if (this.n5(1)) {
         IGenericEnumerator var3 = var2.e2().iterator();

         try {
            while (var3.hasNext()) {
               String var4 = (String)var3.next();
               if ("eval".equals(var4) || "arguments".equals(var4)) {
                  throw new n1(this.u3().c4().u9("The parameters do not respect strict mode"));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return var2;
   }

   @Override
   public final void n5(a5 var1) {
      u6 var2 = this.n5((y0)var1);
      this.s7().l6(var1.n5(), var2);
   }

   @Override
   public final void n5(v8 var1) {
      var1.n5().n5(this);
      this.n5((Object)this.t2());
      if (this.t2().n5()) {
         var1.l6().n5(this);
      } else if (var1.k5() != null) {
         var1.k5().n5(this);
      }
   }

   @Override
   public final void n5(f4 var1) {
      this.k5 = null;
      if (var1.n5() != null) {
         var1.n5().n5(this);
         this.l6(this.t2());
      }

      this.l6 = true;
   }

   @Override
   public final g7 l6(g7 var1) {
      this.k5 = var1;
      return this.k5;
   }

   @Override
   public final void n5(q2 var1) {
      this.n5(var1.n5());
      boolean var2 = false;
      if (var1.l6() != null) {
         IGenericEnumerator var3 = var1.l6().iterator();

         try {
            while (var3.hasNext()) {
               q0 var4 = (q0)var3.next();
               this.n5(var4.n5());
               if (var2) {
                  var4.l6().n5(this);
                  if (this.l6) {
                     break;
                  }
               } else {
                  new s7(7, (e5)var1.n5(), var4.n5()).n5(this);
                  if (this.t2().n5()) {
                     var4.l6().n5(this);
                     var2 = true;
                     if (this.l6) {
                        break;
                     }
                  }
               }

               if (this.u9 != null) {
                  this.u9 = null;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      if (!var2 && var1.k5() != null) {
         var1.k5().n5(this);
         if (this.u9 != null) {
            this.u9 = null;
         }
      }
   }

   @Override
   public final void n5(d6 var1) {
      this.n5(l5.n5);
      if (var1.n5() != null) {
         var1.n5().n5(this);
      }

      throw new n1(this.t2());
   }

   @Override
   public final void n5(y6 var1) {
      try {
         var1.n5().n5(this);
      } catch (RuntimeException var8) {
         RuntimeException var2 = var8;
         if (var8.getMessage() == null) {
            var2 = new RuntimeException(var8.getClass().getName(), var8);
         }

         if (var1.k5() == null) {
            throw var2;
         }

         n1 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, n1.class);
         if (var3 == null) {
            var3 = new n1(this.u3().t4().u9(var2.getMessage()));
         }

         if (var1.k5().n5() != null) {
            this.n5(new i6(new t3(var1.k5().n5()), null), var3.n5());
         }

         var1.k5().l6().n5(this);
      } finally {
         if (var1.l6() != null) {
            new j4();
            var1.l6().n5().n5(this);
         }
      }
   }

   @Override
   public final void n5(c5 var1) {
      this.n5(l5.n5);
      if (var1.k5() != null) {
         var1.k5().n5(this);
         if (var1.n5()) {
            throw new InvalidOperationException("Cant declare a global variable");
         }

         if (!this.s7().k5(var1.l6())) {
            this.s7().l6(var1.l6(), this.t2());
         } else {
            this.s7().n5(var1.l6(), this.t2());
         }
      } else if (!this.s7().k5(var1.l6())) {
         this.s7().l6(var1.l6(), l5.n5);
      }
   }

   @Override
   public final void n5(t5 var1) {
      var1.n5().n5(this);
      this.n5((Object)this.t2());

      while (this.t2().n5()) {
         var1.l6().n5(this);
         this.n5(var1.u9());
         if (this.k5()) {
            if (this.u9 != null && com.aspose.slides.ms.System.d1.a6(var1.u9(), this.u9.u9())) {
               this.u9 = null;
            }

            return;
         }

         var1.n5().n5(this);
      }
   }

   @Override
   public final void n5(r1 var1) {
      this.n5((g7)null);
      var1.n5().n5(this);
      if (this.t2() != null && com.aspose.slides.internal.v6g.k5.l6(this.t2(), u6.class)) {
         u6 var2 = (u6)this.t2();
         g7[] var3 = new g7[var1.l6().size()];

         for (int var4 = 0; var4 < var1.l6().size(); var4++) {
            ((e5)var1.l6().get_Item(var4)).n5(this);
            var3[var4] = this.t2();
         }

         this.n5(var2.n5(var3, null, this));
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(this.t2(), u6.class)) {
            throw new n1(this.u3().t4().u9("Function expected."));
         }
      }
   }

   @Override
   public final void n5(p4 var1) {
      this.n5((g7)null);
      var1.n5().n5(this);
      g7 var2 = this.t2();
      this.n5((g7)null);
      this.n5((Object)var2);
      if (var2.n5()) {
         var1.l6().n5(this);
      } else {
         var1.k5().n5(this);
      }
   }

   public static boolean k5(g7 var0) {
      return var0 == l5.n5 || var0 == y5.n5;
   }

   public final y4 n5(g7 var1, g7 var2) {
      if (com.aspose.slides.ms.System.d1.a6(var1.c8(), var2.c8())) {
         if (var1 == l5.n5) {
            return this.u3().t9().s7();
         }

         if (var1 == y5.n5) {
            return this.u3().t9().s7();
         }

         if ("number".equals(var1.c8())) {
            if (var1.l6() == Double.NaN) {
               return this.u3().t9().t2();
            } else if (var2.l6() == Double.NaN) {
               return this.u3().t9().t2();
            } else {
               return var1.l6() == var2.l6() ? this.u3().t9().s7() : this.u3().t9().t2();
            }
         } else if ("string".equals(var1.c8())) {
            return this.u3().t9().n5(com.aspose.slides.ms.System.d1.a6(var1.toString(), var2.toString()));
         } else if ("boolean".equals(var1.c8())) {
            return this.u3().t9().n5(var1.n5() == var2.n5());
         } else {
            return "object".equals(var1.c8()) ? this.u3().t9().n5(var1 == var2) : this.u3().t9().n5(var1.C_().equals(var2.C_()));
         }
      } else {
         if (var1 == y5.n5 && var2 == l5.n5) {
            return this.u3().t9().s7();
         }

         if (var1 == l5.n5 && var2 == y5.n5) {
            return this.u3().t9().s7();
         }

         if ("number".equals(var1.c8()) && "string".equals(var2.c8())) {
            return this.u3().t9().n5(var1.l6() == var2.l6());
         }

         if ("string".equals(var1.c8()) && "number".equals(var2.c8())) {
            return this.u3().t9().n5(var1.l6() == var2.l6());
         }

         if (!"boolean".equals(var1.c8()) && !"boolean".equals(var2.c8())) {
            if (!"object".equals(var2.c8()) || !"string".equals(var1.c8()) && !"number".equals(var1.c8())) {
               return !"object".equals(var1.c8()) || !"string".equals(var2.c8()) && !"number".equals(var2.c8())
                  ? this.u3().t9().t2()
                  : this.n5(var1.l6(this.u3()), var2);
            } else {
               return this.n5(var1, var2.l6(this.u3()));
            }
         } else {
            return this.u3().t9().n5(var1.l6() == var2.l6());
         }
      }
   }

   public static boolean n5(g7 var0, g7 var1, int[] var2) {
      var2[0] = 0;
      double var3 = var0.l6();
      double var5 = var1.l6();
      if (!com.aspose.slides.ms.System.d2.k5(var3) && !com.aspose.slides.ms.System.d2.k5(var5)) {
         if (var3 < var5) {
            var2[0] = -1;
         } else if (var3 == var5) {
            var2[0] = 0;
         } else {
            var2[0] = 1;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void n5(s7 var1) {
      var1.n5().n5(this);
      this.n5((Object)this.t2());
      g7 var2 = this.t2();
      if (var1.k5() == 0 && !var2.n5()) {
         this.n5(var2);
      } else if (var1.k5() == 1 && var2.n5()) {
         this.n5(var2);
      } else {
         var1.l6().n5(this);
         this.n5((Object)this.t2());
         g7 var3 = this.t2();
         int var4 = 0;
         switch (var1.k5()) {
            case 0:
               if (var2.n5()) {
                  this.n5(var3);
               } else {
                  this.n5(this.u3().t9().t2());
               }
               break;
            case 1:
               if (var2.n5()) {
                  this.n5(var2);
               } else {
                  this.n5(var3);
               }
               break;
            case 2:
               this.n5(this.u3().t9().n5(!this.n5(var2, var3).n5()));
               break;
            case 3:
               int[] var18 = new int[]{0};
               this.n5(n5(var2, var3, var18) && var18[0] <= 0 ? this.u3().t9().s7() : this.u3().t9().t2());
               var4 = var18[0];
               break;
            case 4:
               int[] var17 = new int[]{0};
               this.n5(n5(var2, var3, var17) && var17[0] >= 0 ? this.u3().t9().s7() : this.u3().t9().t2());
               var4 = var17[0];
               break;
            case 5:
               int[] var16 = new int[]{0};
               this.n5(n5(var2, var3, var16) && var16[0] < 0 ? this.u3().t9().s7() : this.u3().t9().t2());
               var4 = var16[0];
               break;
            case 6:
               int[] var15 = new int[]{0};
               this.n5(n5(var2, var3, var15) && var15[0] > 0 ? this.u3().t9().s7() : this.u3().t9().t2());
               var4 = var15[0];
               break;
            case 7:
               this.n5(this.n5(var2, var3));
               break;
            case 8:
               this.n5(this.u3().w1().n5(var2.l6() - var3.l6()));
               break;
            case 9:
               if (!"String".equals(var2.u3()) && !"String".equals(var3.u3())) {
                  this.n5(this.u3().w1().n5(var2.l6() + var3.l6()));
               } else {
                  this.n5(this.u3().c4().u9(com.aspose.slides.ms.System.d1.n5(new String[]{var2.toString(), var3.toString()})));
               }
               break;
            case 10:
               if (var3 == this.u3().w1().n5("NEGATIVE_INFINITY") || var3 == this.u3().w1().n5("POSITIVE_INFINITY")) {
                  this.n5(this.u3().w1().n5("POSITIVE_INFINITY"));
               } else if (var3.l6() == 0.0) {
                  this.n5(this.u3().w1().n5("NaN"));
               } else {
                  this.n5(this.u3().w1().n5(var2.l6() % var3.l6()));
               }
               break;
            case 11:
               double var5 = var3.l6();
               double var7 = var2.l6();
               if (var3 == this.u3().w1().n5("NEGATIVE_INFINITY") || var3 == this.u3().w1().n5("POSITIVE_INFINITY")) {
                  this.n5(this.u3().w1().n5(0.0));
               } else if (var5 == 0.0) {
                  this.n5(var7 > 0.0 ? this.u3().w1().n5("POSITIVE_INFINITY") : this.u3().w1().n5("NEGATIVE_INFINITY"));
               } else {
                  this.n5(this.u3().w1().n5(var7 / var5));
               }
               break;
            case 12:
               this.n5(this.u3().w1().n5(var2.l6() * var3.l6()));
               break;
            case 13:
               this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.q1.a6(var2.l6(), var3.l6())));
               break;
            case 14:
               if (var2 != l5.n5 && var3 != l5.n5) {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6()) & com.aspose.slides.ms.System.z3.t2(var3.l6())));
               } else {
                  this.n5(this.u3().w1().n5(0.0));
               }
               break;
            case 15:
               if (var2 == l5.n5) {
                  if (var3 == l5.n5) {
                     this.n5(this.u3().w1().n5(1.0));
                  } else {
                     this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var3.l6())));
                  }
               } else if (var3 == l5.n5) {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6())));
               } else {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6()) | com.aspose.slides.ms.System.z3.t2(var3.l6())));
               }
               break;
            case 16:
               if (var2 == l5.n5) {
                  if (var3 == l5.n5) {
                     this.n5(this.u3().w1().n5(1.0));
                  } else {
                     this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var3.l6())));
                  }
               } else if (var3 == l5.n5) {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6())));
               } else {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6()) ^ com.aspose.slides.ms.System.z3.t2(var3.l6())));
               }
               break;
            case 17:
               if (!com.aspose.slides.ms.System.d1.a6(var2.c8(), var3.c8())) {
                  this.n5(this.u3().t9().t2());
               } else if (com.aspose.slides.internal.v6g.k5.l6(var2, l5.class)) {
                  this.n5(this.u3().t9().s7());
               } else if (com.aspose.slides.internal.v6g.k5.l6(var2, y5.class)) {
                  this.n5(this.u3().t9().s7());
               } else if ("number".equals(var2.c8())) {
                  if (var2 == this.u3().w1().n5("NaN") || var3 == this.u3().w1().n5("NaN")) {
                     this.n5(this.u3().t9().t2());
                  } else if (var2.l6() == var3.l6()) {
                     this.n5(this.u3().t9().s7());
                  } else {
                     this.n5(this.u3().t9().t2());
                  }
               } else if ("string".equals(var2.c8())) {
                  this.n5(this.u3().t9().n5(com.aspose.slides.ms.System.d1.a6(var2.toString(), var3.toString())));
               } else if ("boolean".equals(var2.c8())) {
                  this.n5(this.u3().t9().n5(var2.n5() == var3.n5()));
               } else if (var2 == var3) {
                  this.n5(this.u3().t9().s7());
               } else {
                  this.n5(this.u3().t9().t2());
               }
               break;
            case 18:
               new s7(17, var1.n5(), var1.l6()).n5(this);
               this.n5(this.u3().t9().n5(!this.t2().n5()));
               break;
            case 19:
               if (var2 == l5.n5) {
                  this.n5(this.u3().w1().n5(0.0));
               } else if (var3 == l5.n5) {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6())));
               } else {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6()) << (com.aspose.slides.ms.System.z3.u9(var3.l6()) & 65535)));
               }
               break;
            case 20:
               if (var2 == l5.n5) {
                  this.n5(this.u3().w1().n5(0.0));
               } else if (var3 == l5.n5) {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6())));
               } else {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6()) >> (com.aspose.slides.ms.System.z3.u9(var3.l6()) & 65535)));
               }
               break;
            case 21:
               if (var2 == l5.n5) {
                  this.n5(this.u3().w1().n5(0.0));
               } else if (var3 == l5.n5) {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6())));
               } else {
                  this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.t2(var2.l6()) >> (com.aspose.slides.ms.System.z3.u9(var3.l6()) & 65535)));
               }
               break;
            case 22:
               u6 var9 = com.aspose.slides.internal.v6g.k5.n5(var3, u6.class);
               j4 var10 = com.aspose.slides.internal.v6g.k5.n5(var2, j4.class);
               if (var9 == null) {
                  throw new n1(this.u3().m3().u9(com.aspose.slides.ms.System.d1.n5(new String[]{"Right argument should be a function: ", var1.l6().toString()})));
               }

               if (var10 == null) {
                  throw new n1(this.u3().m3().u9(com.aspose.slides.ms.System.d1.n5(new String[]{"Left argument should be an object: ", var1.n5().toString()})));
               }

               this.n5(this.u3().t9().n5(var9.l6(var10)));
               break;
            case 23:
               if (com.aspose.slides.internal.v6g.k5.l6(var3, e9.class)) {
                  throw new n1(this.u3().t4().u9("Cannot apply 'in' operator to the specified member."));
               }

               this.n5(this.u3().t9().n5(((y1)var3).l6(var2)));
               break;
            default:
               throw new NotSupportedException("Unkown binary operator");
         }
      }
   }

   @Override
   public final void n5(n7 var1) {
      switch (var1.l6()) {
         case 0:
            var1.n5().n5(this);
            if (this.t2() == null) {
               this.n5(this.u3().c4().u9(l5.n5.c8()));
            } else if (com.aspose.slides.internal.v6g.k5.l6(this.t2(), y5.class)) {
               this.n5(this.u3().c4().u9("object"));
            } else if (com.aspose.slides.internal.v6g.k5.l6(this.t2(), u6.class)) {
               this.n5(this.u3().c4().u9("function"));
            } else {
               this.n5(this.u3().c4().u9(this.t2().c8()));
            }
         case 1:
         default:
            break;
         case 2:
            var1.n5().n5(this);
            this.n5((Object)this.t2());
            this.n5(this.u3().t9().n5(!this.t2().n5()));
            break;
         case 3:
            var1.n5().n5(this);
            this.n5((Object)this.t2());
            this.n5(this.u3().w1().n5(-this.t2().l6()));
            break;
         case 4:
            var1.n5().n5(this);
            this.n5((Object)this.t2());
            this.n5(this.u3().w1().n5(this.t2().l6()));
            break;
         case 5:
            var1.n5().n5(this);
            this.n5((Object)this.t2());
            k8 var10 = this.u3().w1().n5(this.t2().l6() + 1.0);
            i6 var14 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class) != null
               ? com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class)
               : new i6(var1.n5(), null);
            this.n5(var14, var10);
            break;
         case 6:
            var1.n5().n5(this);
            this.n5((Object)this.t2());
            k8 var9 = this.u3().w1().n5(this.t2().l6() - 1.0);
            i6 var13 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class) != null
               ? com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class)
               : new i6(var1.n5(), null);
            this.n5(var13, var9);
            break;
         case 7:
            var1.n5().n5(this);
            this.n5((Object)this.t2());
            g7 var8 = this.t2();
            i6 var12 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class) != null
               ? com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class)
               : new i6(var1.n5(), null);
            this.n5(var12, this.u3().w1().n5(var8.l6() + 1.0));
            this.n5(var8);
            break;
         case 8:
            var1.n5().n5(this);
            this.n5((Object)this.t2());
            g7 var7 = this.t2();
            i6 var11 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class) != null
               ? com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class)
               : new i6(var1.n5(), null);
            this.n5(var11, this.u3().w1().n5(var7.l6() - 1.0));
            this.n5(var7);
            break;
         case 9:
            i6 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class);
            if (var3 == null) {
               throw new NotImplementedException("delete");
            }

            var3.l6().n5(this);
            this.n5((Object)this.t2());
            g7 var2 = this.t2();
            String var4 = null;
            if (com.aspose.slides.internal.v6g.k5.l6(var3.n5(), t3.class)) {
               var4 = ((t3)var3.n5()).n5();
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var3.n5(), v3.class)) {
               ((v3)var3.n5()).n5().n5(this);
               var4 = this.t2().toString();
            }

            if (com.aspose.slides.ms.System.d1.n5(var4)) {
               throw new n1(this.u3().m3().s7());
            }

            try {
               ((y1)var2).l6(var4);
            } catch (j3 var6) {
               throw new n1(this.u3().m3().s7());
            }

            ((y1)var2).l6(var4);
            this.n5(var2);
            break;
         case 10:
            var1.n5().n5(this);
            this.n5(l5.n5);
            break;
         case 11:
            var1.n5().n5(this);
            this.n5((Object)this.t2());
            this.n5(this.u3().w1().n5(0.0 - this.t2().l6() - 1.0));
      }
   }

   @Override
   public final void n5(d9 var1) {
      switch (var1.l6()) {
         case 3:
            this.n5(this.u3().t9().n5(((Boolean)com.aspose.slides.internal.v6g.k5.u3(var1.n5(), boolean.class)).booleanValue()));
            break;
         case 9:
         case 13:
         case 14:
            this.n5(this.u3().w1().n5(com.aspose.slides.ms.System.z3.n3(var1.n5())));
            break;
         case 18:
            this.n5(this.u3().c4().u9((String)var1.n5()));
            break;
         default:
            this.n5(com.aspose.slides.internal.v6g.k5.n5(var1.n5(), g7.class));
      }
   }

   @Override
   public final void n5(h2 var1) {
      this.n5(this.n5((y0)var1));
   }

   @Override
   public final void n5(i6 var1) {
      if (var1.l6() != null) {
         var1.l6().n5(this);
      }

      var1.n5().n5(this);
   }

   public final void n5(Object var1) {
      if (var1 == null) {
         throw new n1(this.u3().m1().u9(com.aspose.slides.ms.System.d1.n5(new String[]{this.x8, " is not defined"})));
      }
   }

   @Override
   public final void n5(v3 var1) {
      this.n5((Object)this.t2());
      j4 var2 = (j4)this.t2();
      var1.n5().n5(this);
      if ("String".equals(var2.u3())) {
         this.n5(this.u3().c4().u9(com.aspose.slides.ms.System.t9.q0(var2.toString().charAt(com.aspose.slides.ms.System.z3.h0(this.t2().l6())))), var2);
      } else if (var2.a0() != null) {
         this.n5(var2.a0().n5(var2, this.t2()), var2);
      } else {
         this.n5(var2.n5(this.t2()), var2);
      }
   }

   @Override
   public final void n5(a7 var1) {
      y1 var2 = this.c8();
      g7 var3 = this.t2();
      if ((var3 == l5.n5 || this.t2() == null) && com.aspose.slides.ms.System.d1.n5(this.x8)) {
         throw new n1(this.u3().m3().u9("Method isn't defined"));
      }

      g7[] var4 = new g7[var1.n5().size()];
      if (var1.n5().size() > 0) {
         for (int var5 = 0; var5 < var1.n5().size(); var5++) {
            ((e5)var1.n5().get_Item(var5)).n5(this);
            var4[var5] = this.t2();
         }
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var3, u6.class)) {
         throw new n1(this.u3().t4().u9("Function expected."));
      }

      u6 var10 = (u6)var3;
      String var6 = com.aspose.slides.ms.System.d1.n5(new String[]{var10.n3(), "("});
      String[] var7 = new String[var4.length];

      for (int var8 = 0; var8 < var4.length; var8++) {
         if (var4[var8] != null) {
            var7[var8] = var4[var8].d5();
         } else {
            var7[var8] = "null";
         }
      }

      var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(", ",(String[])( var7)));
      var6 = com.aspose.slides.ms.System.d1.n5(var6, ")");
      this.n5().push(var6);
      this.k5 = l5.n5;
      g7[] var13 = new g7[var4.length];
      com.aspose.slides.ms.System.u3.n5((Object)(var4)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var13)), 0);
      this.n5(var10, var2, var4);

      for (int var9 = 0; var9 < var13.length; var9++) {
         if (var13[var9] != var4[var9]) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.n5().get_Item(var9), i6.class)
               && com.aspose.slides.internal.v6g.k5.l6(((i6)var1.n5().get_Item(var9)).n5(), p3.class)) {
               this.n5((i6)var1.n5().get_Item(var9), var4[var9]);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.n5().get_Item(var9), s0.class)) {
               this.n5(new i6((e5)var1.n5().get_Item(var9), null), var4[var9]);
            }
         }
      }

      this.n5().pop();
      this.n5(this.k5);
      this.k5 = l5.n5;
   }

   @Override
   public final void n5(u6 var1, y1 var2, g7[] var3) {
      if (var1 != null) {
         if (this.u3++ > 100) {
            throw new n1(this.u3().t4().u9("Too many recursions in the script."));
         }

         l6 var4 = new l6(this.u3(), var1, var3);
         y9 var5 = new y9(var1.t9() != null ? var1.t9() : this.a6());

         for (int var6 = 0; var6 < var1.e2().size(); var6++) {
            if (var6 < var3.length) {
               var5.n5(new d1(var5, var1.e2().get_Item(var6), var4.a6(com.aspose.slides.ms.System.a3.l6(var6)), var4));
            } else {
               var5.n5(new u2(var5, var1.e2().get_Item(var6), l5.n5));
            }
         }

         if (this.n5(1)) {
            var5.l6("arguments", var4);
         } else {
            var4.l6("arguments", var4);
         }

         if (var2 != null) {
            var5.l6("this", var2);
         } else {
            var5.l6("this", var2 = com.aspose.slides.internal.v6g.k5.n5(this.u3(), j4.class));
         }

         this.n5(var5);

         try {
            this.n5(var1.n5(this, var2, var3));
            if (this.l6) {
               this.l6 = false;
            }
         } finally {
            this.l6();
            this.u3--;
         }
      }
   }

   private boolean n5(int var1) {
      return this.u3().k5(var1);
   }

   @Override
   public final void n5(t3 var1) {
      y1 var2 = com.aspose.slides.internal.v6g.k5.n5(this.t2(), y1.class);
      this.n5((g7)null);
      String var3 = this.x8 = var1.n5();
      g7 var4 = null;
      g7[] var5 = new g7[]{var4};
      boolean var6 = var2 != null && var2.n5(var3, var5);
      var4 = var5[0];
      if (var6) {
         this.n5(var4, var2);
      } else {
         if (this.t2() == null && this.s7.l6() > 0) {
            this.s7.n5('.').n5(var3);
         }

         this.n5(l5.n5, var2);
      }
   }

   @Override
   public final void n5(w8 var1) {
      y1 var2 = com.aspose.slides.internal.v6g.k5.n5(this.t2(), y1.class);
      switch (var1.k5()) {
         case 0:
            var1.l6().n5(this);
            var2.n5(new u2(var2, var1.n5(), this.t2()));
            break;
         case 1:
         case 2:
            u6 var3 = null;
            u6 var4 = null;
            if (var1.u3() != null) {
               var1.u3().n5(this);
               var3 = (u6)this.t2();
            }

            if (var1.a6() != null) {
               var1.a6().n5(this);
               var4 = (u6)this.t2();
            }

            c2 var5 = new c2(this.u3(), var2, var1.n5());
            var5.n5(var3);
            var5.l6(var4);
            var5.n5(true);
            var2.n5(var5);
      }
   }

   @Override
   public final void n5(s0 var1) {
      this.n5((g7)null);
      String var2 = this.x8 = var1.n5();
      y2 var3 = null;
      y2[] var4 = new y2[]{var3};
      boolean var5 = this.s7().n5(var2, var4);
      var3 = var4[0];
      if (var5) {
         if (!var3.h0()) {
            this.n5(var3.n5(this.s7()));
         } else {
            d1 var6 = com.aspose.slides.internal.v6g.k5.n5(var3, d1.class);
            this.n5(var6.n5(this.s7()), var6.x8());
         }

         if (this.t2() != null) {
            return;
         }
      }

      if ("null".equals(var2)) {
         this.n5(y5.n5);
      }

      if ("undefined".equals(var2)) {
         this.n5(l5.n5);
      }

      if (this.t2() == null) {
         this.s7.n5(var2);
      }
   }

   @Override
   public final void n5(p6 var1) {
      j4 var2 = this.u3().n3().s7();
      Dictionary$Enumerator var3 = var1.n5().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            this.n5(var2);
            ((e5)var4.getValue()).n5(this);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.n5(var2);
   }

   @Override
   public final void n5(u9 var1) {
      u3 var2 = this.u3().e2().h0();
      g7[] var3 = new g7[var1.n5().size()];

      for (int var4 = 0; var4 < var1.n5().size(); var4++) {
         var1.n5().get_Item(var4).n5(this);
         var2.n5(com.aspose.slides.ms.System.a3.l6(var4), this.t2());
      }

      this.n5(var2);
   }

   @Override
   public final void n5(h5 var1) {
      this.n5(
         this.u3()
            .r4()
            .n5(
               var1.n5(),
               com.aspose.slides.ms.System.d1.c8(var1.l6(), "g") != -1,
               com.aspose.slides.ms.System.d1.c8(var1.l6(), "i") != -1,
               com.aspose.slides.ms.System.d1.c8(var1.l6(), "m") != -1
            )
      );
   }

   public i1(int var1) {
      this.h0 = new v0(this, var1);
      this.c8 = new y9(com.aspose.slides.internal.v6g.k5.n5(this.u3(), j4.class));
      this.n5(this.a6());
      this.n5(new com.aspose.slides.Collections.Generic.Stack<>());
   }
}
