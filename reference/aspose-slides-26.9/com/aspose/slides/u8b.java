package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;

final class u8b {
   private final Presentation n5;
   private TextParam l6 = null;
   private byte[] k5;
   private String[][] u3 = (String[][])null;
   private Dictionary<String, Integer> a6 = null;
   private List<TextParam> u9 = null;
   private boolean h0 = false;

   public u8b(Presentation var1, TextParam var2) {
      this.n5 = var1;
      this.a6 = new Dictionary<>();
      this.u9 = new List<>();
      this.u3 = new String[][]{new String[0], new String[0], new String[0], new String[0], new String[0]};
      this.l6 = var2;
      this.a6.addItem(this.l6.z3(), 0);
      this.u9.addItem(this.l6);
      e4z var3 = this.l6.d2();
      byte var4 = var3.c8();
      byte[] var5 = this.l6.m3();
      this.h0 = var3.u3();
      if (this.h0) {
         var4 = var3.n5().k5();
         var5 = var3.l6().n5().d2();
      }

      this.k5 = var5;
      int var6 = this.l6.k7();
      e6s var7 = this.n5.t9().n5();
      String[] var8 = b8s.n5(var4, var6, var5, this.l6.a6.getLanguageId());
      String[] var9 = var7.n5(var6);
      int var10 = 0;
      if (var8 != null) {
         var10 = var8.length;
      }

      var10 += var9.length;
      if (!com.aspose.slides.ms.System.d1.n5(this.n5.a6().getDefaultRegularFont())) {
         var10++;
      }

      this.u3[3] = new String[var10];
      int var11 = 0;
      if (var9.length > 0) {
         com.aspose.slides.ms.System.u3.n5((Object)(var9)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.u3[3])), var11);
         var11 += var9.length;
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.n5.a6().getDefaultRegularFont())) {
         this.u3[3][var11++] = this.n5.a6().getDefaultRegularFont();
      }

      if (var8 != null) {
         com.aspose.slides.ms.System.u3.n5((Object)(var8)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.u3[3])), var11);
      }
   }

   public final TextParam n5(int var1) {
      k6j var2 = this.n5.t9();
      this.u3[0] = var2.n5(var1, this.l6.z3(), this.k5);
      this.u3[1] = !com.aspose.slides.ms.System.d1.n5(var2.k5()) ? new String[]{var2.k5()} : new String[0];
      this.u3[2] = var2.n5(var1, this.k5, this.l6.t1());
      this.u3[4] = i8w.n5(var1);
      if (this.u3[0] == null) {
         this.u3[0] = new String[0];
      }

      if (this.u3[4] == null) {
         this.u3[4] = new String[0];
      }

      if (this.u3[2] == null) {
         this.u3[2] = new String[0];
      }

      TextParam var3 = null;

      for (int var4 = 0; var4 <= 4; var4++) {
         for (String var8 : this.u3[var4 % 5]) {
            var3 = this.n5(var8);
            var3.k5(this.h0);
            e4z var9 = var3.d2();
            if (var9.u3()) {
               com.aspose.slides.internal.e1x.u6 var10 = var9.l6().n5().h0().n5(var1);
               if (com.aspose.slides.internal.n2d.u9.n5.containsItem((char)var1)) {
                  return var3;
               }

               if (var10 != null) {
                  return var3;
               }
            }
         }
      }

      Dictionary var14 = new Dictionary();
      if (com.aspose.slides.internal.n2d.z3.n5() == 1) {
         for (com.aspose.slides.internal.e1x.z3 var26 : com.aspose.slides.internal.e1x.n5.l6().k5()) {
            var3.n5(var26.n5());
            e4z var30 = var3.d2();
            if (var30.u3()) {
               com.aspose.slides.internal.e1x.u6 var11 = var30.l6().n5().h0().n5(var1);
               if (var11 != null && !var14.containsKey(var30.l6().n5().d2())) {
                  var14.addItem(var30.l6().n5().d2(), var26.n5());
               }
            }
         }
      }

      String var16 = var3.y2();

      for (com.aspose.slides.internal.o9b.y4 var31 : com.aspose.slides.internal.o9b.y4.n5()) {
         var3.n5(var31.a6());
         if (!"Segoe UI Emoji".equals(var16) || var31.a6().toUpperCase().contains("EMOJI")) {
            e4z var34 = var3.d2();
            if (var34.u3()) {
               com.aspose.slides.internal.e1x.i1 var12 = var34.l6().n5();
               com.aspose.slides.internal.e1x.u6 var13 = var12.h0().n5(var1);
               if (var13 != null && var12.d2() != null && !var14.containsKey(var12.d2())) {
                  var14.addItem(var12.d2(), var31.a6());
               }
            }
         }
      }

      for (com.aspose.slides.internal.e1x.z3 var32 : com.aspose.slides.internal.e1x.n5.l6().k5()) {
         var3.n5(var32.n5());
         e4z var35 = var3.d2();
         if (var35.u3()) {
            com.aspose.slides.internal.e1x.u6 var37 = var35.l6().n5().h0().n5(var1);
            if (var37 != null && !var14.containsKey(var35.l6().n5().d2())) {
               var14.addItem(var35.l6().n5().d2(), var32.n5());
            }
         }
      }

      if (var14.size() > 0) {
         if (com.aspose.slides.internal.n2d.z3.n5() == 1) {
            KeyValuePair[] var20 = new KeyValuePair[var14.getValues().size()];
            var14.copyToTArray(var20, 0);
            com.aspose.slides.ms.System.u3.n5(var20, new u8b$1(this));
            var14.clear();

            for (KeyValuePair var36 : var20) {
               var14.addItem(var36);
            }
         }

         String var21 = this.n5(var14, var1);
         if (!com.aspose.slides.ms.System.d1.n5(var21)) {
            var3.n5(var21);
            var3.d2();
            var3 = this.n5(var21);
         }
      }

      return var3;
   }

   private String n5(Dictionary<byte[], String> var1, int var2) {
      i8w$n5 var3 = i8w.l6(var2);
      if (var3 == null) {
         return null;
      }

      w2w var4 = new w2w(this.l6.m3());
      String var5 = var4.n5(var1);
      if (!com.aspose.slides.ms.System.d1.n5(var5)) {
         var3.k5().addItem(var5);
      }

      return var5;
   }

   public final boolean n5(e4z[] var1) {
      for (int var2 = 0; var2 < this.u9.size(); var2++) {
         TextParam var3 = this.u9.get_Item(var2);
         e4z var4 = var3.d2();
         if (var4.u3()) {
            var1[0] = var4;
            return true;
         }
      }

      var1[0] = null;
      return false;
   }

   private TextParam n5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         return null;
      }

      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      boolean var4 = this.a6.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return this.u9.get_Item(var2);
      }

      TextParam var5 = this.l6.r4();
      var5.n5(var1);
      this.a6.addItem(var5.z3(), this.u9.size());
      this.u9.addItem(var5);
      return var5;
   }

   final String[] n5() {
      return this.u3[3];
   }
}
