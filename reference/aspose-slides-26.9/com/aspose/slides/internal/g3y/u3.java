package com.aspose.slides.internal.g3y;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class u3 {
   public static List<BufferedImage> n5(ImageInputStream var0) throws IOException {
      List var1 = l6(var0);
      ArrayList var2 = new ArrayList(var1.size());

      for (int var3 = 0; var3 < var1.size(); var3++) {
         u3$n5 var4 = (u3$n5)var1.get(var3);
         BufferedImage var5 = var4.n5();
         var2.add(var5);
      }

      return var2;
   }

   private static List<u3$n5> l6(ImageInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      short var3 = var0.readShort();
      c8[] var4 = new c8[var3];

      for (short var5 = 0; var5 < var3; var5++) {
         var4[var5] = new c8(var0);
      }

      int var31 = 0;
      ArrayList var6 = new ArrayList(var3);

      try {
         for (var31 = 0; var31 < var3; var31++) {
            int var7 = var0.readInt();
            if (var7 != 40) {
               if (var7 != 1196314761 && var7 != -1991225785) {
                  throw new IOException("Unknown icon format for image [" + var31 + "]");
               }

               int var32 = var0.readInt();
               if (var32 != 169478669 && var32 != 218765834) {
                  throw new IOException("Unrecognized icon format for image #" + var31);
               }

               c8 var33 = var4[var31];
               byte[] var34 = new byte[var33.h0 - 8];
               int var35 = var0.read(var34);
               if (var35 != var34.length) {
                  throw new IOException("Unable to read image #" + var31 + " - incomplete PNG compressed data");
               }

               ByteArrayOutputStream var36 = new ByteArrayOutputStream();
               DataOutputStream var37 = new DataOutputStream(var36);
               var37.writeInt(-1991225785);
               var37.writeInt(218765834);
               var37.write(var34);
               byte[] var40 = var36.toByteArray();
               ByteArrayInputStream var43 = new ByteArrayInputStream(var40);
               ImageInputStream var45 = ImageIO.createImageInputStream(var43);
               ImageReader var47 = n5();
               var47.setInput(var45);
               BufferedImage var49 = var47.read(0);
               c8 var51 = var4[var31];
               u3$n5 var53 = new u3$n5(var49, null, var51);
               var53.n5(true);
               var53.n5(var31);
               var6.add(var53);
            } else {
               k5 var8 = n5.n5(var0, var7);
               k5 var9 = var8.n5();
               var9.k5 = var8.k5 / 2;
               k5 var10 = var8.n5();
               var10.k5 = var9.k5;
               var9.a6 = 1;
               var9.n3 = 2;
               BufferedImage var11 = n5.n5(var10, var0, true);
               BufferedImage var12 = new BufferedImage(var10.l6, var10.k5, 2);
               n5$n5[] var13 = new n5$n5[]{new n5$n5(255, 255, 255, 255), new n5$n5(0, 0, 0, 0)};
               if (var8.a6 == 32) {
                  int var14 = var4[var31].h0;
                  int var15 = var8.n5;
                  int var16 = var10.l6 * var10.k5 * 4;
                  int var17 = var14 - var15 - var16;
                  int var18 = var0.skipBytes(var17);

                  for (int var19 = var17; var18 < var19; var18 = var0.skipBytes(var19)) {
                     if (var18 < 0) {
                        throw new IOException("Failed to read [skip]");
                     }

                     var19 = var17 - var18;
                  }

                  WritableRaster var20 = var11.getRaster();
                  WritableRaster var21 = var11.getAlphaRaster();
                  WritableRaster var22 = var12.getRaster();
                  WritableRaster var23 = var12.getAlphaRaster();

                  for (int var24 = var10.k5 - 1; var24 >= 0; var24--) {
                     for (int var25 = 0; var25 < var10.l6; var25++) {
                        int var26 = var20.getSample(var25, var24, 0);
                        int var27 = var20.getSample(var25, var24, 1);
                        int var28 = var20.getSample(var25, var24, 2);
                        int var29 = var21 != null ? var21.getSample(var25, var24, 0) : 0;
                        var22.setSample(var25, var24, 0, var26);
                        var22.setSample(var25, var24, 1, var27);
                        var22.setSample(var25, var24, 2, var28);
                        if (var23 != null) {
                           var23.setSample(var25, var24, 0, var29);
                        }
                     }
                  }
               } else {
                  BufferedImage var38 = n5.n5(var9, var0, var13, true);
                  WritableRaster var41 = var11.getRaster();
                  WritableRaster var44 = var12.getRaster();
                  WritableRaster var46 = var12.getAlphaRaster();
                  WritableRaster var48 = var38.getRaster();

                  for (int var50 = 0; var50 < var10.k5; var50++) {
                     for (int var52 = 0; var52 < var10.l6; var52++) {
                        int var57 = var11.getRGB(var52, var50);
                        int var54 = var57 >> 16 & 0xFF;
                        int var55 = var57 >> 8 & 0xFF;
                        int var56 = var57 & 0xFF;
                        var44.setSample(var52, var50, 0, var54);
                        var44.setSample(var52, var50, 1, var55);
                        var44.setSample(var52, var50, 2, var56);
                        int var58 = var38.getRGB(var52, var50);
                        var46.setSample(var52, var50, 0, var58);
                     }
                  }
               }

               c8 var39 = var4[var31];
               u3$n5 var42 = new u3$n5(var12, var8, var39);
               var42.n5(false);
               var42.n5(var31);
               var6.add(var42);
            }
         }

         return var6;
      } catch (IOException var30) {
         throw new IOException("Cannot read image [" + var31 + "]");
      }
   }

   private static ImageReader n5() {
      ImageReader var0 = null;
      Iterator var1 = ImageIO.getImageReadersByFormatName("png");
      if (var1.hasNext()) {
         var0 = (ImageReader)var1.next();
      }

      return var0;
   }
}
