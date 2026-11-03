package com.aspose.slides.internal.p4l;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.AmbiguousMatchException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.g7;
import com.aspose.slides.ms.System.y8;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class y2 {
   private Class n5;
   private y2$l6 l6 = new y2$l6(this, null);
   private y2$k5<m3> k5;
   private y2$k5<w1> u3;
   private y2$k5<j5> a6;
   private y2$k5<r4> u9;
   private y2$k5<c4> h0;
   private y2$k5<c4> c8;

   public y2(Class var1) {
      this.n5 = var1;
      this.l6.n5();
   }

   public List<j5> n5(int var1, String var2) {
      if (this.a6 == null) {
         this.a6 = new y2$k5<>(this, null);
      }

      List var3 = this.a6.n5(var2);
      if (var3 == null) {
         boolean var4 = d1.n5(var2);
         y2$n5 var5 = new y2$n5(var4 ? null : var2, var1);
         var3 = this.n5(var5);
         this.a6.n5(var2, var3);
      }

      return var3;
   }

   public List<m3> l6(int var1, String var2) {
      if (this.k5 == null) {
         this.k5 = new y2$k5<>(this, null);
      }

      List var3 = this.k5.n5(var2);
      if (var3 == null) {
         boolean var4 = d1.n5(var2);
         y2$n5 var5 = new y2$n5(var4 ? null : var2, var1);
         var3 = this.l6(var5);
         this.k5.n5(var2, var3);
      }

      return var3;
   }

   public List<w1> k5(int var1, String var2) {
      if (this.u3 == null) {
         this.u3 = new y2$k5<>(this, null);
      }

      List var3 = this.u3.n5(var2);
      if (var3 == null) {
         boolean var4 = d1.n5(var2);
         y2$n5 var5 = new y2$n5(var4 ? null : var2, var1);
         var3 = this.k5(var5);
         this.u3.n5(var2, var3);
      }

      return var3;
   }

   public List<r4> u3(int var1, String var2) {
      if (this.u9 == null) {
         this.u9 = new y2$k5<>(this, null);
      }

      List var3 = this.u9.n5(var2);
      if (var3 == null) {
         List var4 = this.u9.n5(null);
         if (var4 == null) {
            var4 = this.n5(var1);
            this.u9.n5(null, var4);
         }

         boolean var5 = d1.n5(var2);
         y2$n5 var6 = new y2$n5(var5 ? null : var2, var1);
         var3 = this.n5(var6, var4);
         this.u9.n5(var2, var3);
      }

      return var3;
   }

   public List<z8> a6(int var1, String var2) {
      return new List<>();
   }

   private List<r4> n5(int var1) {
      List var2 = this.k5(var1, null);
      List var3 = this.n5(var2, new y1(this));
      List var4 = this.n5(var2, new a0(this));
      var3 = this.n5(var3);
      var4 = this.n5(var4);
      return this.n5(var3, var4);
   }

   private List<w1> n5(List<w1> var1) {
      List var2 = new List();

      for (w1 var4 : var1) {
         for (w1 var6 : var1) {
            if (this.n5(var4, var6)) {
               w1 var7 = var4.t2().n5(var6.t2()) ? var4 : var6;
               this.n5(var2, var7);
            } else {
               this.n5(var2, var6);
            }
         }
      }

      return var2;
   }

   private void n5(List<w1> var1, w1 var2) {
      if (!var1.containsItem(var2)) {
         w1 var3 = null;

         for (w1 var5 : var1) {
            if (this.n5(var5, var2)) {
               var3 = var5;
               break;
            }
         }

         if (var3 != null) {
            if (var2.t2().n5(var3.t2())) {
               var1.removeItem(var3);
               var1.addItem(var2);
            }
         } else {
            var1.addItem(var2);
         }
      }
   }

   private boolean n5(w1 var1, w1 var2) {
      return d1.a6(var1.s7(), var2.s7()) && com.aspose.slides.internal.t9p.n5.n5(var1.n5, var2.n5.getParameterTypes()) && var1 != var2;
   }

   public List<c4> u9(int var1, String var2) {
      if (this.c8 == null) {
         this.c8 = new y2$k5<>(this, null);
      }

      List var3 = this.c8.n5(var2);
      if (var3 == null) {
         boolean var4 = d1.n5(var2);
         y2$n5 var5 = new y2$n5(var4 ? null : var2, var1);
         var3 = new List();
         this.n5(var5, this.n5, var3);
         this.c8.n5(var2, var3);
      }

      return var3;
   }

   public List<c4> h0(int var1, String var2) {
      if (this.h0 == null) {
         this.h0 = new y2$k5<>(this, null);
      }

      List var3 = this.h0.n5(var2);
      if (var3 == null) {
         boolean var4 = d1.n5(var2);
         y2$n5 var5 = new y2$n5(var4 ? null : var2, var1);
         var3 = new List();
         this.l6(var5, this.n5, var3);
         this.h0.n5(var2, var3);
      }

      return var3;
   }

   private List<j5> n5(y2$n5 var1) {
      List var2 = new List();
      Field[] var3 = this.l6.l6();

      for (Field var7 : var3) {
         if (var1.n5(var7.getName())) {
            int var8 = var7.getModifiers();
            boolean var9 = Modifier.isPublic(var8);
            boolean var10 = Modifier.isStatic(var8);
            boolean var11 = !var7.getDeclaringClass().equals(this.n5);
            int var12 = c4.n5(var9, var11, var10);
            j5 var13 = new j5(var7, var12);
            var2.addItem(var13);
         }
      }

      return var2;
   }

   private List<m3> l6(y2$n5 var1) {
      List var2 = new List();
      Constructor[] var3 = this.l6.k5();

      for (Constructor var7 : var3) {
         if (var1.n5(var7.getName())) {
            int var8 = var7.getModifiers();
            boolean var9 = Modifier.isPublic(var8);
            boolean var10 = Modifier.isStatic(var8);
            boolean var11 = false;
            int var12 = c4.n5(var9, var11, var10);
            m3 var13 = new m3(var7, var12);
            var2.addItem(var13);
         }
      }

      return var2;
   }

   private List<w1> k5(y2$n5 var1) {
      List var2 = new List();
      Method[] var3 = this.l6.u3();

      for (Method var7 : var3) {
         if (var1.n5(var7.getName())) {
            int var8 = var7.getModifiers();
            boolean var9 = Modifier.isPublic(var8);
            boolean var10 = Modifier.isStatic(var8);
            boolean var11 = false;
            int var12 = c4.n5(var9, var11, var10);
            w1 var13 = new w1(var7, var12);
            var2.addItem(var13);
         }
      }

      return var2;
   }

   private List<r4> n5(List<w1> var1, List<w1> var2) {
      List var3 = new List();

      for (w1 var5 : var1) {
         List var6 = this.n5(var5, var2);
         if (var6.size() > 1) {
            throw new AmbiguousMatchException();
         }

         w1 var7 = var6.size() == 1 ? (w1)var6.get_Item(0) : null;
         if (var7 != null) {
            var2.removeItem(var7);
         }

         int var8 = var5.j5();
         var3.addItem(new r4(var5, var7, var8));
      }

      for (w1 var10 : var2) {
         int var11 = var10.j5();
         var3.addItem(new r4(null, var10, var11));
      }

      return this.l6(var3);
   }

   private List<r4> l6(List<r4> var1) {
      List var2 = new List();

      for (r4 var4 : var1) {
         if (!var2.containsItem(var4)) {
            this.n5(var2, var4);
         }
      }

      return var2;
   }

   private void n5(List<r4> var1, r4 var2) {
      if (!var1.containsItem(var2)) {
         r4 var3 = null;

         for (r4 var5 : var1) {
            if (var5.s7().equals(var2.s7())) {
               var3 = var5;
               break;
            }
         }

         if (var3 != null) {
            y8 var6;
            if (var3.n5() != null) {
               var6 = var3.n5().t2();
            } else {
               var6 = var3.u3().t2();
            }

            y8 var7;
            if (var2.n5() != null) {
               var7 = var2.n5().t2();
            } else {
               var7 = var2.u3().t2();
            }

            if (var7.n5(var6)) {
               var1.removeItem(var3);
               var1.addItem(var2);
            }
         } else {
            var1.addItem(var2);
         }
      }
   }

   private List<w1> n5(w1 var1, List<w1> var2) {
      List var3 = new List();

      for (w1 var5 : var2) {
         if (this.l6(var1, var5)) {
            var3.addItem(var5);
         }
      }

      return var3;
   }

   private boolean l6(w1 var1, w1 var2) {
      String var3 = var1.s7();
      String var4 = var2.s7();
      var3 = d1.k5(var3, 4);
      var4 = d1.k5(var4, 4);
      if (!d1.a6(var3, var4)) {
         return false;
      }

      if (var1.t2() != var2.t2()) {
         return false;
      }

      z3 var5 = var1.z8();
      z3 var6 = var2.z8();
      if (com.aspose.slides.internal.v6g.k5.n5(void.class).k5(var5.n5())) {
         throw new NotSupportedException("bad getter signature");
      }

      if (!com.aspose.slides.internal.v6g.k5.n5(void.class).k5(var6.n5())) {
         throw new NotSupportedException("bad setter signature");
      }

      z3[] var7 = var1.a6();
      List var8 = new List();

      for (z3 var12 : var7) {
         var8.addItem(var12.n5());
      }

      var8.addItem(var5.n5());
      return com.aspose.slides.internal.t9p.n5.n5(var2, (y8[])var8.toArray(new y8[0]));
   }

   private List<r4> n5(y2$n5 var1, List<r4> var2) {
      List var3 = new List();

      for (r4 var5 : var2) {
         if (var1.n5(var5.s7())) {
            var3.addItem(var5);
         }
      }

      return var3;
   }

   private void n5(y2$n5 var1, Class var2, List<c4> var3) {
      Class[] var4 = var2.getDeclaredClasses();

      for (Class var8 : var4) {
         if (var1.n5(var8.getSimpleName())) {
            c4 var9 = new c4(var8);
            if (!var3.containsItem(var9)) {
               var3.addItem(var9);
            }
         }
      }
   }

   private void l6(y2$n5 var1, Class var2, List<c4> var3) {
      if (var2.getSuperclass() != null) {
         this.l6(var1, var2.getSuperclass(), var3);
      }

      if (var2.isInterface() && var1.n5(var2.getSimpleName())) {
         c4 var4 = new c4(var2);
         if (!var3.containsItem(var4)) {
            var3.addItem(var4);
         }
      }

      Class[] var9 = var2.getInterfaces();

      for (Class var8 : var9) {
         this.l6(var1, var8, var3);
      }
   }

   private List<w1> n5(List<w1> var1, g7<w1> var2) {
      List var3 = new List();

      for (w1 var5 : var1) {
         if (var2.invoke(var5)) {
            var3.addItem(var5);
         }
      }

      return var3;
   }

   // $VF: synthetic method
   static Class n5(y2 var0) {
      return var0.n5;
   }
}
