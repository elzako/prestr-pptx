package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

final class e2n implements i8f {
   final t3x n5;
   private String k5;
   public final Paragraph l6;
   private byte[] u3;
   private boolean a6;
   private final List<m4i> u9;

   @Override
   public final boolean n5() {
      return this.a6;
   }

   public final List<m4i> u3() {
      return this.u9;
   }

   @Override
   public final t4t l6() {
      return this.n5;
   }

   @Override
   public final IGenericEnumerable<f1b> k5() {
      return new com.aspose.slides.internal.f3.n5<>(this.u9);
   }

   public final String a6() {
      return this.k5;
   }

   private void n5(String var1) {
      this.k5 = var1;
   }

   public final byte[] u9() {
      return this.u3;
   }

   private void n5(byte[] var1) {
      this.u3 = var1;
   }

   final boolean n5(byte var1) {
      List$Enumerator var2 = this.u3().iterator();

      try {
         while (var2.hasNext()) {
            m4i var3 = (m4i)var2.next();
            String var4 = var3.l6;

            for (int var5 = 0; var5 < var4.length(); var5++) {
               int var6 = var4.charAt(var5);
               if (com.aspose.slides.internal.n2d.u9.m1(var4.charAt(var5)) && var4.length() > 1) {
                  var6 = com.aspose.slides.ms.System.t9.n5(var4.charAt(var5), var4.charAt(var5 + 1));
                  var5++;
               }

               if (com.aspose.slides.internal.n2d.u9.u3(var6) == var1) {
                  return true;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   e2n(Paragraph var1) {
      this.l6 = var1;
      this.u9 = new List<>();
      this.n5 = var1.n5().t9();
   }

   public final boolean h0() {
      String var1 = "\t";
      if (this.u9.size() == 0) {
         return false;
      }

      if (this.u9.size() == 1) {
         return "\t".equals(this.u9.get_Item(0).l6);
      }

      boolean var2 = false;
      List$Enumerator var3 = this.u9.iterator();

      try {
         while (var3.hasNext()) {
            m4i var4 = (m4i)var3.next();
            if ("\t".equals(var4.l6)) {
               if (var2) {
                  return false;
               }

               var2 = true;
            } else if (!com.aspose.slides.ms.System.d1.n5(var4.l6)) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   public final char c8() {
      List$Enumerator var1 = this.u9.iterator();

      try {
         while (var1.hasNext()) {
            m4i var2 = (m4i)var1.next();
            String var3 = var2.l6;
            if (!com.aspose.slides.ms.System.d1.n5(var3)) {
               return var3.charAt(0);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      List$Enumerator var13 = this.u9.iterator();

      try {
         while (var13.hasNext()) {
            m4i var14 = (m4i)var13.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var14.k5, MathPortion.class)) {
               return 'a';
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      throw new ArgumentOutOfRangeException();
   }

   public static e2n[] n5(TextFrame var0, int var1) {
      SmartArtShape var2 = null;
      SmartArtShape[] var3 = new SmartArtShape[]{var2};
      boolean var4 = d0u.n5(SmartArtShape.class, var0, var3);
      var2 = var3[0];
      List var5 = new List();

      for (int var6 = 0; var6 < var0.getParagraphs().getCount(); var6++) {
         Paragraph var7 = (Paragraph)var0.getParagraphs().get_Item(var6);
         IGenericList var8 = n5(var7, var1);
         var5.addRange(var8);
      }

      e2n[] var10 = (e2n[])var5.toArray(new e2n[0]);
      n5(var10, var4);
      return var10;
   }

   public static IGenericList<e2n> n5(Paragraph var0, int var1) {
      List var2 = new List();
      if (var0.getPortions().getCount() > 0) {
         e2n var3 = new e2n(var0);
         var2.addItem(var3);

         for (int var4 = 0; var4 < var0.getPortions().getCount(); var4++) {
            Portion var5 = (Portion)var0.getPortions().get_Item(var4);
            PortionFormat var6 = var5.l6();
            c9g var7 = var6.r4();
            String[] var8 = com.aspose.slides.ms.System.d1.u9(var5.u9(), j5u.c8);
            if (var8.length <= 1) {
               String var35 = var5.n5(var1);
               m4i var36 = new m4i(var5, var35, var7);
               var3.u9.addItem(var36);
            } else {
               for (int var9 = 0; var9 < var8.length - 1; var9++) {
                  String var10 = var8[var9];
                  m4i var11 = new m4i(var5, var10, var7);
                  var3.u9.addItem(var11);
                  var3.a6 = true;
                  var3 = new e2n(var0);
                  var2.addItem(var3);
               }

               m4i var12 = new m4i(var5, var8[var8.length - 1], var7);
               var3.u9.addItem(var12);
            }
         }
      } else if (var0.k5() == null) {
         e2n var21 = new e2n(var0);
         var2.addItem(var21);
         m4i var23 = new m4i(null, com.aspose.slides.ms.System.d1.n5, var21.n5.z3);
         var21.u9.addItem(var23);
      }

      PortionFormat var22 = (PortionFormat)var0.k5();
      if (var22 != null && !n5(var0)) {
         if (var2.size() == 0) {
            e2n var24 = new e2n(var0);
            var2.addItem(var24);
         }

         Portion var25 = (Portion)var22.getParent_Immediate();
         String var28 = var25.n5(var1);
         m4i var31 = new m4i(var25, var28, var25.l6().r4());
         ((e2n)var2.get_Item(var2.size() - 1)).u3().addItem(var31);
      }

      List$Enumerator var26 = var2.iterator();

      try {
         while (var26.hasNext()) {
            e2n var29 = (e2n)var26.next();
            List var32 = var29.u3();
            int var33 = 0;

            for (int var37 = 0; var37 < var32.size(); var37++) {
               m4i var34 = (m4i)var32.get_Item(var37);
               var34.n5(var33);
               var33 += var34.l6.length();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
            var26.dispose();
         }
      }

      var26 = var2.iterator();

      try {
         while (var26.hasNext()) {
            e2n var30 = (e2n)var26.next();
            var30.n5(n5(var30.u3()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
            var26.dispose();
         }
      }

      return var2;
   }

   public static void n5(e2n[] var0, boolean var1) {
      String[] var2 = v6o.n5(com.aspose.slides.ms.System.u3.n5(var0), var0.length, var1);

      for (int var3 = 0; var3 < var0.length; var3++) {
         var0[var3].n5(var2[var3]);
      }
   }

   private static boolean n5(Paragraph var0) {
      IPortionCollection var1 = var0.getPortions();
      return var1.getCount() > 0 ? o3u.n5(var0.k5(), var1.get_Item(var1.getCount() - 1).getPortionFormat()) : false;
   }

   private static byte[] n5(IGenericList<m4i> var0) {
      if (var0.size() <= 0) {
         return new byte[0];
      }

      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         var1.n5(((m4i)var0.get_Item(var2)).l6);
      }

      if (var1.l6() <= 0) {
         return new byte[0];
      }

      byte[] var12 = new byte[var1.l6()];
      byte[] var3 = new byte[var1.l6()];
      int var4 = 0;

      for (int var5 = 0; var5 < var0.size(); var5++) {
         m4i var6 = (m4i)var0.get_Item(var5);
         String var7 = var6.n5.getLanguageId();
         boolean var8 = !com.aspose.slides.ms.System.d1.n5(var7) && com.aspose.slides.internal.n2d.u9.n5(var7);
         if (com.aspose.slides.ms.System.d1.n5(var7) && var6.k5.n3().getParagraphFormat().getRightToLeft() == -1) {
            for (int var9 = 0; var9 < var6.l6.length(); var9++) {
               byte var10 = com.aspose.slides.internal.n2d.u9.x8(var1.l6(var9));
               if (var10 == 5) {
                  break;
               }

               if (com.aspose.slides.internal.n2d.u9.l6(var10)) {
                  int var11 = com.aspose.slides.internal.n2d.u9.n5(var10);
                  if (var11 == 2) {
                     var8 = true;
                     break;
                  }
               }
            }
         }

         int var13 = var8 ? 3 : 0;

         for (int var14 = var6.l6.length(); var14 > 0; var4++) {
            var3[var4] = com.aspose.slides.internal.n2d.u9.x8(var1.l6(var4));
            var12[var4] = (byte)var13;
            var14--;
         }
      }

      if (var1.l6() > 0) {
         com.aspose.slides.internal.n2d.u9.n5(var3, var12);
         com.aspose.slides.internal.n2d.u9.n5(var1.toString(), var12);
      }

      return var12;
   }
}
