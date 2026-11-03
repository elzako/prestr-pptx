package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;

public class l6 extends h0 {
   private int c8 = 0;
   protected int n5;
   protected int l6;
   protected int k5 = -1;
   protected Dictionary<Integer, Object> u3;
   private l6 t2 = null;
   private com.aspose.slides.internal.p3.z3 s7 = null;
   public boolean a6 = false;

   public final void n5(com.aspose.slides.internal.p3.z3 var1) {
      this.s7 = var1;
   }

   public final int n5() {
      return this.c8;
   }

   @Override
   public Object n5(h0 var1) {
      l6 var2 = (l6)super.n5(var1);
      if (this.u3 != null) {
         var2.u3 = new Dictionary<>(this.u3);
      }

      return var2;
   }

   public final void n5(int var1) {
      this.c8 = var1;
   }

   public final void l6(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.n5;
   }

   public final void k5(int var1) {
      this.l6 = var1;
   }

   public int e_() {
      return this.l6;
   }

   public final int f_() {
      return this.t2() + this.n3() + this.l6() + this.y4() + this.s7();
   }

   public final int a6() {
      return this.e2() + this.c8() + this.e_() + this.x8() + this.t9();
   }

   public final void u3(int var1) {
      this.k5 = var1;
   }

   public final void u9() {
      this.u3(-1);
   }

   public final int h0() {
      return this.k5;
   }

   public final int c8() {
      int var1 = 0;
      com.aspose.slides.internal.v8.n5 var2 = (com.aspose.slides.internal.v8.n5)this.a6(17);
      if (var2 != null) {
         var1 = var2.k5;
      }

      Object var3 = this.a6(21);
      if (var3 != null) {
         var1 += com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
      }

      return var1;
   }

   public final int t2() {
      return this.u9(27) ? com.aspose.slides.internal.v6g.k5.u3(this.a6(27), int.class) : 0;
   }

   public final int s7() {
      return this.u9(28) ? com.aspose.slides.internal.v6g.k5.u3(this.a6(28), int.class) : 0;
   }

   public final int x8() {
      int var1 = 0;
      com.aspose.slides.internal.v8.n5 var2 = (com.aspose.slides.internal.v8.n5)this.a6(18);
      if (var2 != null) {
         var1 = var2.k5;
      }

      Object var3 = this.a6(22);
      if (var3 != null) {
         var1 += com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
      }

      return var1;
   }

   public final int n3() {
      int var1 = 0;
      com.aspose.slides.internal.v8.n5 var2 = (com.aspose.slides.internal.v8.n5)this.a6(15);
      if (var2 != null) {
         var1 = var2.k5;
      }

      Object var3 = this.a6(19);
      if (var3 != null) {
         var1 += com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
      }

      return var1;
   }

   public final int y4() {
      int var1 = 0;
      com.aspose.slides.internal.v8.n5 var2 = (com.aspose.slides.internal.v8.n5)this.a6(16);
      if (var2 != null) {
         var1 = var2.k5;
      }

      Object var3 = this.a6(20);
      if (var3 != null) {
         var1 += com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
      }

      return var1;
   }

   public final int e2() {
      int var1 = 0;
      Object var2 = this.a6(29);
      if (var2 != null) {
         var1 = com.aspose.slides.internal.v6g.k5.u3(var2, int.class);
      }

      return var1;
   }

   public final int t9() {
      int var1 = 0;
      Object var2 = this.a6(30);
      if (var2 != null) {
         var1 = com.aspose.slides.internal.v6g.k5.u3(var2, int.class);
      }

      return var1;
   }

   public final int z1() {
      int var1 = 0;
      com.aspose.slides.internal.v8.x8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.a6(45), com.aspose.slides.internal.v8.x8.class);
      if (var2 != null) {
         var1 = var2.l6();
      }

      return var1;
   }

   public void n5(l6 var1) {
   }

   public void l6(l6 var1) {
      this.t2 = var1;
   }

   public final l6 t4() {
      return this.t2;
   }

   public final void n5(int var1, Object var2) {
      if (this.u3 == null) {
         this.u3 = new Dictionary<>();
      }

      this.u3.set_Item(var1, var2);
   }

   public final void n5(Dictionary<Integer, Object> var1) {
      if (var1 != null) {
         this.u3 = new Dictionary<>(var1);
      } else {
         this.u3 = null;
      }
   }

   public final Dictionary<Integer, Object> q0() {
      return this.u3;
   }

   public final Object a6(int var1) {
      return this.u3 != null && this.u3.containsKey(var1) ? this.u3.get_Item(var1) : null;
   }

   public final boolean u9(int var1) {
      return this.a6(var1) != null;
   }

   public final boolean h0(int var1) {
      Object var2 = this.a6(var1);
      return com.aspose.slides.internal.v6g.k5.l6(var2, Boolean.class) && com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class);
   }

   public final int c8(int var1) {
      Object var2 = this.a6(var1);
      if (var2 == null) {
         return 0;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, Integer.class)) {
         return com.aspose.slides.internal.v6g.k5.u3(var2, int.class);
      } else {
         throw new ArgumentException(d1.n5(new String[]{"Trait ", j8.n5(var1).s7(), " could not be converted to an int"}));
      }
   }

   public void n5(com.aspose.slides.internal.v8.u3 var1) {
   }

   public p8 n5(boolean var1) {
      return new p8(this.f_(), this.a6());
   }

   protected final p8 n5(List<l6> var1, boolean var2) {
      p8 var3 = p8.n5.u3();
      if (var1 != null) {
         List$Enumerator var4 = var1.iterator();

         try {
            while (var4.hasNext()) {
               l6 var5 = (l6)var4.next();
               p8 var6 = var5.n5(var2).u3();
               var3.n5(q1.n5(var6.l6(), var3.l6()));
               var3.l6(q1.n5(var6.k5(), var3.k5()));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      if (!var2) {
         return var3;
      }

      if (var3.l6() == (Integer)com.aspose.slides.internal.v6g.k5.k5(int.class)) {
         var3.n5(this.l6());
      }

      if (var3.k5() == (Integer)com.aspose.slides.internal.v6g.k5.k5(int.class)) {
         var3.l6(this.e_());
      }

      return var3;
   }

   @Override
   public String toString() {
      a5 var1 = new a5(super.toString());
      var1.n5(" {ipd=").k5(this.l6());
      var1.n5(", bpd=").k5(this.e_());
      var1.n5("}");
      return var1.toString();
   }
}
