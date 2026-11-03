package com.aspose.slides.internal.z8;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.p3;

public abstract class n5 implements y4 {
   private y4 n5;
   private y4 l6;
   private short k5;
   private static final com.aspose.slides.internal.r7c.c8 u3 = new com.aspose.slides.internal.r7c.c8("\\\\[\\(\\)\\t\\n\\f\\r '\\\"]");

   protected n5(short var1, y4 var2) {
      this.n5 = var2;
      this.k5 = var1;
      if (var2 != null) {
         ((n5)var2).l6 = this;
      }
   }

   @Override
   public final short n5() {
      return this.k5;
   }

   @Override
   public final y4 l6() {
      y4 var1 = this;

      while (var1.u3() != null) {
         var1 = var1.u3();
      }

      return var1;
   }

   @Override
   public final y4 k5() {
      return this.l6;
   }

   @Override
   public final y4 u3() {
      return this.n5;
   }

   @Override
   public int a6() {
      throw new InvalidOperationException();
   }

   @Override
   public float u9() {
      throw new InvalidOperationException();
   }

   @Override
   public String h0() {
      throw new InvalidOperationException();
   }

   @Override
   public y4 c8() {
      throw new InvalidOperationException();
   }

   @Override
   public String t2() {
      throw new InvalidOperationException();
   }

   public static y4 n5(y4 var0, String var1) {
      byte var2 = 0;
      int var3 = var1.length();
      int var4 = var3 - 1;
      boolean var5 = false;
      if (var1.charAt(0) == '\'' || var1.charAt(0) == '"') {
         var2 = 1;
         var5 = true;
      }

      if (var1.charAt(var4) == '\'' || var1.charAt(var4) == '"') {
         var3 = var4 - var2;
         var5 = true;
      }

      return var5 ? new r4(var0, d1.l6(var1, var2, var3)) : new r4(var0, var1);
   }

   public static y4 l6(y4 var0, String var1) {
      return new q0(var0, var1);
   }

   public static y4 n5(y4 var0, int var1) {
      return new z3(var0, var1);
   }

   public static y4 n5(y4 var0, short var1, String var2) {
      return new w1(var1, var2, var0);
   }

   public static y4 n5(y4 var0, short var1, float var2) {
      return new x8(var1, var2, var0);
   }

   public static y4 n5(y4 var0, String var1, y4 var2) {
      return new n3(var0, var1, var2);
   }

   public static y4 n5(y4 var0, short var1, y4 var2) {
      return new z8(var0, var1, var2);
   }

   public static y4 n5(y4 var0, com.aspose.slides.internal.l6.n3 var1) {
      List var2 = new List<>(com.aspose.slides.ms.System.u3.n5(d1.n5(var1.x8(), new char[]{' '}, (short)1)));
      var2.removeAt(0);
      return new w1((short)47, d1.n5(" ",(String[])( var2.toArray(new String[0]))), var0);
   }

   public static y4 l6(y4 var0, com.aspose.slides.internal.l6.n3 var1) {
      y4 var2 = null;
      String var3 = var1.x8();
      switch (var3.length() - 1) {
         case 3:
            char var4 = com.aspose.slides.ms.System.t9.z1(var3.charAt(1));
            char var5 = com.aspose.slides.ms.System.t9.z1(var3.charAt(2));
            char var6 = com.aspose.slides.ms.System.t9.z1(var3.charAt(3));
            if (!u9.n5(var4) || !u9.n5(var5) || !u9.n5(var6)) {
               throw u9.n5(var1);
            }

            int var18 = u9.l6(var4);
            var18 |= var18 << 4;
            int var20 = u9.l6(var5);
            var20 |= var20 << 4;
            int var22 = u9.l6(var6);
            var22 |= var22 << 4;
            var2 = n5(null, var18);
            y4 var24 = n5(var2, var20);
            n5(var24, var22);
            break;
         case 6:
            char var7 = com.aspose.slides.ms.System.t9.z1(var3.charAt(1));
            char var8 = com.aspose.slides.ms.System.t9.z1(var3.charAt(2));
            char var9 = com.aspose.slides.ms.System.t9.z1(var3.charAt(3));
            char var10 = com.aspose.slides.ms.System.t9.z1(var3.charAt(4));
            char var11 = com.aspose.slides.ms.System.t9.z1(var3.charAt(5));
            char var12 = com.aspose.slides.ms.System.t9.z1(var3.charAt(6));
            if (!u9.n5(var7) || !u9.n5(var8) || !u9.n5(var9) || !u9.n5(var10) || !u9.n5(var11) || !u9.n5(var12)) {
               throw u9.n5(var1);
            }

            int var13 = u9.l6(var7) << 4 | u9.l6(var8);
            int var14 = u9.l6(var9) << 4 | u9.l6(var10);
            int var15 = u9.l6(var11) << 4 | u9.l6(var12);
            var2 = n5(null, var13);
            y4 var16 = n5(var2, var14);
            n5(var16, var15);
            break;
         default:
            throw u9.n5(var1);
      }

      return n5(var0, (short)27, var2);
   }

   public static y4 k5(y4 var0, com.aspose.slides.internal.l6.n3 var1) {
      j5 var2 = j5.n5(var1);
      byte var3 = 1;
      int var4 = var2.u3();
      switch (var4) {
         case 1:
            var3 = 1;
            var4 = var2.u3();
            break;
         case 2:
            var3 = -1;
            var4 = var2.u3();
      }

      switch (var4) {
         case 13:
            long var5 = 0L;
            long[] var7 = new long[]{0L};
            boolean var8 = p3.n5(var2.k5(), var7);
            var5 = var7[0];
            if (var8) {
               var5 *= var3;
               if (var5 < -2147483648L) {
                  return new z3(var0, Integer.MIN_VALUE);
               }

               if (var5 > 2147483647L) {
                  return new z3(var0, Integer.MAX_VALUE);
               }
            }

            return new z3(var0, (int)var5);
         case 14:
         default:
            float var9 = n1.n5(var2.k5(), com.aspose.slides.internal.h0.h0.n5) * var3;
            return new x8((short)var4, var9, var0);
         case 42:
            return new s7(var0, 0.0F, var2.k5());
      }
   }

   public static y4 u3(y4 var0, com.aspose.slides.internal.l6.n3 var1) {
      int var2 = d1.u3(var1.x8(), '(');
      String var3 = d1.l6(var1.x8(), ++var2, var1.x8().length() - 1 - var2);
      var3 = d1.k5(var3,new char[]{ '\'', '"', '\t', '\n', '\f', '\r', ' '});
      String[] var4 = d1.n5(var3, '%');
      a5 var5 = new a5(var4[0]);

      for (int var6 = 1; var6 < var4.length; var6++) {
         if (var4[var6].length() >= 2) {
            String var7 = d1.l6(var4[var6], 0, 2);
            int var8 = 0;
            int[] var9 = new int[]{0};
            boolean var10 = a3.n5(var7, 515, com.aspose.slides.internal.h0.h0.n5, var9);
            var8 = var9[0];
            if (var10) {
               var5.n5("{0}{1}",new Object[]{ (char)var8, d1.k5(var4[var6], 2)});
            } else {
               var5.n5("%{0}",new Object[]{ var4[var6]});
            }
         } else {
            var5.n5("%{0}",new Object[]{ var4[var6]});
         }
      }

      var3 = var5.toString();
      byte var14 = 92;
      if (d1.u3(var3, '\\') != -1) {
         var3 = u3.n5(var3, new n5$1());
      }

      return new a0(var0, var3);
   }

   private static String l6(com.aspose.slides.internal.r7c.u3 var0) {
      return d1.k5(var0.toString(), 1);
   }

   public static IGenericList<y4> n5(y4 var0) {
      List var1 = new List();

      do {
         n5 var2 = (n5)var0;
         y4 var3 = var0.k5();
         if (var2.n5 != null) {
            ((n5)var2.n5).l6 = null;
            var2.n5 = null;
         }

         if (var2.l6 != null) {
            ((n5)var2.l6).n5 = null;
            var2.l6 = null;
         }

         var1.addItem(var0);
         var0 = var3;
      } while (var0 != null);

      return var1;
   }

   public static y4 n5(IGenericEnumerable<y4> var0) {
      IGenericEnumerator var1 = var0.iterator();
      var1.hasNext();
      n5 var2 = (n5)var1.next();

      while (var1.hasNext()) {
         n5 var3 = (n5)var1.next();
         var3.n5 = var2;
         var2.l6 = var3;
         var2 = var3;
      }

      return var2;
   }

   // $VF: synthetic method
   static String n5(com.aspose.slides.internal.r7c.u3 var0) {
      return l6(var0);
   }
}
