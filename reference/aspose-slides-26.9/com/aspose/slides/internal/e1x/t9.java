package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p6;

public class t9 {
   private final Object n5 = new Object();
   private final com.aspose.slides.internal.n2d.m3<List<t4>> l6;
   private final Dictionary<String, e5> k5 = com.aspose.slides.internal.t6j.l6.n5();
   private static final List<String> u3 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "Helvetica Neue", "Helvetica", "Khmer", "Lao", "Meiryo", "Segoe", "Humnst777CnBT,Bold"
   );

   public t9(z1[] var1) {
      this.l6 = new com.aspose.slides.internal.n2d.m3<>(new t9$n5(this, com.aspose.slides.internal.x7n.l6.u3(), true));
      com.aspose.slides.internal.n2d.n3 var2 = n5(var1);
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            t4 var4 = (t4)var3.next();

            try {
               List var5 = null;
               Object[] var6 = new Object[]{var5};
               boolean var7 = !this.l6.tryGetValue(var4.n5(), var6);
               var5 = (List)var6[0];
               if (var7) {
                  List var8 = new List();
                  var8.addItem(var4);
                  this.l6.addItem(var4.n5(), var8);
               }

               if (var5 != null) {
                  var5.addItem(var4);
               }
            } catch (KeyNotFoundException var14) {
            }

            try {
               List var17 = null;
               Object[] var19 = new Object[]{var17};
               boolean var20 = !this.l6.tryGetValue(var4.l6(), var19);
               var17 = (List)var19[0];
               if (var20) {
                  List var21 = new List();
                  var21.addItem(var4);
                  this.l6.addItem(var4.l6(), var21);
               }

               if (var17 != null) {
                  var17.addItem(var4);
               }
            } catch (KeyNotFoundException var13) {
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.n2d.n3 n5(z1[] var0) {
      com.aspose.slides.internal.n2d.n3 var1 = new com.aspose.slides.internal.n2d.n3(p6.u3());
      b3 var2 = new b3();

      for (z1 var6 : var0) {
         try {
            t4[] var7 = var2.n5(var6);
            if (var7 != null) {
               for (t4 var11 : var7) {
                  var1.n5(var11);
               }
            }
         } catch (RuntimeException var12) {
         }
      }

      return var1;
   }

   public final i1 n5(String var1, int var2, boolean var3) {
      i1 var4 = this.l6(var1, var2, var3);
      if (var4 == null) {
         String var5 = null;
         switch (a6.n5(var1)) {
            case 0:
            case 1:
               var5 = "Arial";
               break;
            case 2:
               var5 = "Khmer UI";
               break;
            case 3:
               var5 = "Lao UI";
               break;
            case 4:
               var5 = "Meiryo UI";
               break;
            case 5:
               var5 = "Segoe UI";
               break;
            case 6:
               var5 = "Calibri";
               break;
            default:
               String[] var6 = new String[]{var5};
               l6(var1, var6);
               var5 = var6[0];
               if (!com.aspose.slides.internal.n2d.t4.l6(var5)) {
                  var6[0] = var5;
                  n5(var1, var6);
                  var5 = var6[0];
               }
         }

         if (com.aspose.slides.internal.n2d.t4.l6(var5)) {
            var4 = this.l6(var5, var2, true);
         }
      }

      return var4;
   }

   private static void n5(String var0, String[] var1) {
      var0 = d1.n5(var0, " ", d1.n5);

      try {
         new com.aspose.slides.internal.o9b.y4(var0);
         var1[0] = var0;
      } catch (ArgumentException var3) {
         var1[0] = null;
      }
   }

   private static boolean l6(String var0, String[] var1) {
      try {
         com.aspose.slides.internal.o9b.y4 var2;
         try {
            var2 = new com.aspose.slides.internal.o9b.y4(var0);
         } catch (ArgumentException var7) {
            String var4 = null;
            String[] var5 = new String[]{var4};
            boolean var6 = k5(var0, var5);
            var4 = var5[0];
            if (!var6) {
               throw var7;
            }

            var2 = new com.aspose.slides.internal.o9b.y4(var4);
         }

         var1[0] = var2.a6();
         return true;
      } catch (RuntimeException var8) {
         var1[0] = null;
         return false;
      }
   }

   public final i1 n5(int var1) {
      i1 var2 = this.l6("Times New Roman", var1, false);
      if (var2 == null) {
         var2 = this.l6(u3(), var1, false);
      }

      return var2;
   }

   public final i1 n5() {
      IGenericEnumerator var1 = this.l6.getValues().iterator();

      try {
         while (var1.hasNext()) {
            List var2 = (List)var1.next();
            List$Enumerator var3 = var2.iterator();

            try {
               while (var3.hasNext()) {
                  t4 var4 = (t4)var3.next();
                  i1 var5 = this.l6(var4.n5(), 0, false);
                  if (var5 != null) {
                     return var5;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   public final i1 l6(String var1, int var2, boolean var3) {
      e5 var4 = null;
      synchronized (this.n5) {
         e5[] var6 = new e5[]{var4};
         boolean var7 = !this.k5.tryGetValue(var1, var6);
         var4 = var6[0];
         if (var7) {
            try {
               var4 = this.n5(var1);
               this.k5.set_Item(var1, var4);
            } catch (RuntimeException var10) {
               return null;
            }
         }
      }

      return var4.n5(var2, var2 == 3 && !var3);
   }

   public final z3[] l6() {
      List var1 = new List(this.l6.size());
      IGenericEnumerator var2 = this.l6.getValues().iterator();

      try {
         while (var2.hasNext()) {
            List var3 = (List)var2.next();
            List$Enumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  t4 var5 = (t4)var4.next();
                  var1.addItem(new z3(var5.n5(), var5.a6() != null ? var5.a6().t4 : null));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return (z3[])var1.toArray(new z3[0]);
   }

   public final void k5() {
      synchronized (this.n5) {
         this.k5.clear();
      }
   }

   private e5 n5(String var1) {
      e5 var2 = new e5(var1);
      e5 var3 = new e5(var1);
      List var4 = null;
      List[] var5 = new List[]{var4};
      boolean var6 = this.l6.tryGetValue(var1, var5);
      var4 = var5[0];
      if (var6) {
         Dictionary var7 = new Dictionary();
         List var8 = new List();
         List var9 = new List();
         List$Enumerator var10 = var4.iterator();

         try {
            while (var10.hasNext()) {
               t4 var11 = (t4)var10.next();
               if (com.aspose.slides.internal.t6j.a6.n5(var1, var11.l6())) {
                  var9.addItem(var11);
               } else {
                  var8.addItem(var11);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         List var25 = new List(var8);
         var25.addRange(var9);
         List$Enumerator var12 = var25.iterator();

         try {
            while (var12.hasNext()) {
               t4 var13 = (t4)var12.next();
               boolean var14 = var7.containsKey(var13.k5());
               if (!var14 || var13.u3()) {
                  b3 var15 = new b3();
                  i1 var16 = var15.n5(var13.k5(), var13.l6());
                  if (var16.n5(var1, false)) {
                     var2.n5(var16);
                  }

                  if (var16.n5(var1, true)) {
                     var3.n5(var16);
                  }

                  if (!var14) {
                     var7.addItem(var13.k5(), 0);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }
      }

      return var2.n5() != 0 ? var2 : var3;
   }

   private static boolean k5(String var0, String[] var1) {
      boolean var2 = false;
      var1[0] = null;
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5(var0.length());
      String[] var4 = d1.n5(var0, ' ');

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var4[var5];
         String var7 = d1.u9(var6);
         if (u3.containsItem(var7)) {
            var2 = true;
         } else {
            var3.n5(var6).n5(' ');
         }
      }

      var1[0] = var3.toString();
      var1[0] = d1.a6(var1[0], new char[]{});
      return var2;
   }

   public static String u3() {
      return com.aspose.slides.internal.o9b.y4.u3().a6();
   }

   static {
      u3.addItem("light");
      u3.addItem("extralight");
      u3.addItem("bold");
   }
}
