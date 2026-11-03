package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NotSupportedException;

class o7g {
   private byte[] n5;
   private byte[] l6;
   private int k5;
   private String u3;
   private int a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k",
      "SHA1/1K",
      "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha1-1k",
      "http://www.w3.org/2000/09/xmldsig#sha256",
      "SHA1",
      "http://www.w3.org/2000/09/xmldsig#sha1"
   );

   public final int n5() {
      return this.k5;
   }

   public final void n5(int var1) {
      if (var1 <= 0) {
         throw new ArgumentOutOfRangeException("value", "The value of iteration count must be a positive number.");
      }

      this.k5 = var1;
   }

   public final int l6() {
      return this.a6;
   }

   public final void l6(int var1) {
      if (var1 <= 0) {
         throw new ArgumentOutOfRangeException("value", "The value of derived key size must be a positive number.");
      }

      this.a6 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (com.aspose.slides.ms.System.d1.a6(var1, com.aspose.slides.ms.System.d1.n5)) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.u3 = var1;
   }

   public final int u3() {
      return this.l6.length;
   }

   public o7g(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("The argument is null or empty.", "password");
      }

      this.n5(1024);
      this.u3 = "SHA1";
      this.a6 = 32;
      this.n5 = com.aspose.slides.internal.l7h.j5.z3().u3(var1);
   }

   public final byte[] a6() {
      byte[] var1 = new byte[16];
      com.aspose.slides.internal.o8m.j9 var2 = new com.aspose.slides.internal.o8m.j9();
      var2.l6(var1);
      return var1;
   }

   public final byte[] u9() {
      byte[] var1 = new byte[16];
      com.aspose.slides.internal.o8m.j9 var2 = new com.aspose.slides.internal.o8m.j9();
      var2.l6(var1);
      return var1;
   }

   public final byte[] n5(com.aspose.slides.internal.z0k.t4 var1, String var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      if (var2 == null) {
         throw new ArgumentNullException("checksumType");
      }

      if (com.aspose.slides.ms.System.d1.a6(var2, com.aspose.slides.ms.System.d1.n5)) {
         throw new ArgumentException("The argument is empty.", "checksumType");
      }

      int var3 = l6(var1, var2);
      byte[] var4 = new byte[var3];
      var1.read(var4, 0, var3);
      var1.seek(0L, 0);
      byte[] var6;
      switch (u9.n5(var2)) {
         case 0:
            com.aspose.slides.internal.o8m.l4 var16 = com.aspose.slides.internal.o8m.i6.a6();

            try {
               var6 = var16.l6(var4);
               break;
            } finally {
               if (var16 != null) {
                  var16.dispose();
               }
            }
         case 1:
         case 2:
            com.aspose.slides.internal.o8m.h6 var15 = new com.aspose.slides.internal.o8m.h6();

            try {
               var6 = var15.l6(var4);
               break;
            } finally {
               if (var15 != null) {
                  var15.dispose();
               }
            }
         default:
            String var5 = "Checksum type '{0}' is not supported.";
            throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5(var5, new Object[]{var2}));
      }

      return var6;
   }

   public final byte[] n5(com.aspose.slides.internal.z0k.t4 var1, byte[] var2, byte[] var3) {
      this.l6(var1, var2, var3);
      byte[] var4 = this.n5(var2);
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.o8m.n1 var6 = new com.aspose.slides.internal.o8m.n1();

         try {
            var6.k5(1);
            var6.u3(5);
            var6.l6(128);
            var6.n5(var4.length * 8);
            var6.k5(var4);
            var6.u3(var3);
            com.aspose.slides.internal.o8m.i1 var7 = var6.t9();

            try {
               com.aspose.slides.internal.o8m.e2 var8 = new com.aspose.slides.internal.o8m.e2(var5, var7, 1);

               try {
                  byte[] var9 = new byte[4096];

                  int var10;
                  while ((var10 = var1.read(var9, 0, var9.length)) > 0) {
                     var8.write(var9, 0, var10);
                  }

                  var8.n5();
                  var5.seek(0L, 0);
                  return var5.toArray();
               } finally {
                  if (var8 != null) {
                     var8.dispose();
                  }
               }
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   public final com.aspose.slides.internal.z0k.t4 n5(byte[] var1, byte[] var2, byte[] var3) {
      this.l6(var1, var2, var3);
      byte[] var4 = this.n5(var2);
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2(var1);

      try {
         com.aspose.slides.internal.o8m.n1 var7 = new com.aspose.slides.internal.o8m.n1();

         try {
            var7.k5(1);
            var7.u3(5);
            var7.l6(128);
            var7.n5(var4.length * 8);
            var7.k5(var4);
            var7.u3(var3);
            com.aspose.slides.internal.o8m.i1 var8 = var7.e2();

            try {
               com.aspose.slides.internal.o8m.e2 var9 = new com.aspose.slides.internal.o8m.e2(var6, var8, 0);

               try {
                  byte[] var10 = new byte[4096];

                  int var11;
                  while ((var11 = var9.read(var10, 0, var10.length)) > 0) {
                     var5.write(var10, 0, var11);
                  }
               } finally {
                  if (var9 != null) {
                     var9.dispose();
                  }
               }
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      var5.seek(0L, 0);
      return var5;
   }

   private void h0() {
      com.aspose.slides.internal.o8m.f2 var1 = null;
      switch (u9.n5(this.k5())) {
         case 3:
            var1 = com.aspose.slides.internal.o8m.i6.a6();
            break;
         case 4:
         case 5:
            var1 = new com.aspose.slides.internal.o8m.h6();
            break;
         default:
            String var2 = "The start key generation name '{0}' is not supported.";
            throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5(var2, new Object[]{this.k5()}));
      }

      this.l6 = var1.l6(this.n5);
      var1.dispose();
   }

   private byte[] n5(byte[] var1) {
      if (this.l6 == null) {
         this.h0();
      }

      com.aspose.slides.internal.o8m.f5 var2 = new com.aspose.slides.internal.o8m.f5(this.l6, var1, this.n5());
      return var2.n5(this.l6());
   }

   private void l6(com.aspose.slides.internal.z0k.t4 var1, byte[] var2, byte[] var3) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      if (var2 == null) {
         throw new ArgumentNullException("salt");
      }

      if (var3 == null) {
         throw new ArgumentNullException("initVector");
      }

      if (var2.length != 16) {
         String var5 = "Salt has invalid length ({0} bytes) for encryption algorithm.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var5, new Object[]{var2.length}));
      }

      if (var3.length != 16) {
         String var4 = "Initialisation vector has invalid length ({0} bytes) for encryption algorithm.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var4, new Object[]{var3.length}));
      }
   }

   private void l6(byte[] var1, byte[] var2, byte[] var3) {
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      if (var2 == null) {
         throw new ArgumentNullException("salt");
      }

      if (var3 == null) {
         throw new ArgumentNullException("initVector");
      }

      if (var2.length != 16) {
         String var5 = "Salt has invalid length ({0} bytes) for decryption algorithm.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var5, new Object[]{var2.length}));
      }

      if (var3.length != 16) {
         String var4 = "Initialisation vector has invalid length ({0} bytes) for decryption algorithm.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var4, new Object[]{var3.length}));
      }
   }

   private static int l6(com.aspose.slides.internal.z0k.t4 var0, String var1) {
      int var2 = (int)var0.getLength();
      switch (u9.n5(var1)) {
         case 0:
         case 1:
         case 2:
            if (var2 > 1024) {
               var2 = 1024;
            }

            return var2;
         default:
            String var3 = "Checksum type '{0}' is not supported.";
            throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5(var3, new Object[]{var1}));
      }
   }
}
