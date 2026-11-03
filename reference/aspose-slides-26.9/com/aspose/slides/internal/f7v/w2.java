package com.aspose.slides.internal.f7v;

import com.sun.imageio.plugins.png.PNGMetadata;
import java.util.List;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

public class w2 extends IIOMetadata {
   private final u9 n5;
   private final boolean l6;

   public w2(u9 var1) {
      this.n5 = var1;
      if (var1 instanceof t2) {
         this.l6 = false;
      } else {
         this.l6 = true;
      }
   }

   public double[] n5() {
      s7 var1 = this.n5.n5("pHYs", true);
      return var1 == null ? new double[]{-1.0, -1.0} : ((t1)var1).a6();
   }

   public j9 l6() {
      return (j9)this.n5.l6("tIME");
   }

   public a5 k5() {
      return (a5)this.n5.l6("PLTE");
   }

   public z6 u3() {
      return (z6)this.n5.l6("tRNS");
   }

   public o0 a6() {
      return (o0)this.n5.l6("IHDR");
   }

   public d2 u9() {
      return (d2)this.n5.l6("bKGD");
   }

   public d5 h0() {
      return (d5)this.n5.l6("cHRM");
   }

   public p8 c8() {
      return (p8)this.n5.l6("gAMA");
   }

   public f2 t2() {
      return (f2)this.n5.l6("hIST");
   }

   public i1 s7() {
      return (i1)this.n5.l6("iCCP");
   }

   public List<z7> x8() {
      return (List<z7>)(List<?>)this.n5.n5("iTXt");
   }

   public t1 n3() {
      return (t1)this.n5.l6("pHYs");
   }

   public h2 y4() {
      return (h2)this.n5.l6("sBIT");
   }

   public v0 e2() {
      return (v0)this.n5.l6("sPLT");
   }

   public f0 t9() {
      return (f0)this.n5.l6("sRGB");
   }

   public List<y0> z1() {
      return (List<y0>)(List<?>)this.n5.n5("tEXt");
   }

   public List<j8> t4() {
      return (List<j8>)(List<?>)this.n5.n5("zTXt");
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   @Override
   public Node getAsTree(String formatName) {
      return this.q0().getAsTree(formatName);
   }

   @Override
   public void mergeTree(String formatName, Node root) throws IIOInvalidTreeException {
      this.q0().mergeTree(formatName, root);
   }

   @Override
   public void reset() {
   }

   public PNGMetadata q0() {
      PNGMetadata var1 = new PNGMetadata();
      this.n5(var1);
      this.l6(var1);
      this.k5(var1);
      this.u3(var1);
      this.a6(var1);
      this.u9(var1);
      this.h0(var1);
      this.c8(var1);
      this.t2(var1);
      this.s7(var1);
      this.x8(var1);
      this.n3(var1);
      this.y4(var1);
      this.e2(var1);
      this.t9(var1);
      this.z1(var1);
      return var1;
   }

   private void n5(PNGMetadata var1) {
      o0 var2 = this.a6();
      if (var2 != null) {
         var1.IHDR_present = true;
         var1.IHDR_width = var2.l6();
         var1.IHDR_height = var2.k5();
         var1.IHDR_bitDepth = var2.u3();
         var1.IHDR_colorType = var2.a6();
         var1.IHDR_compressionMethod = var2.u9();
         var1.IHDR_filterMethod = var2.h0();
         var1.IHDR_interlaceMethod = var2.c8();
      }
   }

   private void l6(PNGMetadata var1) {
      a5 var2 = this.k5();
      if (var2 != null) {
         byte[][] var3 = var2.k5();
         var1.PLTE_present = true;
         var1.PLTE_red = var3[0];
         var1.PLTE_green = var3[1];
         var1.PLTE_blue = var3[2];
      }
   }

   private void k5(PNGMetadata var1) {
      d2 var2 = this.u9();
      if (var2 != null) {
         if (var1.IHDR_colorType == 3) {
            var1.bKGD_colorType = 3;
            var1.bKGD_index = var2.k5();
         } else if (var1.IHDR_colorType != 0 && var1.IHDR_colorType != 4) {
            var1.bKGD_colorType = 2;
            int[] var3 = var2.u3();
            var1.bKGD_red = var3[0];
            var1.bKGD_green = var3[1];
            var1.bKGD_blue = var3[2];
         } else {
            var1.bKGD_colorType = 0;
            var1.bKGD_gray = var2.l6();
         }

         var1.bKGD_present = true;
      }
   }

   private void u3(PNGMetadata var1) {
      d5 var2 = this.h0();
      if (var2 != null) {
         var1.cHRM_whitePointX = com.aspose.slides.internal.c5e.h0.n5(var2.l6());
         var1.cHRM_whitePointY = com.aspose.slides.internal.c5e.h0.n5(var2.k5());
         var1.cHRM_redX = com.aspose.slides.internal.c5e.h0.n5(var2.u3());
         var1.cHRM_redY = com.aspose.slides.internal.c5e.h0.n5(var2.a6());
         var1.cHRM_greenX = com.aspose.slides.internal.c5e.h0.n5(var2.u9());
         var1.cHRM_greenY = com.aspose.slides.internal.c5e.h0.n5(var2.h0());
         var1.cHRM_blueX = com.aspose.slides.internal.c5e.h0.n5(var2.c8());
         var1.cHRM_blueY = com.aspose.slides.internal.c5e.h0.n5(var2.t2());
         var1.cHRM_present = true;
      }
   }

   private void a6(PNGMetadata var1) {
      p8 var2 = this.c8();
      if (var2 != null) {
         double var3 = var2.l6();
         var1.gAMA_gamma = (int)(var3 * 100000.0 + 0.5);
         var1.gAMA_present = true;
      }
   }

   private void u9(PNGMetadata var1) {
      f2 var2 = this.t2();
      if (var2 != null) {
         int[] var3 = var2.l6();
         var1.hIST_histogram = new char[var3.length];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var1.hIST_histogram[var4] = (char)var3[var4];
         }

         var1.hIST_present = true;
      }
   }

   private void h0(PNGMetadata var1) {
      i1 var2 = this.s7();
      if (var2 != null) {
         var1.iCCP_profileName = var2.l6();
         var1.iCCP_compressionMethod = var2.u3();
         var1.iCCP_compressedProfile = var2.k5();
         var1.iCCP_present = true;
      }
   }

   private void c8(PNGMetadata var1) {
      for (z7 var4 : this.x8()) {
         var1.iTXt_keyword.add(var4.u9());
         var1.iTXt_compressionFlag.add(var4.l6());
         var1.iTXt_compressionMethod.add(var4.k5());
         var1.iTXt_languageTag.add(var4.u3());
         var1.iTXt_translatedKeyword.add(var4.a6());
         var1.iTXt_text.add(var4.h0());
      }
   }

   private void t2(PNGMetadata var1) {
      t1 var2 = this.n3();
      if (var2 != null) {
         var1.pHYs_pixelsPerUnitXAxis = (int)var2.l6();
         var1.pHYs_pixelsPerUnitYAxis = (int)var2.k5();
         var1.pHYs_unitSpecifier = var2.u3();
         var1.pHYs_present = true;
      }
   }

   private void s7(PNGMetadata var1) {
      h2 var2 = this.y4();
      if (var2 != null) {
         int var3 = var1.IHDR_colorType;
         if (var3 == 0 || var3 == 4) {
            var1.sBIT_grayBits = var2.l6();
         } else if (var3 == 2 || var3 == 3 || var3 == 6) {
            int[] var4 = var2.u3();
            var1.sBIT_redBits = var4[0];
            var1.sBIT_greenBits = var4[1];
            var1.sBIT_blueBits = var4[2];
         }

         if (var3 == 4 || var3 == 6) {
            var1.sBIT_alphaBits = var2.k5();
         }

         var1.sBIT_colorType = var3;
         var1.sBIT_present = true;
      }
   }

   private void x8(PNGMetadata var1) {
      v0 var2 = this.e2();
      if (var2 != null) {
         var1.sPLT_paletteName = var2.k5();
         var1.sPLT_sampleDepth = var2.u3();
         int[] var3 = var2.a6();
         int var4 = var2.l6();
         var1.sPLT_red = new int[var4];
         var1.sPLT_green = new int[var4];
         var1.sPLT_blue = new int[var4];
         var1.sPLT_alpha = new int[var4];
         var1.sPLT_frequency = new int[var4];
         int var5 = 0;

         for (int var6 = 0; var5 < var3.length; var6++) {
            var1.sPLT_red[var6] = var3[var5++];
            var1.sPLT_green[var6] = var3[var5++];
            var1.sPLT_blue[var6] = var3[var5++];
            var1.sPLT_alpha[var6] = var3[var5++];
            var1.sPLT_frequency[var6] = var3[var5++];
         }

         var1.sPLT_present = true;
      }
   }

   private void n3(PNGMetadata var1) {
      f0 var2 = this.t9();
      if (var2 != null) {
         var1.sRGB_renderingIntent = var2.l6();
         var1.sRGB_present = true;
      }
   }

   private void y4(PNGMetadata var1) {
      for (y0 var4 : this.z1()) {
         var1.tEXt_keyword.add(var4.u9());
         var1.tEXt_text.add(var4.h0());
      }
   }

   private void e2(PNGMetadata var1) {
      j9 var2 = this.l6();
      if (var2 != null) {
         var1.tIME_year = var2.l6();
         var1.tIME_month = var2.k5();
         var1.tIME_day = var2.u3();
         var1.tIME_hour = var2.a6();
         var1.tIME_minute = var2.u9();
         var1.tIME_second = var2.h0();
         var1.tIME_present = true;
      }
   }

   private void t9(PNGMetadata var1) {
      z6 var2 = this.u3();
      if (var2 != null) {
         int var3 = var1.IHDR_colorType;
         if (var3 == 3) {
            var1.tRNS_colorType = 3;
            var1.tRNS_alpha = var2.a6();
         } else if (var3 == 0) {
            var1.tRNS_colorType = 0;
            var1.tRNS_gray = var2.k5();
         } else {
            if (var3 != 2) {
               return;
            }

            var1.tRNS_colorType = 2;
            int[] var4 = var2.l6();
            var1.tRNS_red = var4[0];
            var1.tRNS_green = var4[1];
            var1.tRNS_blue = var4[2];
         }

         var1.tRNS_present = true;
      }
   }

   private void z1(PNGMetadata var1) {
      for (j8 var4 : this.t4()) {
         var1.zTXt_keyword.add(var4.u9());
         var1.zTXt_compressionMethod.add(var4.l6());
         var1.zTXt_text.add(var4.h0());
      }
   }
}
