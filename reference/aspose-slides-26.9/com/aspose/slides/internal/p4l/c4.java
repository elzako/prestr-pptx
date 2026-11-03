package com.aspose.slides.internal.p4l;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.AmbiguousMatchException;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e9;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.y8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;

@j3
class c4 extends y8 {
   private final Class a6;
   private final Class u9;
   private final y8 h0;
   private final y8 c8;
   private final int t2;
   @e9
   private y2 s7;

   @Override
   public y8 n5() {
      return this.u9.getSuperclass() != null ? com.aspose.slides.internal.v6g.k5.n5(this.u9.getSuperclass()) : null;
   }

   @Override
   protected boolean u3() {
      return this.u9.isArray() || com.aspose.slides.ms.System.u3.class.isAssignableFrom(this.u9);
   }

   @Override
   public boolean a6() {
      return this.u9.getTypeParameters().length > 0;
   }

   @Override
   public y8[] u9() {
      return super.u9();
   }

   @Override
   public y8 h0() {
      return this.u9.isArray() ? com.aspose.slides.internal.v6g.k5.n5(this.u9.getComponentType()) : null;
   }

   @Override
   public int c8() {
      if (!this.u9.isArray()) {
         throw new ArgumentException();
      }

      int var1 = 0;

      for (Class var2 = this.u9; var2.isArray(); var2 = var2.getComponentType()) {
         var1++;
      }

      return var1;
   }

   @Override
   protected int n3() {
      return this.t2;
   }

   @Override
   public Object[] l6(y8 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("attributeType");
      } else {
         c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), c4.class);
         if (var3 == null) {
            throw new ArgumentException("Argument must be a Type", "attributeType");
         } else {
            return com.aspose.slides.internal.p4l.u3.n5(this, var3, var2);
         }
      }
   }

   @Override
   public Annotation[] x8() {
      return this.u9.getAnnotations();
   }

   @Override
   protected boolean y4() {
      return com.aspose.slides.internal.t9p.n5.l6(this.u9) != null;
   }

   @Override
   public boolean n5(y8 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("attributeType");
      } else {
         c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), c4.class);
         if (var3 == null) {
            throw new ArgumentException("Type must be a type provided by the runtime.", "attributeType");
         } else {
            return com.aspose.slides.internal.p4l.u3.l6(this, var3, var2);
         }
      }
   }

   @Override
   protected boolean e2() {
      return !super.s3() && !super.i1() ? super.f2() : true;
   }

   @Override
   public e2[] n5(String var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      q0[] var4 = new q0[0];
      k5[] var5 = new k5[0];
      k7[] var6 = new k7[0];
      n3[] var7 = new n3[0];
      y4[] var8 = new y4[0];
      y8[] var9 = new y8[0];
      if ((var2 & 8) != 0) {
         var4 = this.l6(var1, var3, 3, null, true);
      }

      if ((var2 & 1) != 0) {
         var5 = this.n5(var1, var3, 3, null, true);
      }

      if ((var2 & 16) != 0) {
         var6 = this.n5(var1, var3, null, true);
      }

      if ((var2 & 2) != 0) {
         var7 = this.l6(var1, var3, true);
      }

      if ((var2 & 4) != 0) {
         var8 = this.n5(var1, var3, true);
      }

      if ((var2 & 160) != 0) {
         var9 = this.k5(var1, var3, true);
      }

      switch (var2) {
         case 1:
            return var5;
         case 2:
            return var7;
         case 4:
            return var8;
         case 8:
            return var4;
         case 9:
            t4[] var12 = new t4[var4.length + var5.length];
            System.arraycopy(var4, 0, var12, 0, var4.length);
            System.arraycopy(var5, 0, var12, var4.length, var5.length);
            return var12;
         case 16:
            return var6;
         case 32:
            return var9;
         case 128:
            return var9;
         default:
            e2[] var10 = new e2[var4.length + var5.length + var6.length + var7.length + var8.length + var9.length];
            int var11 = 0;
            if (var4.length > 0) {
               System.arraycopy(var4, 0, var10, var11, var4.length);
            }

            var11 += var4.length;
            if (var5.length > 0) {
               System.arraycopy(var5, 0, var10, var11, var5.length);
            }

            var11 += var5.length;
            if (var6.length > 0) {
               System.arraycopy(var6, 0, var10, var11, var6.length);
            }

            var11 += var6.length;
            if (var7.length > 0) {
               System.arraycopy(var7, 0, var10, var11, var7.length);
            }

            var11 += var7.length;
            if (var8.length > 0) {
               System.arraycopy(var8, 0, var10, var11, var8.length);
            }

            var11 += var8.length;
            if (var9.length > 0) {
               System.arraycopy(var9, 0, var10, var11, var9.length);
            }

            var11 += var9.length;
            return var10;
      }
   }

   static int n5(boolean var0, boolean var1, boolean var2) {
      int var3 = var0 ? 16 : 32;
      if (var1) {
         var3 |= 2;
         return var2 ? var3 | 72 : var3 | 4;
      } else {
         return var2 ? var3 | 8 : var3 | 4;
      }
   }

   @Override
   protected k5 n5(int var1, l6 var2, int var3, y8[] var4, m1[] var5) {
      k5[] var6 = this.n5(null, var1, 3, var4, false);
      if (var2 == null) {
         var2 = y8.v4();
      }

      if (var6.length == 0) {
         return null;
      }

      if (var4.length == 0 && var6.length == 1) {
         z3[] var7 = var6[0].u3();
         if (var7 == null || var7.length == 0) {
            return var6[0];
         }
      }

      return (var1 & 65536) != 0
         ? com.aspose.slides.internal.v6g.k5.n5(x8.n5(var6, var4, var5), k5.class)
         : com.aspose.slides.internal.v6g.k5.n5(var2.n5(var1, var6, var4, var5), k5.class);
   }

   @Override
   protected q0 n5(String var1, int var2, l6 var3, int var4, y8[] var5, m1[] var6) {
      q0[] var7 = this.l6(var1, var2, var4, var5, false);
      if (var7.length == 0) {
         return null;
      }

      if (var5 == null || var5.length == 0) {
         if (var7.length == 1) {
            return var7[0];
         }

         if (var5 == null) {
            for (int var8 = 1; var8 < var7.length; var8++) {
               q0 var9 = var7[var8];
               if (!x8.n5(var9, var7[0])) {
                  throw new AmbiguousMatchException("Ambiguous match found.");
               }
            }

            return com.aspose.slides.internal.v6g.k5.n5(x8.n5(var7, var7.length), q0.class);
         }
      }

      if (var3 == null) {
         var3 = y8.v4();
      }

      return com.aspose.slides.internal.v6g.k5.n5(var3.n5(var2, var7, var5, var6), q0.class);
   }

   @Override
   public q0[] n5(int var1) {
      return this.l6(null, var1, 3, null, false);
   }

   @Override
   public y4 n5(String var1, int var2) {
      boolean var3 = false;
      int var4 = 0;
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      String[] var5 = new String[]{var1};
      boolean[] var6 = new boolean[]{false};
      int[] var7 = new int[]{0};
      n5(var2, var5, var6, var7);
      var1 = var5[0];
      var3 = var6[0];
      var4 = var7[0];
      List var8 = this.u6().n5(var4, var1);
      j5 var9 = null;
      var2 ^= 2;
      boolean var10 = false;

      for (int var11 = 0; var11 < var8.size(); var11++) {
         j5 var12 = (j5)var8.get_Item(var11);
         if ((var2 & var12.n3()) == var12.n3()) {
            if (var9 != null) {
               if (var12.t2() == var9.t2()) {
                  throw new AmbiguousMatchException("Ambiguous match found.");
               }

               if (var9.t2().y2() && var12.t2().y2()) {
                  var10 = true;
               }
            }

            if (var9 == null || var12.t2().n5(var9.t2()) || var9.t2().y2()) {
               var9 = var12;
            }
         }
      }

      if (var10 && var9.t2().y2()) {
         throw new AmbiguousMatchException("Ambiguous match found.");
      } else {
         return var9;
      }
   }

   @Override
   public y4[] l6(int var1) {
      return this.n5(null, var1, false);
   }

   private static void n5(int var0, String[] var1, boolean var2, boolean[] var3, boolean[] var4, int[] var5) {
      var3[0] = false;
      var4[0] = false;
      if (var1[0] != null) {
         if ((var0 & 1) != 0) {
            var1[0] = d1.n5(var1[0], com.aspose.slides.internal.x7n.l6.k5());
            var4[0] = true;
            var5[0] = 2;
         } else {
            var5[0] = 1;
         }

         if (var2 && d1.l6(var1[0], "*", (short)4)) {
            var1[0] = d1.l6(var1[0], 0, var1[0].length() - 1);
            var3[0] = true;
            var5[0] = 0;
         }
      } else {
         var5[0] = 0;
      }
   }

   private static void n5(int var0, String[] var1, boolean[] var2, int[] var3) {
      boolean[] var4 = new boolean[]{false};
      n5(var0, var1, false, var4, var2, var3);
   }

   private static boolean n5(y8 var0, int var1, String var2, boolean var3, String var4) {
      boolean var5 = var0.w1() || var0.j5();
      boolean var6 = false;
      return !n5(var0, var1, var5, var0.r4(), var6, var2, var3) ? false : var4 == null || var0.z3().equals(var4);
   }

   private static boolean n5(e2 var0, int var1, boolean var2, boolean var3, boolean var4, String var5, boolean var6) {
      if (var2) {
         if ((var1 & 16) == 0) {
            return false;
         }
      } else if ((var1 & 32) == 0) {
         return false;
      }

      boolean var7 = var0.t2() != var0.k5();
      if ((var1 & 2) != 0 && var7) {
         return false;
      }

      if (var0.l6() != 32 && var0.l6() != 128) {
         if (var4) {
            if ((var1 & 64) == 0 && var7) {
               return false;
            }

            if ((var1 & 8) == 0) {
               return false;
            }
         } else if ((var1 & 4) == 0) {
            return false;
         }
      }

      if (var6 && !n5(var0, var5, (var1 & 1) != 0)) {
         return false;
      }

      if ((var1 & 2) == 0 && var7 && var3 && (var1 & 32) != 0 && !var4 && (var1 & 4) != 0) {
         q0 var8 = com.aspose.slides.internal.v6g.k5.n5(var0, q0.class);
         if (var8 == null) {
            return false;
         }

         if (!var8.t9() && !var8.z1()) {
            return false;
         }
      }

      return true;
   }

   private static boolean n5(t4 var0, int var1, int var2, y8[] var3) {
      if ((var2 & 3) == 0) {
         if ((var2 & 2) != 0 && (var0.n3() & 2) == 0) {
            return false;
         }

         if ((var2 & 1) != 0 && (var0.n3() & 1) == 0) {
            return false;
         }
      }

      if (var3 != null) {
         z3[] var4 = var0.u3();
         if (var3.length != var4.length) {
            if ((var1 & 13056) == 0) {
               return false;
            }

            boolean var5 = false;
            if (var3.length > var4.length) {
               if ((var0.n3() & 2) == 0) {
                  var5 = true;
               }
            } else if ((var1 & 262144) == 0) {
               var5 = true;
            } else if (!var4[var3.length].k5()) {
               var5 = true;
            }

            if (var5) {
               if (var4.length != 0) {
                  if (var3.length < var4.length - 1) {
                     return false;
                  }

                  z3 var6 = var4[var4.length - 1];
                  if (!var6.n5().s3()) {
                     return false;
                  }
               }

               return false;
            }
         } else if ((var1 & 65536) != 0 && (var1 & 256) == 0) {
            for (int var7 = 0; var7 < var4.length; var7++) {
               if (var3[var7] != null && var4[var7].n5() != var3[var7]) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private static boolean n5(e2 var0, String var1, boolean var2) {
      if (var2) {
         if (!d1.n5(d1.n5(var0.s7(), com.aspose.slides.internal.x7n.l6.k5()), var1, (short)4)) {
            return false;
         }
      } else if (!d1.n5(var0.s7(), var1, (short)4)) {
         return false;
      }

      return true;
   }

   private y2 u6() {
      if (this.s7 == null) {
         this.s7 = new y2(this.u9);
      }

      return this.s7;
   }

   private k5[] n5(String var1, int var2, int var3, y8[] var4, boolean var5) {
      boolean var6 = false;
      boolean var7 = false;
      int var8 = 0;
      String[] var9 = new String[]{var1};
      boolean[] var10 = new boolean[]{false};
      boolean[] var11 = new boolean[]{false};
      int[] var12 = new int[]{0};
      n5(var2, var9, var5, var10, var11, var12);
      var1 = var9[0];
      var6 = var10[0];
      var7 = var11[0];
      var8 = var12[0];
      List var13 = new List();
      List var14 = this.u6().l6(var8, var1);
      var2 ^= 2;

      for (int var15 = 0; var15 < var14.size(); var15++) {
         m3 var16 = (m3)var14.get_Item(var15);
         if ((var2 & var16.m1()) == var16.m1() && n5(var16, var2, var3, var4) && (!var6 || n5(var16, var1, var7))) {
            var13.addItem(var16);
         }
      }

      return (k5[])var13.toArray(new k5[0]);
   }

   private q0[] l6(String var1, int var2, int var3, y8[] var4, boolean var5) {
      boolean var6 = false;
      boolean var7 = false;
      int var8 = 0;
      String[] var9 = new String[]{var1};
      boolean[] var10 = new boolean[]{false};
      boolean[] var11 = new boolean[]{false};
      int[] var12 = new int[]{0};
      n5(var2, var9, var5, var10, var11, var12);
      var1 = var9[0];
      var6 = var10[0];
      var7 = var11[0];
      var8 = var12[0];
      List var13 = new List();
      List var14 = this.u6().k5(var8, var1);
      var2 ^= 2;

      for (int var15 = 0; var15 < var14.size(); var15++) {
         w1 var16 = (w1)var14.get_Item(var15);
         if ((var2 & var16.j5()) == var16.j5() && n5(var16, var2, var3, var4) && (!var6 || n5(var16, var1, var7))) {
            var13.addItem(var16);
         }
      }

      return (q0[])var13.toArray(new q0[0]);
   }

   private y4[] n5(String var1, int var2, boolean var3) {
      boolean var4 = false;
      boolean var5 = false;
      int var6 = 0;
      String[] var7 = new String[]{var1};
      boolean[] var8 = new boolean[]{false};
      boolean[] var9 = new boolean[]{false};
      int[] var10 = new int[]{0};
      n5(var2, var7, var3, var8, var9, var10);
      var1 = var7[0];
      var4 = var8[0];
      var5 = var9[0];
      var6 = var10[0];
      List var11 = new List();
      List var12 = this.u6().n5(var6, var1);
      var2 ^= 2;

      for (int var13 = 0; var13 < var12.size(); var13++) {
         j5 var14 = (j5)var12.get_Item(var13);
         if ((var2 & var14.n3()) == var14.n3() && (!var4 || n5(var14, var1, var5))) {
            var11.addItem(var14);
         }
      }

      return (y4[])var11.toArray(new y4[0]);
   }

   private k7[] n5(String var1, int var2, y8[] var3, boolean var4) {
      boolean var5 = false;
      boolean var6 = false;
      int var7 = 0;
      String[] var8 = new String[]{var1};
      boolean[] var9 = new boolean[]{false};
      boolean[] var10 = new boolean[]{false};
      int[] var11 = new int[]{0};
      n5(var2, var8, var4, var9, var10, var11);
      var1 = var8[0];
      var5 = var9[0];
      var6 = var10[0];
      var7 = var11[0];
      List var12 = new List();
      List var13 = this.u6().u3(var7, var1);
      var2 ^= 2;

      for (int var14 = 0; var14 < var13.size(); var14++) {
         r4 var15 = (r4)var13.get_Item(var14);
         if ((var2 & var15.a6()) == var15.a6() && (!var5 || n5(var15, var1, var6)) && (var3 == null || var15.u9().length == var3.length)) {
            var12.addItem(var15);
         }
      }

      return (k7[])var12.toArray(new k7[0]);
   }

   private n3[] l6(String var1, int var2, boolean var3) {
      boolean var4 = false;
      boolean var5 = false;
      int var6 = 0;
      String[] var7 = new String[]{var1};
      boolean[] var8 = new boolean[]{false};
      boolean[] var9 = new boolean[]{false};
      int[] var10 = new int[]{0};
      n5(var2, var7, var3, var8, var9, var10);
      var1 = var7[0];
      var4 = var8[0];
      var5 = var9[0];
      var6 = var10[0];
      List var11 = new List();
      List var12 = this.u6().a6(var6, var1);
      var2 ^= 2;

      for (int var13 = 0; var13 < var12.size(); var13++) {
         z8 var14 = (z8)var12.get_Item(var13);
         if ((var2 & var14.n5()) == var14.n5() && (!var4 || n5(var14, var1, var5))) {
            var11.addItem(var14);
         }
      }

      return (n3[])var11.toArray(new n3[0]);
   }

   @Override
   public y8 n5(String var1, boolean var2) {
      String var3 = "";
      String var4 = "";
      int var5 = 0;
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      int var6 = 48;
      var6 &= -9;
      if (var2) {
         var6 |= 1;
      }

      String[] var7 = new String[]{var3};
      String[] var8 = new String[]{var4};
      n5(var1, var7, var8);
      var3 = var7[0];
      var4 = var8[0];
      int[] var9 = new int[]{0};
      boolean[] var10 = new boolean[]{var2};
      n5(var6, var7, var10, var9);
      var3 = var7[0];
      var2 = var10[0];
      var5 = var9[0];
      List var11 = this.u6().h0(var5, var3);
      c4 var12 = null;

      for (int var13 = 0; var13 < var11.size(); var13++) {
         c4 var14 = (c4)var11.get_Item(var13);
         if (n5(var14, var6, var3, false, var4)) {
            if (var12 != null) {
               throw new AmbiguousMatchException("Ambiguous match found.");
            }

            var12 = var14;
         }
      }

      return var12;
   }

   @Override
   public y8[] t9() {
      List var1 = this.u6().h0(0, null);
      y8[] var2 = new y8[var1.size()];

      for (int var3 = 0; var3 < var1.size(); var3++) {
         var2[var3] = (y8)var1.get_Item(var3);
      }

      return var2;
   }

   public c4(Class var1) {
      this.a6 = var1;
      boolean var2 = var1.isPrimitive();
      this.u9 = var2 ? com.aspose.slides.internal.t9p.n5.n5(var1) : var1;
      this.h0 = var2 ? com.aspose.slides.internal.v6g.k5.n5(this.u9) : this;
      this.t2 = this.t1();
      this.c8 = var1.getDeclaringClass() != null ? com.aspose.slides.internal.v6g.k5.n5(var1.getDeclaringClass()) : null;
   }

   private int t1() {
      short var1 = 0;
      int var2 = this.u9.getModifiers();
      if (this.u9.isInterface()) {
         var1 |= 32;
      }

      if (Modifier.isAbstract(var2) && !this.u9.isInterface()) {
         var1 |= 128;
      }

      if (Modifier.isFinal(var2)) {
         var1 |= 256;
      }

      if (this.u9.getDeclaringClass() != null) {
         if (Modifier.isPublic(var2)) {
            var1 |= 2;
         } else if (Modifier.isPrivate(var2)) {
            var1 |= 3;
         } else if (Modifier.isProtected(var2)) {
            var1 |= 4;
         } else {
            var1 |= 5;
         }
      } else if (Modifier.isPublic(var2)) {
         var1 |= 1;
      }

      return var1;
   }

   @Override
   public Class z1() {
      return this.a6;
   }

   @Override
   public n5 t4() {
      return com.aspose.slides.internal.p4l.n5.n5();
   }

   @Override
   public String q0() {
      return this.z1().getName();
   }

   @Override
   public String z3() {
      return this.z1().getPackage().getName();
   }

   @Override
   public String s7() {
      return this.z1().getSimpleName();
   }

   @Override
   public y8 k5() {
      return this.t2();
   }

   private static void n5(String var0, String[] var1, String[] var2) {
      var1[0] = null;
      var2[0] = null;
      if (var0 != null) {
         int var3 = d1.k5(var0, ".", (short)4);
         if (var3 != -1) {
            var2[0] = d1.l6(var0, 0, var3);
            int var4 = var0.length() - var2[0].length() - 1;
            if (var4 != 0) {
               var1[0] = d1.l6(var0, var3 + 1, var4);
            } else {
               var1[0] = "";
            }
         } else {
            var1[0] = var0;
         }
      }
   }

   @Override
   public y8 t2() {
      return this.c8;
   }

   @Override
   public y8 m1() {
      return this.h0;
   }

   private y8[] k5(String var1, int var2, boolean var3) {
      boolean var4 = false;
      boolean var5 = false;
      String var6 = "";
      String var7 = "";
      int var8 = 0;
      String[] var9 = new String[]{var6};
      String[] var10 = new String[]{var7};
      boolean[] var11 = new boolean[]{false};
      boolean[] var12 = new boolean[]{false};
      int[] var13 = new int[]{0};
      var2 &= -9;
      n5(var1, var9, var10);
      var7 = var10[0];
      var6 = var9[0];
      n5(var2, var9, var3, var11, var12, var13);
      var8 = var13[0];
      var6 = var9[0];
      var4 = var11[0];
      var5 = var12[0];
      List var14 = new List();
      List var15 = this.u6().u9(var8, var6);

      for (int var16 = 0; var16 < var15.size(); var16++) {
         c4 var17 = (c4)var15.get_Item(var16);
         if (n5(var17, var2, var6, var4, var7)) {
            var14.addItem(var17);
         }
      }

      return (y8[])var14.toArray(new y8[0]);
   }

   @Override
   public Object n5(String var1, int var2, l6 var3, Object var4, Object[] var5, m1[] var6, com.aspose.slides.internal.x7n.l6 var7, String[] var8) {
      throw new NotImplementedException();
   }
}
