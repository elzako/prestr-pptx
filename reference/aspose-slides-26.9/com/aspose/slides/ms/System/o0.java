package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import java.util.UUID;

public final class o0 extends com.aspose.slides.internal.v6g.h0<o0> implements v0, Comparable<o0> {
   public static final o0 n5 = new o0();
   private int l6;
   private short k5;
   private short u3;
   private byte a6;
   private byte u9;
   private byte h0;
   private byte c8;
   private byte t2;
   private byte s7;
   private byte x8;
   private byte n3;

   public o0(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("b");
      }

      if (var1.length != 16) {
         throw new ArgumentException("Guid array ctor: b length should be 16.");
      }

      this.l6 = var1[3] << 24 | (var1[2] & 255) << 16 | (var1[1] & 255) << 8 | var1[0] & 255;
      this.k5 = (short)(var1[5] << 8 | var1[4] & 0xFF);
      this.u3 = (short)(var1[7] << 8 | var1[6] & 0xFF);
      this.a6 = var1[8];
      this.u9 = var1[9];
      this.h0 = var1[10];
      this.c8 = var1[11];
      this.t2 = var1[12];
      this.s7 = var1[13];
      this.x8 = var1[14];
      this.n3 = var1[15];
   }

   public o0(long var1, int var3, int var4, short var5, short var6, short var7, short var8, short var9, short var10, short var11, short var12) {
      this.l6 = (int)var1;
      this.k5 = (short)var3;
      this.u3 = (short)var4;
      this.a6 = (byte)var5;
      this.u9 = (byte)var6;
      this.h0 = (byte)var7;
      this.c8 = (byte)var8;
      this.t2 = (byte)var9;
      this.s7 = (byte)var10;
      this.x8 = (byte)var11;
      this.n3 = (byte)var12;
   }

   public o0() {
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
      this.s7 = 0;
      this.x8 = 0;
      this.n3 = 0;
   }

   public static o0 n5(UUID var0) {
      if (var0 == null) {
         return new o0();
      }

      long var1 = var0.getMostSignificantBits();
      long var3 = var0.getLeastSignificantBits();
      return new o0(var1, var3);
   }

   public static UUID n5(o0 var0) {
      if (var0 == null) {
         return null;
      }

      long var1 = (long)var0.l6 << 32;
      var1 |= (var0.k5 & 65535L) << 16;
      var1 |= var0.u3 & 65535L;
      long var3 = (var0.a6 & 255L) << 56;
      var3 |= (var0.u9 & 255L) << 48;
      var3 |= (var0.h0 & 255L) << 40;
      var3 |= (var0.c8 & 255L) << 32;
      var3 |= (var0.t2 & 255L) << 24;
      var3 |= (var0.s7 & 255L) << 16;
      var3 |= (var0.x8 & 255L) << 8;
      var3 |= var0.n3 & 255L;
      return new UUID(var1, var3);
   }

   public o0(long var1, long var3) {
      this.l6 = (int)(var1 >> 32);
      this.k5 = (short)(var1 >> 16);
      this.u3 = (short)var1;
      this.a6 = (byte)(var3 >> 56);
      this.u9 = (byte)(var3 >> 48);
      this.h0 = (byte)(var3 >> 40);
      this.c8 = (byte)(var3 >> 32);
      this.t2 = (byte)(var3 >> 24);
      this.s7 = (byte)(var3 >> 16);
      this.x8 = (byte)(var3 >> 8);
      this.n3 = (byte)var3;
   }

   public o0(String var1) {
      if (var1 == null) {
         throw new NullPointerException("g");
      }

      int var2 = 0;
      int[] var3 = new int[]{0};

      try {
         if (var1.indexOf(45, 0) < 0 && var1.length() == 32) {
            var1 = d1.n5(var1, 20, "-");
            var1 = d1.n5(var1, 16, "-");
            var1 = d1.n5(var1, 12, "-");
            var1 = d1.n5(var1, 8, "-");
         }

         if (var1.indexOf(45, 0) < 0) {
            throw new IllegalStateException("Unsupported Guid Format: " + var1);
         }

         String var4 = var1.trim();
         if (var4.charAt(0) == '{') {
            if (var4.length() != 38 || var4.charAt(37) != '}') {
               throw new IllegalStateException("Wrong Guid format sting length: " + var1);
            }

            var2 = 1;
         } else if (var4.charAt(0) == '(') {
            if (var4.length() != 38 || var4.charAt(37) != ')') {
               throw new IllegalStateException("Wrong Guid format sting length: " + var1);
            }

            var2 = 1;
         } else if (var4.length() != 36) {
            throw new IllegalStateException("Wrong Guid format sting length: " + var1);
         }

         if (var4.charAt(8 + var2) == '-' && var4.charAt(13 + var2) == '-' && var4.charAt(18 + var2) == '-' && var4.charAt(23 + var2) == '-') {
            var3[0] = var2;
            this.l6 = n5(var4, var3, 8);
            var3[0]++;
            this.k5 = (short)n5(var4, var3, 4);
            var3[0]++;
            this.u3 = (short)n5(var4, var3, 4);
            var3[0]++;
            int var5 = n5(var4, var3, 4);
            var3[0]++;
            var2 = var3[0];
            long var6 = v3.n5(var4, 16, 8192, var3);
            if (var3[0] - var2 != 12) {
               throw new IllegalStateException("Wrong Guid format sting length: " + var1);
            }

            this.a6 = (byte)(var5 >> 8);
            this.u9 = (byte)var5;
            var5 = (int)(var6 >> 32);
            this.h0 = (byte)(var5 >> 8);
            this.c8 = (byte)var5;
            var5 = (int)var6;
            this.t2 = (byte)(var5 >> 24);
            this.s7 = (byte)(var5 >> 16);
            this.x8 = (byte)(var5 >> 8);
            this.n3 = (byte)var5;
         } else {
            throw new IllegalStateException("Wrong format: missed or misplaced dashes: " + var1);
         }
      } catch (IndexOutOfBoundsException var8) {
         throw new IllegalStateException("Format_GuidUnrecognized");
      }
   }

   public o0(int var1, short var2, short var3, byte var4, byte var5, byte var6, byte var7, byte var8, byte var9, byte var10, byte var11) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
      this.c8 = var7;
      this.t2 = var8;
      this.s7 = var9;
      this.x8 = var10;
      this.n3 = var11;
   }

   private static int n5(String var0, int[] var1, int var2) {
      int var3 = var1[0];
      int var4 = (int)v3.n5(var0, 16, 8192, var1);
      if (var1[0] - var3 != var2) {
         throw new IllegalStateException("Wrong Guid Format: Invalid Char: " + var0);
      } else {
         return var4;
      }
   }

   public byte[] n5() {
      return new byte[]{
         (byte)this.l6,
         (byte)(this.l6 >> 8),
         (byte)(this.l6 >> 16),
         (byte)(this.l6 >> 24),
         (byte)this.k5,
         (byte)(this.k5 >> 8),
         (byte)this.u3,
         (byte)(this.u3 >> 8),
         this.a6,
         this.u9,
         this.h0,
         this.c8,
         this.t2,
         this.s7,
         this.x8,
         this.n3
      };
   }

   @Override
   public String toString() {
      return this.n5("D");
   }

   @Override
   public int hashCode() {
      return this.l6 ^ ((this.k5 & 65535) << 16 | this.u3 & 65535) ^ ((this.h0 & 0xFF) << 24 | this.n3 & 0xFF);
   }

   @Override
   public boolean equals(Object obj) {
      return obj instanceof o0 && n5(this, (o0)obj);
   }

   public static boolean n5(o0 var0, o0 var1) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null || var1 == null) {
         return false;
      } else if (var0.l6 != var1.l6) {
         return false;
      } else if (var0.k5 != var1.k5) {
         return false;
      } else if (var0.u3 != var1.u3) {
         return false;
      } else if (var0.a6 != var1.a6) {
         return false;
      } else if (var0.u9 != var1.u9) {
         return false;
      } else if (var0.h0 != var1.h0) {
         return false;
      } else if (var0.c8 != var1.c8) {
         return false;
      } else if (var0.t2 != var1.t2) {
         return false;
      } else if (var0.s7 != var1.s7) {
         return false;
      } else {
         return var0.x8 != var1.x8 ? false : var0.n3 == var1.n3;
      }
   }

   public static boolean l6(o0 var0, o0 var1) {
      return !n5(var0, var1);
   }

   private int n5(long var1, long var3) {
      return var1 < var3 ? -1 : 1;
   }

   public int l6(o0 var1) {
      if (var1 == null) {
         return 1;
      } else if (var1.l6 != this.l6) {
         return this.n5(this.l6, var1.l6);
      } else if (var1.k5 != this.k5) {
         return this.n5(this.k5, var1.k5);
      } else if (var1.u3 != this.u3) {
         return this.n5(this.u3, var1.u3);
      } else if (var1.a6 != this.a6) {
         return this.n5(this.a6, var1.a6);
      } else if (var1.u9 != this.u9) {
         return this.n5(this.u9, var1.u9);
      } else if (var1.h0 != this.h0) {
         return this.n5(this.h0, var1.h0);
      } else if (var1.c8 != this.c8) {
         return this.n5(this.c8, var1.c8);
      } else if (var1.t2 != this.t2) {
         return this.n5(this.t2, var1.t2);
      } else if (var1.s7 != this.s7) {
         return this.n5(this.s7, var1.s7);
      } else if (var1.x8 != this.x8) {
         return this.n5(this.x8, var1.x8);
      } else {
         return var1.n3 != this.n3 ? this.n5(this.n3, var1.n3) : 0;
      }
   }

   public static o0 l6() {
      return n5(UUID.randomUUID());
   }

   private static char n5(int var0) {
      var0 &= 15;
      return (char)(var0 > 9 ? var0 - 10 + 97 : var0 + 48);
   }

   private static int n5(char[] var0, int var1, int var2, int var3) {
      var0[var1++] = n5(var2 >> 4);
      var0[var1++] = n5(var2);
      var0[var1++] = n5(var3 >> 4);
      var0[var1++] = n5(var3);
      return var1;
   }

   @Override
   public String n5(String var1, h2 var2) {
      return this.n5(var1);
   }

   public String n5(String var1) {
      if (var1 == null || var1.length() == 0) {
         var1 = "D";
      }

      int var2 = 0;
      byte var3 = 38;
      boolean var4 = true;
      if (var1.length() != 1) {
         throw new IllegalStateException("Format_InvalidGuidFormatSpecification");
      }

      char var5 = var1.charAt(0);
      char[] var6;
      if (var5 == 'D' || var5 == 'd') {
         var6 = new char[36];
         var3 = 36;
      } else if (var5 == 'N' || var5 == 'n') {
         var6 = new char[32];
         var3 = 32;
         var4 = false;
      } else if (var5 != 'B' && var5 != 'b') {
         if (var5 != 'P' && var5 != 'p') {
            throw new IllegalStateException("Format_InvalidGuidFormatSpecification");
         }

         var6 = new char[38];
         var6[var2++] = '(';
         var6[37] = ')';
      } else {
         var6 = new char[38];
         var6[var2++] = '{';
         var6[37] = '}';
      }

      var2 = n5(var6, var2, this.l6 >> 24, this.l6 >> 16);
      var2 = n5(var6, var2, this.l6 >> 8, this.l6);
      if (var4) {
         var6[var2++] = '-';
      }

      var2 = n5(var6, var2, this.k5 >> 8, this.k5);
      if (var4) {
         var6[var2++] = '-';
      }

      var2 = n5(var6, var2, this.u3 >> 8, this.u3);
      if (var4) {
         var6[var2++] = '-';
      }

      var2 = n5(var6, var2, this.a6, this.u9);
      if (var4) {
         var6[var2++] = '-';
      }

      var2 = n5(var6, var2, this.h0, this.c8);
      var2 = n5(var6, var2, this.t2, this.s7);
      var2 = n5(var6, var2, this.x8, this.n3);
      return new String(var6, 0, var3);
   }

   public void k5(o0 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.x8 = this.x8;
      var1.n3 = this.n3;
   }

   public o0 k5() {
      o0 var1 = new o0();
      this.k5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o0 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(o0 bridgeArg0) {
      this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(o0 bridgeArg0) {
      return this.l6(bridgeArg0);
   }

}
