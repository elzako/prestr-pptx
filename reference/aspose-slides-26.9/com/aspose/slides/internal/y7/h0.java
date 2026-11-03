package com.aspose.slides.internal.y7;

import java.io.IOException;
import java.io.Reader;

final class h0 {
   private int h0 = 1;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private boolean y4;
   private int e2;
   private final Reader t9;
   private final char[] z1 = new char[32768];
   private int t4;
   private final boolean q0;
   protected StringBuilder n5 = new StringBuilder();
   protected boolean l6;
   static final char[] k5 = new char[]{'r', 'u', 'e'};
   static final char[] u3 = new char[]{'a', 'l', 's', 'e'};
   static final char[] a6 = new char[]{'u', 'l', 'l'};
   // $VF: synthetic field
   static final boolean u9 = !h0.class.desiredAssertionStatus();

   h0(Reader var1) throws a6 {
      this.t9 = var1;
      this.q0 = false;
      this.u3();
   }

   private void u3() throws a6 {
      this.y4 = this.u9();
      this.t2();
   }

   void n5(char var1, char[] var2) throws a6 {
      if (this.k5(var2.length) < var2.length) {
         throw this.n5(var1, var2, 0);
      }

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (this.z1[this.e2++] != var2[var3]) {
            throw this.n5(var1, var2, var3);
         }
      }

      this.k5();
      if (this.l6(this.h0())) {
         throw this.n5(var1, var2, var2.length);
      }
   }

   void n5(char var1) throws a6 {
      this.n5.setLength(0);
      this.n5.append(var1);
      this.l6 = false;
      byte var2;
      if (var1 == '-') {
         var2 = 1;
      } else if (var1 == '0') {
         var2 = 3;
      } else {
         var2 = 2;
      }

      label121:
      while (true) {
         int var3 = this.k5(256);
         if (var3 == 0) {
            break;
         }

         for (int var4 = 0; var4 < var3; var4++) {
            char var5 = this.z1[this.e2];
            if (!this.u3(var5)) {
               break label121;
            }

            byte var6 = -1;
            switch (var2) {
               case 1:
                  if (var5 == '0') {
                     var6 = 3;
                  } else if (var5 > '0' && var5 <= '9') {
                     var6 = 2;
                  }
                  break;
               case 2:
               case 3:
                  if (var5 >= '0' && var5 <= '9' && var2 == 2) {
                     var6 = 2;
                  } else if (var5 == '.') {
                     this.l6 = true;
                     var6 = 4;
                  } else if (var5 == 'e' || var5 == 'E') {
                     this.l6 = true;
                     var6 = 6;
                  }
                  break;
               case 4:
               case 5:
                  if (var5 >= '0' && var5 <= '9') {
                     var6 = 5;
                  } else if ((var5 == 'e' || var5 == 'E') && var2 == 5) {
                     this.l6 = true;
                     var6 = 6;
                  }
                  break;
               case 6:
               case 7:
                  if (var5 != '+' && (var5 != '-' || var2 != 6)) {
                     if (var5 >= '0' && var5 <= '9') {
                        var6 = 8;
                     }
                  } else {
                     var6 = 7;
                  }
                  break;
               case 8:
                  if (var5 >= '0' && var5 <= '9') {
                     var6 = 8;
                  }
                  break;
               default:
                  assert false : "Impossible";
            }

            this.n5.append(var5);
            this.e2++;
            if (var6 == -1) {
               throw this.n5(null, "Malformed number: " + this.n5, true);
            }

            var2 = var6;
         }
      }

      if (var2 != 2 && var2 != 3 && var2 != 5 && var2 != 8) {
         throw this.n5(null, "Malformed number: " + this.n5, true);
      }

      if (var2 == 3 && var1 == '-') {
         this.l6 = true;
      }

      this.k5();
   }

   void n5() throws a6 {
      this.n5.setLength(0);

      while (true) {
         int var1 = this.k5(256);
         if (var1 == 0) {
            throw this.n5(null, "String was not terminated before end of input", true);
         }

         for (int var2 = 0; var2 < var1; var2++) {
            char var3 = this.a6();
            if (var3 == '"') {
               this.n5.append(this.z1, this.e2 - var2 - 1, var2);
               this.k5();
               return;
            }

            if (var3 == '\\' || this.q0 && (var3 & 128) != 0) {
               this.n5.append(this.z1, this.e2 - var2 - 1, var2);
               this.e2--;

               label96:
               while (true) {
                  var1 = this.k5(256);
                  if (var1 == 0) {
                     throw this.n5(null, "String was not terminated before end of input", true);
                  }

                  var2 = this.e2 + var1;

                  while (this.e2 < var2) {
                     var3 = this.a6();
                     if (this.q0 && (var3 & 128) != 0) {
                        this.l6(var3);
                        continue label96;
                     }

                     switch (var3) {
                        case '"':
                           this.k5();
                           return;
                        case '\\':
                           if (var2 - this.e2 < 5) {
                              var1 = this.k5(5);
                              var2 = this.e2 + var1;
                              if (this.z1[this.e2] == 'u' && var1 < 5) {
                                 this.e2 = this.t4;
                                 throw this.n5(null, "EOF encountered in the middle of a string escape", false);
                              }
                           }

                           char var4 = this.z1[this.e2++];
                           switch (var4) {
                              case '"':
                              case '/':
                              case '\\':
                                 this.n5.append(var4);
                                 continue;
                              case 'b':
                                 this.n5.append('\b');
                                 continue;
                              case 'f':
                                 this.n5.append('\f');
                                 continue;
                              case 'n':
                                 this.n5.append('\n');
                                 continue;
                              case 'r':
                                 this.n5.append('\r');
                                 continue;
                              case 't':
                                 this.n5.append('\t');
                                 continue;
                              case 'u':
                                 int var5 = 0;

                                 for (int var6 = 0; var6 < 4; var6++) {
                                    var5 <<= 4;
                                    char var7 = this.z1[this.e2++];
                                    if (var7 >= '0' && var7 <= '9') {
                                       var5 |= var7 - '0';
                                    } else if (var7 >= 'A' && var7 <= 'F') {
                                       var5 |= var7 - 'A' + 10;
                                    } else {
                                       if (var7 < 'a' || var7 > 'f') {
                                          throw this.n5(null, "Expected unicode hex escape character: " + (char)var7 + " (" + var7 + ")", false);
                                       }

                                       var5 |= var7 - 'a' + 10;
                                    }
                                 }

                                 this.n5.append((char)var5);
                                 continue;
                              default:
                                 throw this.n5(null, "Invalid escape: \\" + var4, false);
                           }
                        default:
                           this.n5.append(var3);
                     }
                  }

                  if (this.e2 > this.t4) {
                     this.e2 = this.t4;
                     throw this.n5(null, "EOF encountered in the middle of a string escape", false);
                  }
               }
            }
         }

         this.n5.append(this.z1, this.e2 - var1, var1);
      }
   }

   private void l6(char var1) throws a6 {
      this.k5(5);
      switch (var1 & 240) {
         case 128:
         case 144:
         case 160:
         case 176:
            throw this.n5(null, "Illegal UTF-8 continuation byte: 0x" + Integer.toHexString(var1 & 0xFF), false);
         case 192:
            if ((var1 & 14) == 0) {
               throw this.n5(null, "Illegal UTF-8 byte: 0x" + Integer.toHexString(var1 & 0xFF), false);
            }
         case 208:
            char var4 = (char)((var1 & 31) << 6 | this.z1[this.e2++] & 63);
            this.n5.append(var4);
            this.s7++;
            break;
         case 224:
            char var3 = (char)((var1 & 15) << 12 | (this.z1[this.e2++] & '?') << 6 | this.z1[this.e2++] & 63);
            this.s7 += 2;
            if (var3 >= '\ud800' && var3 <= '\udbff' || var3 >= '\udc00' && var3 <= '\udfff') {
               throw this.n5(null, "Illegal UTF-8 codepoint: 0x" + Integer.toHexString(var3), false);
            }

            this.n5.append(var3);
            break;
         case 240:
            if ((var1 & 15) >= 5) {
               throw this.n5(null, "Illegal UTF-8 byte: 0x" + Integer.toHexString(var1 & 0xFF), false);
            }

            switch ((var1 & 12) >> 2) {
               case 0:
               case 1:
                  this.n5.appendCodePoint((var1 & 7) << 18 | (this.z1[this.e2++] & '?') << 12 | (this.z1[this.e2++] & '?') << 6 | this.z1[this.e2++] & 63);
                  this.s7 += 3;
                  break;
               case 2:
                  int var5 = (var1 & 3) << 24
                     | (this.z1[this.e2++] & '?') << 18
                     | (this.z1[this.e2++] & '?') << 12
                     | (this.z1[this.e2++] & '?') << 6
                     | this.z1[this.e2++] & '?';
                  throw this.n5(null, "Unable to represent codepoint 0x" + Integer.toHexString(var5) + " in a Java string", false);
               case 3:
                  int var2 = (var1 & 1) << 30
                     | (this.z1[this.e2++] & '?') << 24
                     | (this.z1[this.e2++] & '?') << 18
                     | (this.z1[this.e2++] & '?') << 12
                     | (this.z1[this.e2++] & '?') << 6
                     | this.z1[this.e2++] & '?';
                  throw this.n5(null, "Unable to represent codepoint 0x" + Integer.toHexString(var2) + " in a Java string", false);
               default:
                  assert false : "Impossible";
            }
      }

      if (this.e2 > this.t4) {
         throw this.n5(null, "UTF-8 codepoint was truncated", false);
      }
   }

   private char a6() throws a6 {
      char var1 = this.z1[this.e2++];
      if (var1 < ' ') {
         this.k5(var1);
      }

      return var1;
   }

   private void k5(char var1) throws a6 {
      if (var1 == '\n') {
         this.h0++;
         this.c8 = this.e2 + 1 + this.t2;
         this.s7 = 0;
      }

      throw this.n5(null, "Strings may not contain control characters: 0x" + Integer.toString(var1, 16), false);
   }

   private boolean u3(int var1) {
      return var1 >= 48 && var1 <= 57 || var1 == 101 || var1 == 69 || var1 == 46 || var1 == 43 || var1 == 45;
   }

   boolean n5(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 13 || var1 == 9;
   }

   boolean l6(int var1) {
      return var1 >= 65 && var1 <= 90 || var1 >= 97 && var1 <= 122;
   }

   private boolean u9() throws a6 {
      try {
         int var1 = this.t9.read(this.z1, 0, this.z1.length);
         if (var1 <= 0) {
            return true;
         }

         this.t2 = this.t2 + this.t4;
         this.e2 = 0;
         this.t4 = var1;
         return false;
      } catch (IOException var2) {
         throw this.n5(var2, "IOException", true);
      }
   }

   private int h0() {
      return this.y4 ? -1 : this.z1[this.e2];
   }

   int k5(int var1) throws a6 {
      if (this.t4 - var1 >= this.e2) {
         return var1;
      }

      if (this.e2 > 0) {
         this.t2 = this.t2 + this.e2;
         this.t4 = this.t4 - this.e2;
         System.arraycopy(this.z1, this.e2, this.z1, 0, this.t4);
         this.e2 = 0;
      }

      try {
         while (this.z1.length > this.t4) {
            int var2 = this.t9.read(this.z1, this.t4, this.z1.length - this.t4);
            if (var2 <= 0) {
               return this.t4 - this.e2;
            }

            this.t4 += var2;
            if (this.t4 > var1) {
               return this.t4 - this.e2;
            }
         }

         assert false : "Unexpected internal error";
         throw new IOException("Unexpected internal error");
      } catch (IOException var3) {
         throw this.n5(var3, "IOException", true);
      }
   }

   private int c8() throws a6 {
      if (this.y4) {
         return -1;
      }

      char var1 = this.z1[this.e2];
      if (var1 == '\n') {
         this.h0++;
         this.c8 = this.e2 + 1 + this.t2;
         this.s7 = 0;
      }

      this.e2++;
      if (this.e2 >= this.t4) {
         this.y4 = this.u9();
      }

      return var1;
   }

   private void t2() throws a6 {
      int var1;
      do {
         var1 = this.k5(256);

         for (int var2 = 0; var2 < var1; var2++) {
            char var3 = this.z1[this.e2];
            if (!this.n5((int)var3)) {
               this.k5();
               return;
            }

            if (var3 == '\n') {
               this.h0++;
               this.c8 = this.e2 + 1 + this.t2;
               this.s7 = 0;
            }

            this.e2++;
         }
      } while (var1 > 0);

      this.y4 = true;
   }

   int l6() throws a6 {
      int var1 = this.c8();

      while (this.n5(var1)) {
         var1 = this.c8();
      }

      this.x8 = this.e2 + this.t2 - this.c8 - this.s7;
      this.n3 = this.t2 + this.e2;
      byte var2;
      switch (var1) {
         case -1:
            return 0;
         case 34:
            this.n5();
            var2 = 8;
            break;
         case 43:
         case 46:
            throw this.n5(null, "Numbers may not start with '" + (char)var1 + "'", true);
         case 44:
            var2 = 1;
            break;
         case 45:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            this.n5((char)var1);
            var2 = 9;
            break;
         case 58:
            var2 = 2;
            break;
         case 91:
            var2 = 11;
            break;
         case 93:
            var2 = 4;
            break;
         case 102:
            this.n5((char)var1, u3);
            var2 = 7;
            break;
         case 110:
            this.n5((char)var1, a6);
            var2 = 5;
            break;
         case 116:
            this.n5((char)var1, k5);
            var2 = 6;
            break;
         case 123:
            var2 = 10;
            break;
         case 125:
            var2 = 3;
            break;
         default:
            if (this.l6(var1)) {
               throw this.n5((char)var1, null, 0);
            }

            throw this.n5(null, "Unexpected character: " + (char)var1, true);
      }

      return var2;
   }

   void k5() throws a6 {
      if (this.e2 >= this.t4) {
         this.y4 = this.u9();
      }
   }

   a6 n5(char var1, char[] var2, int var3) throws a6 {
      StringBuilder var4 = new StringBuilder(var1 + (var2 == null ? "" : new String(var2, 0, var3)));

      while (this.l6(this.h0()) && var4.length() < 15) {
         var4.append((char)this.c8());
      }

      return this.n5(null, "Unexpected token '" + var4 + "'" + (var2 == null ? "" : ". Did you mean '" + var1 + new String(var2) + "'?"), true);
   }

   a6 n5(Exception var1, String var2, boolean var3) {
      if (var3) {
         return new a6(var1, var2 + " on line " + this.h0 + ", char " + this.x8, this.h0, this.x8, this.n3);
      }

      int var4 = Math.max(1, this.e2 + this.t2 - this.c8 - this.s7);
      return new a6(var1, var2 + " on line " + this.h0 + ", char " + var4, this.h0, var4, this.e2 + this.t2);
   }
}
