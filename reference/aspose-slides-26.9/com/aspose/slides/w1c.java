package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class w1c {
   final com.aspose.slides.internal.n8e.e9 n5;
   final com.aspose.slides.internal.n8e.e9 l6;

   w1c(com.aspose.slides.internal.n8e.e9 var1, com.aspose.slides.internal.n8e.e9 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   w1c() {
      this.n5 = new com.aspose.slides.internal.n8e.e9(
         new com.aspose.slides.internal.z0k.e2(com.aspose.slides.internal.n8e.e9.n5(com.aspose.slides.internal.n8e.e9.l6.k5()))
      );
      this.l6 = new com.aspose.slides.internal.n8e.e9(
         new com.aspose.slides.internal.z0k.e2(com.aspose.slides.internal.n8e.e9.n5(com.aspose.slides.internal.n8e.e9.n5.k5()))
      );
   }

   public final String n5() {
      if (this.l6 != null && this.l6.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.l6.u3().n5(2L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void n5(String var1) {
      this.y1();
      this.l6.u3().n5().set_Item(2L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String l6() {
      if (this.l6 != null && this.l6.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.l6.u3().n5(3L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void l6(String var1) {
      this.y1();
      this.l6.u3().n5().set_Item(3L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String k5() {
      if (this.l6 != null && this.l6.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.l6.u3().n5(4L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void k5(String var1) {
      this.y1();
      this.l6.u3().n5().set_Item(4L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String u3() {
      if (this.l6 != null && this.l6.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.l6.u3().n5(5L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void u3(String var1) {
      this.y1();
      this.l6.u3().n5().set_Item(5L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String a6() {
      if (this.l6 != null && this.l6.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.l6.u3().n5(6L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void a6(String var1) {
      this.y1();
      this.l6.u3().n5().set_Item(6L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String u9() {
      if (this.l6 != null && this.l6.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.l6.u3().n5(8L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void u9(String var1) {
      this.y1();
      this.l6.u3().n5().set_Item(8L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final com.aspose.slides.ms.System.j5 h0() {
      if (this.l6 == null || this.l6.u3() == null) {
         return com.aspose.slides.ms.System.j5.s7();
      }

      if (this.l6(11L)) {
         return com.aspose.slides.ms.System.j5.l6;
      }

      com.aspose.slides.ms.System.j5 var1 = new com.aspose.slides.ms.System.j5();
      com.aspose.slides.ms.System.j5[] var2 = new com.aspose.slides.ms.System.j5[]{var1};
      this.l6.u3().n5(11L, var2);
      var2[0].u3(var1);
      return var1;
   }

   public final void n5(com.aspose.slides.ms.System.j5 var1) {
      this.y1();
      this.l6.u3().n5().set_Item(11L, new com.aspose.slides.internal.n8e.y5(var1.m3()));
   }

   public final com.aspose.slides.ms.System.s4 c8() {
      if (this.l6 != null && this.l6.u3() != null) {
         com.aspose.slides.ms.System.j5 var1 = new com.aspose.slides.ms.System.j5();
         com.aspose.slides.ms.System.j5[] var2 = new com.aspose.slides.ms.System.j5[]{var1};
         boolean var3 = this.l6.u3().n5(10L, var2);
         var2[0].u3(var1);
         if (var3) {
            return new com.aspose.slides.ms.System.s4(var1.t4());
         }
      }

      return com.aspose.slides.ms.System.s4.k5;
   }

   public final void n5(com.aspose.slides.ms.System.s4 var1) {
      this.y1();
      com.aspose.slides.ms.System.j5 var2 = com.aspose.slides.ms.System.j5.l6(0L).m3();
      if (var1.a6() > 0L && var1.a6() < com.aspose.slides.ms.System.j5.k5.t4()) {
         com.aspose.slides.ms.System.j5.l6(var1.a6()).u3(var2);
      }

      this.l6.u3().n5().set_Item(10L, new com.aspose.slides.internal.n8e.y5(var2.m3()));
   }

   public final com.aspose.slides.ms.System.j5 t2() {
      if (this.l6 == null || this.l6.u3() == null) {
         return com.aspose.slides.ms.System.j5.s7();
      }

      if (this.l6(12L)) {
         return com.aspose.slides.ms.System.j5.l6;
      }

      com.aspose.slides.ms.System.j5 var1 = new com.aspose.slides.ms.System.j5();
      com.aspose.slides.ms.System.j5[] var2 = new com.aspose.slides.ms.System.j5[]{var1};
      this.l6.u3().n5(12L, var2);
      var2[0].u3(var1);
      return var1;
   }

   public final void l6(com.aspose.slides.ms.System.j5 var1) {
      this.y1();
      this.l6.u3().n5().set_Item(12L, new com.aspose.slides.internal.n8e.y5(var1.m3()));
   }

   public final com.aspose.slides.ms.System.j5 s7() {
      if (this.l6 == null || this.l6.u3() == null) {
         return com.aspose.slides.ms.System.j5.s7();
      }

      if (this.l6(13L)) {
         return com.aspose.slides.ms.System.j5.l6;
      }

      com.aspose.slides.ms.System.j5 var1 = new com.aspose.slides.ms.System.j5();
      com.aspose.slides.ms.System.j5[] var2 = new com.aspose.slides.ms.System.j5[]{var1};
      this.l6.u3().n5(13L, var2);
      var2[0].u3(var1);
      return var1;
   }

   public final void k5(com.aspose.slides.ms.System.j5 var1) {
      this.y1();
      this.l6.u3().n5().set_Item(13L, new com.aspose.slides.internal.n8e.y5(var1.m3()));
   }

   final String x8() {
      if (this.n5 != null && this.n5.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.n5.u3().n5(3L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   final void h0(String var1) {
      this.r4();
      this.n5.u3().n5().set_Item(3L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   final List<IHeadingPair> n3() {
      List var1 = new List();
      if (this.n5 != null && this.n5.u3() != null) {
         int var2 = 1251;
         if (this.l6 != null && this.l6.u3() != null) {
            int[] var3 = new int[]{1251};
            this.l6.u3().n5(1L, var3);
            var2 = var3[0];
         }

         byte[] var18 = null;
         byte[][] var4 = new byte[][]{var18};
         this.n5.u3().n5(12L, var4);
         var18 = var4[0];
         if (var18 != null && var18.length >= 4) {
            long var5 = com.aspose.slides.internal.n8e.y2.u3(var18, 0) & 4294967295L;
            int var7 = 4;

            while ((var5 & 4294967295L) > 0L) {
               long var8 = com.aspose.slides.internal.n8e.y2.u3(var18, var7 + 4) & 4294967295L;
               com.aspose.slides.internal.n8e.y5 var10 = new com.aspose.slides.internal.n8e.y5(var18, var7, (int)var8 + 8);
               String var11 = null;
               String[] var12 = new String[]{var11};
               boolean var13 = var10.n5(var12, var2);
               var11 = var12[0];
               if (var13) {
                  var5--;
                  var7 += (int)((var8 & 4294967295L) + 8L);
                  com.aspose.slides.internal.n8e.y5 var14 = new com.aspose.slides.internal.n8e.y5(var18, var7, 8);
                  var7 += 8;
                  int var15 = 0;
                  int[] var16 = new int[]{0};
                  boolean var17 = var14.n5(var16);
                  var15 = var16[0];
                  if (var17) {
                     var1.addItem(new HeadingPair(var11, var15));
                  }

                  var5--;
               }
            }

            return var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   final List<String> y4() {
      List var1 = new List();
      if (this.n5 != null && this.n5.u3() != null) {
         int var2 = 1251;
         if (this.l6 != null && this.l6.u3() != null) {
            int[] var3 = new int[]{1251};
            this.l6.u3().n5(1L, var3);
            var2 = var3[0];
         }

         byte[] var14 = null;
         byte[][] var4 = new byte[][]{var14};
         this.n5.u3().n5(13L, var4);
         var14 = var4[0];
         if (var14 != null && var14.length >= 4) {
            long var5 = com.aspose.slides.internal.n8e.y2.u3(var14, 0) & 4294967295L;
            int var7 = 4;

            while ((var5 & 4294967295L) > 0L) {
               var5--;
               long var8 = com.aspose.slides.internal.n8e.y2.u3(var14, var7) & 4294967295L;
               com.aspose.slides.internal.n8e.y5 var10 = new com.aspose.slides.internal.n8e.y5(30, var14, var7, (int)var8 + 4);
               var7 += (int)((var8 & 4294967295L) + 4L);
               Object var11 = null;
               String[] var12 = new String[]{(String)var11};
               boolean var13 = var10.n5(var12, var2);
               String var16 = var12[0];
               if (var13) {
                  var1.addItem(var16);
               }
            }

            return var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public final String e2() {
      if (this.n5 != null && this.n5.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.n5.u3().n5(14L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void c8(String var1) {
      this.r4();
      this.n5.u3().n5().set_Item(14L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String t9() {
      if (this.n5 != null && this.n5.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.n5.u3().n5(15L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void t2(String var1) {
      this.r4();
      this.n5.u3().n5().set_Item(15L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String z1() {
      if (this.n5 != null && this.n5.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.n5.u3().n5(2L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void s7(String var1) {
      this.r4();
      this.n5.u3().n5().set_Item(2L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String t4() {
      if (this.l6 != null && this.l6.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.l6.u3().n5(18L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void x8(String var1) {
      this.y1();
      this.l6.u3().n5().set_Item(18L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final String q0() {
      if (this.l6 != null && this.l6.u3() != null) {
         Object var1 = null;
         String[] var2 = new String[]{(String)var1};
         this.l6.u3().n5(7L, var2);
         return var2[0];
      } else {
         return "";
      }
   }

   public final void n3(String var1) {
      this.y1();
      this.l6.u3().n5().set_Item(7L, new com.aspose.slides.internal.n8e.y5(var1));
   }

   public final int z3() {
      if (this.l6 != null && this.l6.u3() != null) {
         try {
            String var1 = null;
            String[] var2 = new String[]{var1};
            this.l6.u3().n5(9L, var2);
            var1 = var2[0];
            return com.aspose.slides.ms.System.d1.n5(var1) ? 0 : com.aspose.slides.ms.System.a3.n5(var1);
         } catch (RuntimeException var3) {
            com.aspose.slides.internal.n8e.v4.n5(var3);
         }
      }

      return 0;
   }

   public final void n5(int var1) {
      this.y1();
      this.l6.u3().n5().set_Item(9L, new com.aspose.slides.internal.n8e.y5(com.aspose.slides.ms.System.a3.n5(var1, com.aspose.slides.internal.x7n.l6.k5())));
   }

   public final int m1() {
      int var1 = 0;
      if (this.n5 != null && this.n5.a6() != null && this.n5.a6().l6() != null) {
         com.aspose.slides.internal.n8e.s7 var2 = this.n5.a6().l6();
         IGenericEnumerator var3 = var2.n5().iterator();

         try {
            while (var3.hasNext()) {
               KeyValuePair var4 = (KeyValuePair)var3.next();
               String var5 = (String)var4.getValue();
               if (!com.aspose.slides.ms.System.d1.a6(var5, "_PID_HLINKS")) {
                  long var6 = (Long)var4.getKey();
                  if (this.n5.a6().n5(var6)) {
                     var1++;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return var1;
   }

   public final String k7() {
      if (this.n5 != null && this.n5.a6() != null) {
         long var1 = 0L;
         long[] var3 = new long[]{0L};
         boolean var4 = this.n5.a6().n5("_PID_LINKBASE", var3);
         var1 = var3[0];
         if (var4) {
            com.aspose.slides.internal.n8e.h0 var5 = null;
            com.aspose.slides.internal.n8e.h0[] var6 = new com.aspose.slides.internal.n8e.h0[]{var5};
            this.n5.a6().n5(var1, var6);
            var5 = var6[0];
            if (var5 != null) {
               return var5.toString();
            }
         }
      }

      return com.aspose.slides.ms.System.d1.n5;
   }

   public final void y4(String var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         this.r4();
         if ((this.n5.k5() & 4294967295L) < 2L) {
            this.n5.l6();
         }

         com.aspose.slides.internal.n8e.h0 var2 = new com.aspose.slides.internal.n8e.h0();
         var2.n5(var1);
         com.aspose.slides.internal.n8e.y5 var3 = new com.aspose.slides.internal.n8e.y5(var2);
         this.n5.a6().n5("_PID_LINKBASE", var3);
      }
   }

   public final com.aspose.slides.internal.n8e.q0 m3() {
      com.aspose.slides.internal.n8e.q0 var1 = null;
      if (this.n5 != null && this.n5.a6() != null) {
         IGenericEnumerator var2 = this.n5.a6().n5().iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var3.getValue(), com.aspose.slides.internal.n8e.q0.class)) {
                  var1 = (com.aspose.slides.internal.n8e.q0)var3.getValue();
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      return var1;
   }

   public final boolean z8() {
      if (this.n5 != null && this.n5.a6() != null) {
         boolean var1 = false;
         boolean[] var2 = new boolean[]{false};
         boolean var3 = this.n5.u3().n5(11L, var2);
         var1 = var2[0];
         if (var3) {
            return var1;
         }
      }

      return false;
   }

   public final boolean j5() {
      if (this.n5 != null && this.n5.a6() != null) {
         boolean var1 = false;
         boolean[] var2 = new boolean[]{false};
         boolean var3 = this.n5.u3().n5(22L, var2);
         var1 = var2[0];
         if (var3) {
            return var1;
         }
      }

      return false;
   }

   public final boolean w1() {
      if (this.n5 != null && this.n5.a6() != null) {
         boolean var1 = false;
         boolean[] var2 = new boolean[]{false};
         boolean var3 = this.n5.u3().n5(16L, var2);
         var1 = var2[0];
         if (var3) {
            return var1;
         }
      }

      return false;
   }

   final int n5(long var1) {
      if (this.n5 != null && this.n5.a6() != null) {
         int var3 = 0;
         int[] var4 = new int[]{0};
         boolean var5 = this.n5.u3().n5(var1, var4);
         var3 = var4[0];
         if (var5) {
            return var3;
         }
      }

      return 0;
   }

   public final boolean n5(String var1, int[] var2) {
      if (this.n5.a6() != null) {
         return this.n5.a6().n5(var1, var2);
      }

      var2[0] = 0;
      return false;
   }

   public final boolean n5(String var1, boolean[] var2) {
      if (this.n5.a6() != null) {
         return this.n5.a6().n5(var1, var2);
      }

      var2[0] = false;
      return false;
   }

   public final boolean n5(String var1, float[] var2) {
      if (this.n5.a6() != null) {
         return this.n5.a6().n5(var1, var2);
      }

      var2[0] = 0.0F;
      return false;
   }

   public final boolean n5(String var1, double[] var2) {
      if (this.n5.a6() != null) {
         return this.n5.a6().n5(var1, var2);
      }

      var2[0] = 0.0;
      return false;
   }

   public final boolean n5(String var1, com.aspose.slides.ms.System.j5[] var2) {
      if (this.n5.a6() != null) {
         return this.n5.a6().n5(var1, var2);
      }

      com.aspose.slides.ms.System.j5.l6(0L).u3(var2[0]);
      return false;
   }

   public final boolean n5(String var1, String[] var2) {
      if (this.n5.a6() != null) {
         return this.n5.a6().n5(var1, var2);
      }

      var2[0] = com.aspose.slides.ms.System.d1.n5;
      return false;
   }

   private long e2(String var1) {
      this.r4();
      if (this.n5.a6() == null) {
         this.n5.l6();
      }

      if (this.n5.a6().l6().n5().containsValue(var1)) {
         this.n5.a6().n5(var1);
      }

      long var2 = this.n5.a6().k5();
      if ((var2 & 4294967295L) < 3L) {
         var2 = 3L;
      }

      return var2;
   }

   public final void n5(String var1, int var2) {
      long var3 = this.e2(var1);
      com.aspose.slides.internal.n8e.y5 var5 = new com.aspose.slides.internal.n8e.y5(var2);
      this.n5.a6().n5().set_Item(var3, var5);
      this.n5.a6().l6().n5().set_Item(var3, var1);
   }

   public final void n5(String var1, boolean var2) {
      long var3 = this.e2(var1);
      com.aspose.slides.internal.n8e.y5 var5 = new com.aspose.slides.internal.n8e.y5(var2);
      this.n5.a6().n5().set_Item(var3, var5);
      this.n5.a6().l6().n5().set_Item(var3, var1);
   }

   public final void n5(String var1, float var2) {
      long var3 = this.e2(var1);
      com.aspose.slides.internal.n8e.y5 var5 = new com.aspose.slides.internal.n8e.y5(var2);
      this.n5.a6().n5().set_Item(var3, var5);
      this.n5.a6().l6().n5().set_Item(var3, var1);
   }

   public final void n5(String var1, double var2) {
      long var4 = this.e2(var1);
      com.aspose.slides.internal.n8e.y5 var6 = new com.aspose.slides.internal.n8e.y5(var2);
      this.n5.a6().n5().set_Item(var4, var6);
      this.n5.a6().l6().n5().set_Item(var4, var1);
   }

   public final void n5(String var1, com.aspose.slides.ms.System.j5 var2) {
      long var3 = this.e2(var1);
      com.aspose.slides.internal.n8e.y5 var5 = new com.aspose.slides.internal.n8e.y5(var2.m3());
      this.n5.a6().n5().set_Item(var3, var5);
      this.n5.a6().l6().n5().set_Item(var3, var1);
   }

   public final void n5(String var1, String var2) {
      long var3 = this.e2(var1);
      com.aspose.slides.internal.n8e.y5 var5 = new com.aspose.slides.internal.n8e.y5(var2);
      this.n5.a6().n5().set_Item(var3, var5);
      this.n5.a6().l6().n5().set_Item(var3, var1);
   }

   public final String l6(int var1) {
      if (var1 >= 0 && var1 < this.m1()) {
         int var2 = 0;
         if (this.n5.a6() != null && this.n5.a6().l6() != null) {
            com.aspose.slides.internal.n8e.s7 var3 = this.n5.a6().l6();
            IGenericEnumerator var4 = var3.n5().iterator();

            try {
               while (var4.hasNext()) {
                  KeyValuePair var5 = (KeyValuePair)var4.next();
                  String var6 = (String)var5.getValue();
                  if (!com.aspose.slides.ms.System.d1.a6(var6, "_PID_HLINKS")) {
                     long var7 = (Long)var5.getKey();
                     if (this.n5.a6().n5(var7) && var2++ == var1) {
                        return var6;
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      }

      throw new ArgumentOutOfRangeException("index", var1, "Property index is out of range.");
   }

   private void y1() {
      if (this.l6 == null || (this.l6.k5() & 4294967295L) == 0L) {
         throw new PptException("Presentation doesn't have SummaryInformation stream.");
      }
   }

   private boolean l6(long var1) {
      long var3 = 0L;
      long[] var5 = new long[]{0L};
      this.l6.u3().n5(var1, var5);
      var3 = var5[0];
      return var3 == 0L;
   }

   final void r4() {
      if (this.n5 == null || (this.n5.k5() & 4294967295L) == 0L) {
         throw new PptException("Presentation doesn't have DocumentSummaryInformation stream.");
      }
   }

   final com.aspose.slides.internal.n8e.e9 c4() {
      return this.n5;
   }

   final com.aspose.slides.internal.n8e.e9 y2() {
      return this.l6;
   }
}
