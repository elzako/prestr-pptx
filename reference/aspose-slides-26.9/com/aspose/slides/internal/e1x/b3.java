package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class b3 {
   private com.aspose.slides.internal.n2d.k5 n5;
   private com.aspose.slides.internal.n2d.m3<a3> l6;
   private q0 k5;
   private z8 u3;
   private y1 a6;
   private z7 u9;
   private m1 h0;
   private w1 c8;
   private l6 t2;
   private p8 s7;
   private com.aspose.slides.internal.n2d.u3 x8;
   private com.aspose.slides.internal.z0k.e2 n3;
   private com.aspose.slides.internal.z0k.e2 y4;
   private com.aspose.slides.internal.z0k.e2 e2;
   private int t9;
   private final IGenericDictionary<String, Long> z1 = com.aspose.slides.internal.t6j.l6.n5();
   private long[] t4;
   private static final String[] q0 = new String[]{"head", "hhea", "maxp", "hmtx", "fpgm", "prep", "cvt ", "loca", "glyf"};
   private static final String[] z3 = new String[]{"OS/2", "name", "cmap", "post"};
   private static final int[] m1 = new int[]{0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};
   private static final t4[] k7 = new t4[0];

   public final i1 n5(z1 var1, String var2) {
      com.aspose.slides.internal.z0k.t4 var3 = var1.l6();

      try {
         i1 var4 = this.n5(var3, var2);
         var4.n5(var1);
         return var4;
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final i1 n5(String var1, String var2) {
      return this.n5(new y4(var1), var2);
   }

   public final i1 n5(byte[] var1, String var2) {
      return this.n5(new a0(var1), var2);
   }

   public final i1 n5(com.aspose.slides.internal.z0k.t4 var1, String var2) {
      this.n5 = new com.aspose.slides.internal.n2d.k5(var1);
      this.k5(var2);
      this.k5();
      this.u9();
      this.u3();
      this.h0();
      this.a6();
      this.c8();
      this.t2();
      return this.s7();
   }

   public final t4[] n5(z1 var1) {
      if (!var1.k5()) {
         return k7;
      }

      com.aspose.slides.internal.z0k.t4 var2 = var1.l6();

      try {
         this.n5 = new com.aspose.slides.internal.n2d.k5(var2);
         t4[] var3 = null;
         if (this.n3()) {
            t4[] var4 = this.y4();

            for (t4 var8 : var4) {
               var8.n5(var1);
               var8.n5(true);
            }

            var3 = var4;
         } else if (this.n5(0)) {
            this.u9();
            t4[] var12 = this.u9.n5();

            for (t4 var20 : var12) {
               var20.n5(var1);
               var20.n5(false);
            }

            var3 = var12;
         }

         if (var3 != null && this.l6 != null) {
            this.h0();

            for (t4 var19 : var3) {
               var19.n5(this.h0);
            }
         }

         return var3;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final void n5(
      i1 var1,
      com.aspose.slides.internal.n2d.k7 var2,
      com.aspose.slides.internal.n2d.k7 var3,
      com.aspose.slides.internal.z0k.t4 var4,
      boolean var5,
      boolean var6
   ) {
      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var3 == null) {
         throw new ArgumentNullException("oldToNewGlyphIndexes");
      }

      if (var4 == null) {
         throw new ArgumentNullException("dstStream");
      }

      com.aspose.slides.internal.z0k.t4 var7 = var1.y1().l6();

      try {
         this.n5 = new com.aspose.slides.internal.n2d.k5(var7);
         this.k5(var1.u3());
         if (!var6 && !var1.c4()) {
            this.k5();
            this.u3();
            this.a6();
            this.c8();
            if (var5) {
               this.t2();
               this.n5();
            }

            boolean var18 = this.k5.e2 == 0;
            m3 var9 = new m3(this.n5, var18);
            int var10 = var9.n5(this.n5("loca"), this.n5("glyf"), this.c8, var3) & 65535;
            if ((var10 & 65535) != var3.n5()) {
               throw new InvalidOperationException("Unexpected used glyphs count!");
            }

            this.n3 = var9.n5();
            this.y4 = var9.l6();
            this.e2 = var9.k5();
            this.a6.l6 = var10;
            this.u3.t4 = var10;
            if (var5) {
               this.t2.n5(var2);
               this.s7.n5(var3);
            }

            this.n5(var5, var4);
         } else {
            com.aspose.slides.internal.z0k.t4 var8 = var1.y1().l6();

            try {
               com.aspose.slides.internal.n2d.t4.n5(var8, var4);
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }
         }
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   public final Dictionary<Integer, t1> n5(i1 var1, com.aspose.slides.internal.n2d.k7 var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var2 == null) {
         throw new ArgumentNullException("oldToNewGlyphIndexes");
      }

      com.aspose.slides.internal.z0k.t4 var4 = var1.y1().l6();

      byte[] var5;
      try {
         var5 = com.aspose.slides.internal.n2d.t4.l6(var4);
         if ("OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var5, 0, 4))) {
            var5 = com.aspose.slides.internal.c8e.n5.n5(var5);
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2(var5);

      try {
         this.n5 = new com.aspose.slides.internal.n2d.k5(var6);
         this.k5(var1.u3());
         this.k5();
         boolean var7 = this.k5.e2 == 0;
         m3 var8 = new m3(this.n5, var7);
         a3 var9 = this.l6("CFF ");
         if (var9 != null) {
            var1.l6(true);
            this.n5.n5().setPosition(var9.k5);
            k5 var10 = new k5(this.n5);
            var1.k5(var10.n5());
         }

         a3 var20 = this.l6("CFF ");
         a3 var11 = this.l6("loca");
         return var11 == null && var20 != null ? new Dictionary<>() : var8.n5(var11, this.n5("glyf"), var2, var3);
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   private void n5() {
      this.u3("post");
      this.s7 = new p8(this.n5);
   }

   private int l6() {
      int var1 = this.n5.l6();
      if (var1 != 65536 && var1 != 1330926671) {
         return -1;
      }

      int var2 = this.n5.a6() & 65535;
      this.n5.a6();
      this.n5.a6();
      this.n5.a6();
      return var2;
   }

   private void k5(String var1) {
      if (this.n3()) {
         this.y4();
         long var2 = 0L;
         Long[] var4 = new Long[]{var2};
         boolean var5 = !this.z1.tryGetValue(var1, var4) || !this.n5(var4[0].intValue());
         var2 = var4[0];
         if (var5) {
            throw new InvalidOperationException("The TTC font is invalid.");
         }
      } else if (!this.n5(0)) {
         throw new InvalidOperationException("The file is not recognized as a TTF or TTC font.");
      }
   }

   private boolean n5(int var1) {
      this.n5.n5().setPosition(var1);
      int var2 = this.l6();
      if (var2 <= 0) {
         return false;
      }

      this.l6 = new com.aspose.slides.internal.n2d.m3<>();

      for (int var3 = 0; var3 < var2; var3++) {
         a3 var4 = new a3(this.n5);
         this.l6.addItem(var4.n5, var4);
      }

      return true;
   }

   private void k5() {
      this.u3("head");
      this.k5 = new q0(this.n5);
   }

   private void u3() {
      this.u3("hhea");
      this.u3 = new z8(this.n5);
   }

   private void a6() {
      this.u3("maxp");
      this.a6 = new y1(this.n5);
   }

   private void u9() {
      this.u3("name");
      int var1 = (int)this.n5.n5().getPosition();
      this.l6(var1);
   }

   private void h0() {
      a3 var1 = this.l6("OS/2");
      if (var1 != null) {
         this.n5.n5().setPosition(var1.k5);
         this.h0 = new m1(this.n5);
      }
   }

   private void c8() {
      if (this.u3 == null) {
         throw new InvalidOperationException("Need to read horizontal header first.");
      }

      if (this.a6 == null) {
         throw new InvalidOperationException("Need to read maximum profile first.");
      }

      this.u3("hmtx");
      this.c8 = new w1(this.n5, this.u3.t4 & 65535, this.a6.l6 & 65535);
   }

   private void t2() {
      this.u3("cmap");
      this.t2 = new l6(this.n5);
   }

   private i1 s7() {
      i1 var1 = new i1();
      var1.l6(this.k5.u9 & 65535);
      var1.z1(this.k5.h0);
      var1.t4(this.k5.c8);
      var1.q0(this.k5.t2);
      var1.z3(this.k5.s7);
      var1.n5(this.k5.e2);
      a3 var2 = this.l6("CFF ");
      if (var2 != null) {
         var1.l6(true);
         this.n5.n5().setPosition(var2.k5);
         k5 var3 = new k5(this.n5);
         var1.k5(var3.n5());
      }

      var1.u9(this.l6("COLR") != null && this.l6("CPAL") != null || this.l6("CBDT") != null && this.l6("CBLC") != null);
      if (var1.e5()) {
         if (this.l6("COLR") != null) {
            var1.u3 = this.l6("COLR").k5;
            var1.a6 = this.l6("CPAL").k5;
         }

         if (this.l6("CBDT") != null) {
            var1.u9 = this.l6("CBDT").k5;
            var1.h0 = this.l6("CBLC").k5;
         }
      }

      var1.a6(this.l6("morx") != null || this.l6("mort") != null);
      var1.u3(this.l6("GPOS") != null);
      a3 var15 = this.l6("kern");
      if (var15 != null) {
         var1.n5 = var15.k5;
      }

      a3 var4 = this.l6("GPOS");
      if (var4 != null) {
         var1.l6 = var4.k5;
      }

      a3 var5 = this.l6("GSUB");
      if (var5 != null) {
         var1.k5 = var5.k5;
      }

      var1.c8 = this.l6("loca");
      var1.t2 = this.l6("glyf");
      float var6 = 1.8F;
      float var7 = var1.t2() / 1.8F;
      float var8 = var1.t2() * 1.8F;
      if (this.h0 == null) {
         var1.k5(this.u3.l6);
         var1.u3(-this.u3.k5);
         var1.a6(this.u3.l6 - this.u3.k5 + this.u3.u3);
         if (this.u3.k5 > 0) {
            var1.k5(this.k5.s7);
            var1.u3(-this.k5.c8);
            var1.a6(var1.s7() + var1.x8());
            var1.n5((float)(-q1.u3((double)(this.u3.s7), (double)(this.u3.t2)) * 180.0 / Math.PI));
            var1.n5(this.k5.n5());
            if (com.aspose.slides.internal.n2d.t4.n5(var1.k5(), "Bold", true)) {
               var1.n5(var1.c8() | 1);
            }

            if (com.aspose.slides.internal.n2d.t4.n5(var1.k5(), "Italic", true)) {
               var1.n5(var1.c8() | 2);
            }

            var1.m1(this.h0.p8);
            var1.k7(this.h0.s3);
            if (var1.s7() + var1.x8() > var1.y4()) {
               var1.a6(var1.s7() + var1.x8());
            }
         }

         var1.n5(this.u9);
         var1.n5(this.t2.n5(this.c8));
         var1.n5(this.t2);
         return var1;
      } else {
         int var9 = this.h0.r4 - this.h0.c4;
         int var10 = (this.h0.y1 & 65535) + (this.h0.a0 & 65535);
         boolean var11 = var10 < var8 && var10 > var7;
         var1.n5(this.u9);
         boolean var12 = this.h0.r4 == 0 && this.h0.c4 == 0 || !var11;
         var1.k5(var12 ? this.u3.l6 : this.h0.y1 & 65535);
         var1.u3(var12 ? -this.u3.k5 : this.h0.a0 & 65535);
         var1.a6(!var12 && var1.c4() ? (this.h0.y1 & 65535) + (this.h0.a0 & 65535) : this.u3.l6 - this.u3.k5 + this.u3.u3);
         if (this.h0.c4 <= 0 || !(var9 > var8) && !(var9 < var7) || var11 || var1.y4() != 0 && !(var1.y4() > var8) && !(var1.y4() < var7)) {
            if (this.u3.k5 > 0) {
               var1.k5(this.k5.s7);
               var1.u3(-this.k5.c8);
               var1.a6(var1.s7() + var1.x8());
            }
         } else {
            var1.k5(this.k5.s7);
            var1.u3(-this.k5.c8);
            var1.a6(var1.s7() + var1.x8());
            var1.l6(var1.y4());
         }

         var1.n5((float)(-q1.u3((double)(this.u3.s7), (double)(this.u3.t2)) * 180.0 / Math.PI));
         var1.s7(this.h0.e2);
         var1.t9(this.h0.t9);
         var1.y4(this.h0.h0);
         var1.e2(this.h0.t2);
         var1.x8(this.h0.x8);
         var1.n3(this.h0.y4);
         var1.n5((this.h0.z8 & 65535) == 0 ? this.k5.n5() : this.h0.n5());
         var1.n5(this.h0.t4);
         var1.l6(this.h0.z1);
         if (com.aspose.slides.internal.n2d.t4.n5(var1.k5(), "Bold", true)) {
            var1.n5(var1.c8() | 1);
         }

         if (com.aspose.slides.internal.n2d.t4.n5(var1.k5(), "Italic", true)) {
            var1.n5(var1.c8() | 2);
         }

         var1.m1(this.h0.p8);
         var1.k7(this.h0.s3);
         var1.n5(this.t2.n5(this.c8));
         var1.n5(this.t2);
         if (var1.s7() + var1.x8() > var1.y4()) {
            var1.a6(var1.s7() + var1.x8());
         }

         byte var13 = 4;
         byte var14 = 8;
         var1.n5((this.h0.a6 & 65535 & 4) != 0 && (this.h0.a6 & 65535 & 8) == 0);
         var1.m3(this.h0.a6);
         var1.u9(this.h0.z8 & 65535);
         var1.h0(this.h0.r4);
         var1.c8(this.h0.c4);
         var1.t2(this.h0.r4 - this.h0.c4 + this.h0.y2);
         return var1;
      }
   }

   private void u3(String var1) {
      a3 var2 = this.n5(var1);
      this.n5.n5().setPosition(var2.k5);
   }

   public final a3 n5(String var1) {
      a3 var2 = this.l6(var1);
      if (var2 == null) {
         throw new InvalidOperationException(d1.n5("Cannot find table '{0}' in the font file.", new Object[]{var1}));
      } else {
         return var2;
      }
   }

   public final a3 l6(String var1) {
      Object var2 = null;
      a3[] var3 = new a3[]{(a3)var2};
      if (this.l6 != null) {
         this.l6.tryGetValue(var1, var3);
      }

      return var3[0];
   }

   private int n5(boolean var1) {
      this.x8.n5(65536);
      List var2 = new List();
      this.n5(q0, var2);
      if (var1) {
         this.n5(z3, var2);
      }

      this.x8.l6(var2.size());
      int var3 = m1[var2.size()];
      int var4 = (1 << var3) * 16;
      this.x8.l6(var4);
      this.x8.l6(var3);
      int var5 = var2.size() * 16 - var4;
      this.x8.l6(var5);
      int var6 = (int)this.x8.n5().getPosition() + var2.size() * 16;
      List$Enumerator var7 = var2.iterator();

      try {
         while (var7.hasNext()) {
            a3 var8 = (a3)var7.next();
            var8.n5(this.x8);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return var6;
   }

   private void n5(String[] var1, List<a3> var2) {
      for (String var6 : var1) {
         a3 var7 = this.l6(var6);
         if (var7 != null) {
            var2.addItem(var7);
         }
      }
   }

   private void l6(boolean var1) {
      this.a6("head");
      this.n5("hhea", this.u3.u3());
      this.n5("maxp", this.a6.u3());
      this.n5("hmtx", this.e2);
      this.a6("fpgm");
      this.a6("prep");
      this.a6("cvt ");
      this.n5("loca", this.n3);
      this.n5("glyf", this.y4);
      if (var1) {
         this.a6("OS/2");
         this.a6("name");
         this.n5("cmap", this.t2.u3());
         this.n5("post", this.s7.u3());
      }
   }

   private void n5(String var1, com.aspose.slides.internal.z0k.e2 var2) {
      a3 var3 = this.n5(var1);
      var3.k5 = (int)this.x8.n5().getPosition();
      this.x8.n5(var2.getBuffer(), 0, (int)var2.getLength());
      var3.l6 = a3.n5(var2.getBuffer(), 0, (int)var2.getLength());
      var3.u3 = (int)var2.getLength();
      this.x8();
   }

   private void a6(String var1) {
      a3 var2 = this.l6(var1);
      if (var2 != null) {
         this.n5.n5().setPosition(var2.k5);
         byte[] var3 = this.n5.n5(var2.u3);
         var2.k5 = (int)this.x8.n5().getPosition();
         this.x8.n5(var3, 0, var3.length);
         this.x8();
      }
   }

   private void x8() {
      com.aspose.slides.internal.n2d.t4.n5(this.x8.n5(), 4);
   }

   private boolean n3() {
      this.n5.n5().setPosition(0L);
      String var1 = d1.n5(this.n5.l6(4));
      if (!"ttcf".equals(var1)) {
         return false;
      }

      int var2 = this.n5.l6();
      if (var2 != 65536 && var2 != 131072) {
         return false;
      }

      this.t9 = this.n5.l6();
      this.t4 = new long[this.t9];

      for (int var3 = 0; var3 < this.t9; var3++) {
         this.t4[var3] = this.n5.k5();
      }

      if (131072 == var2) {
         this.n5.k5();
         this.n5.k5();
         this.n5.k5();
      }

      return true;
   }

   private t4[] y4() {
      if (this.t9 <= 0) {
         throw new InvalidOperationException("Can't read TTC entry.");
      }

      List var1 = new List();

      for (int var2 = 0; var2 < this.t9; var2++) {
         this.n5.n5().setPosition(this.t4[var2] & 4294967295L);
         int var3 = this.l6();
         if (var3 <= 0) {
            throw new InvalidOperationException("Can't read TTC entry.");
         }

         for (int var4 = 0; var4 < var3; var4++) {
            a3 var5 = new a3(this.n5);
            if ("name".equals(var5.n5)) {
               int var6 = var5.k5;
               this.n5.n5().setPosition(var6);
               this.l6(var6);
               String[] var7 = this.u9.u3(4);

               for (String var11 : var7) {
                  this.z1.set_Item(var11, this.t4[var2]);
               }

               t4[] var12 = this.u9.n5();
               if (null != var12) {
                  var1.addRange(com.aspose.slides.ms.System.u3.n5(var12));
               }
            }
         }
      }

      return (t4[])var1.toArray(new t4[0]);
   }

   private void l6(int var1) {
      int var2 = this.n5.a6();
      if ((var2 & 65535) != 0) {
         throw new InvalidOperationException("Unsupported Name table format.");
      }

      int var3 = this.n5.a6();
      int var4 = this.n5.a6();
      this.u9 = new z7();

      for (int var5 = 0; var5 < (var3 & 65535); var5++) {
         int var6 = this.n5.a6() & 65535;
         int var7 = this.n5.a6() & 65535;
         int var8 = this.n5.a6() & 65535;
         int var9 = this.n5.a6() & 65535;
         int var10 = this.n5.a6() & 65535;
         int var11 = this.n5.a6() & 65535;
         com.aspose.slides.internal.l7h.j5 var12 = null;
         switch (var6) {
            case 0:
               var12 = com.aspose.slides.internal.l7h.j5.t4();
               break;
            case 1:
               if (var7 == 2) {
                  var12 = com.aspose.slides.internal.n2d.x8.n5("big5");
               } else if (var7 != 0 && var7 != 1 && var7 != 3 && var7 != 25) {
                  var12 = com.aspose.slides.internal.l7h.j5.z3();
               } else {
                  var12 = com.aspose.slides.internal.n2d.x8.n5(1252);
               }
            case 2:
            default:
               break;
            case 3:
               if (var7 == 4) {
                  var12 = com.aspose.slides.internal.n2d.x8.n5("big5");
               } else if (var7 != 1 && var7 != 10 && var7 != 0) {
                  var12 = com.aspose.slides.internal.n2d.x8.n5("utf-16be");
               } else {
                  var12 = com.aspose.slides.internal.l7h.j5.t4();
               }
         }

         if (var12 != null) {
            int var13 = (int)this.n5.n5().getPosition();
            this.n5.n5().setPosition(var1 + (var4 & 65535) + var11);
            byte[] var14 = this.n5.n5(var10);
            String var21;
            if ("big5".equals(var12.s7())) {
               byte[] var15 = new byte[var14.length];
               int var16 = 0;

               for (byte var20 : var14) {
                  if ((var20 & 255) != 0) {
                     var15[var16++] = var20;
                  }
               }

               var21 = var12.l6(var15, 0, var16);
            } else {
               var21 = var12.l6(var14);
            }

            if (this.u9.n5(var9, var8) == null) {
               this.u9.n5(var9, var8, var21);
            }

            this.n5.n5().setPosition(var13);
         }
      }
   }

   private void n5(boolean var1, com.aspose.slides.internal.z0k.t4 var2) {
      this.x8 = new com.aspose.slides.internal.n2d.u3(var2);
      int var3 = this.n5(var1);
      this.x8.n5().setPosition(var3);
      this.l6(var1);
      this.x8.n5().setPosition(0L);
      this.n5(var1);
   }

   public final void n5(i1 var1, com.aspose.slides.internal.z0k.t4 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var2 == null) {
         throw new ArgumentNullException("dstStream");
      }

      if (!var1.c4()) {
         throw new InvalidOperationException("OpenType font with CFF table is required.");
      }

      com.aspose.slides.internal.z0k.t4 var3 = var1.y1().l6();

      try {
         this.n5 = new com.aspose.slides.internal.n2d.k5(var3);
         this.k5(var1.u3());
         a3 var4 = this.l6("CFF ");
         if (var4 == null) {
            throw new InvalidOperationException("There is no CFF table in font file.");
         }

         this.n5.n5().setPosition(var4.k5);
         byte[] var5 = new byte[var4.u3];
         this.n5.n5().read(var5, 0, var5.length);
         var2.write(var5, 0, var5.length);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }
}
