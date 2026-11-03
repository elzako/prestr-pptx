package com.aspose.slides;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Factories for modern disposable images. Callers retain ownership of input
 * streams and must dispose the returned image after its last use.
 * @see IImage
 */
public class Images {
   /** Loads encoded image bytes. */
   public static IImage fromData(byte[] imageData) {
      return new u4i(imageData);
   }

   /** Loads an encoded image file; I/O failures retain their original cause. */
   public static IImage fromFile(String filename) {
      return new u4i(n5(filename));
   }

   /** Reads from the current position without closing the caller's stream. */
   public static IImage fromStream(InputStream stream) {
      return new u4i(n5(stream));
   }

   static IImage[] n5(com.aspose.slides.internal.o9b.l6[] var0) {
      IImage[] var1 = new IImage[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         com.aspose.slides.internal.o9b.l6 var3 = var0[var2];
         var1[var2] = new u4i(var3);
      }

      return var1;
   }

   private static byte[] n5(String var0) {
      try {
         return Files.readAllBytes(Paths.get(var0));
      } catch (IOException var2) {
         throw new RuntimeException("File not found.", var2);
      }
   }

   private static byte[] n5(InputStream var0) {
      byte[] var2 = new byte[4096];
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();

      try {
         int var4;
         while ((var4 = var0.read(var2, 0, 4096)) != -1) {
            var3.write(var2, 0, var4);
         }

         return var3.toByteArray();
      } catch (IOException var14) {
         throw new RuntimeException("File not found.", var14);
      } finally {
         try {
            var3.close();
         } catch (IOException var13) {
         }
      }
   }
}
