package com.aspose.slides.internal.n8e;

public class h6 {
   public static String n5(int[] var0) {
      if (var0 == null) {
         return null;
      }

      if (var0.length == 0) {
         return "";
      }

      byte var1 = 56;
      int var2 = (var0.length - 1) % 56;
      StringBuilder var3 = new StringBuilder(var0.length - 1);

      for (int var4 = 0; var4 < var0.length - 1; var4++) {
         var3.append((char)var0[var4]);
         var2 = (var2 + var0[var4]) % 56;
      }

      if (var0[var0.length - 1] != var2) {
         throw new IllegalStateException();
      } else {
         return n5(var3.toString());
      }
   }

   private static String n5(String var0) {
      String var1 = "patterns.bin";
      StringBuilder var2 = new StringBuilder(var0.length());

      for (int var3 = 0; var3 < var0.length(); var3++) {
         var2.append((char)(var0.charAt(var3) ^ "patterns.bin".charAt(var3 % "patterns.bin".length())));
      }

      return var2.toString();
   }
}
