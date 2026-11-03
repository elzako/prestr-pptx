package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class n6 {
   private com.aspose.slides.internal.z0k.a0 n5;
   private boolean l6;
   private char k5;
   private com.aspose.slides.internal.l7h.a5 u3;
   private boolean a6;
   private u4 u9 = new u4();

   public n6(com.aspose.slides.internal.z0k.a0 var1) {
      this.n5 = var1;
      this.k5 = '"';
      u4.n5().n5(this.u9);
   }

   public final void n5(char var1) {
      this.k5 = var1;
   }

   public final void n5(boolean var1) {
      this.l6 = true;
      this.a6 = var1;
      if (var1) {
         if (this.u3 == null) {
            this.u3 = new com.aspose.slides.internal.l7h.a5();
         } else {
            this.u3.n5(0);
         }
      }
   }

   public final void n5() {
      if (this.a6) {
         this.u3.n5(0);
      }

      this.l6 = false;
      this.a6 = false;
   }

   public final String l6() {
      return this.a6 ? this.u3.toString() : com.aspose.slides.ms.System.d1.n5;
   }

   public final void n5(char var1, char var2) {
      if (u4.l6((int)var1) && u4.n5((int)var2)) {
         this.n5.n5(var2);
         this.n5.n5(var1);
      } else {
         throw f4.n5(var1, var2);
      }
   }

   public final void n5(char[] var1, int var2, int var3) {
      if (null == var1) {
         throw new ArgumentNullException("array");
      }

      if (0 > var2) {
         throw new ArgumentOutOfRangeException("offset");
      }

      if (0 > var3) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (var3 > var1.length - var2) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (this.a6) {
         this.u3.n5(var1, var2, var3);
      }

      int var4 = var2 + var3;
      int var5 = var2;
      char var8 = 0;

      while (true) {
         int var7 = var5;

         while (var5 < var4 && (this.u9.n5[var8 = var1[var5]] & 255 & 128) != 0) {
            var5++;
         }

         if (var7 < var5) {
            this.n5.n5(var1, var7, var5 - var7);
         }

         if (var5 == var4) {
            return;
         }

         switch (var8) {
            case '\t':
               this.n5.n5(var8);
               break;
            case '\n':
            case '\r':
               if (this.l6) {
                  this.k5(var8);
               } else {
                  this.n5.n5(var8);
               }
               break;
            case '"':
               if (this.l6 && this.k5 == var8) {
                  this.a6("quot");
               } else {
                  this.n5.n5('"');
               }
               break;
            case '&':
               this.a6("amp");
               break;
            case '\'':
               if (this.l6 && this.k5 == var8) {
                  this.a6("apos");
               } else {
                  this.n5.n5('\'');
               }
               break;
            case '<':
               this.a6("lt");
               break;
            case '>':
               this.a6("gt");
               break;
            default:
               if (u4.n5((int)var8)) {
                  if (var5 + 1 >= var4) {
                     throw new ArgumentException(v3.n5("The second character surrogate pair is not in the input buffer to be written."));
                  }

                  this.n5(var1[++var5], var8);
               } else {
                  if (u4.l6((int)var8)) {
                     throw f4.l6(var8);
                  }

                  this.k5(var8);
               }
         }

         var5++;
      }
   }

   public final void l6(char var1, char var2) {
      if (u4.l6((int)var1) && u4.n5((int)var2)) {
         int var3 = u4.n5(var1, var2);
         if (this.a6) {
            this.u3.n5(var2);
            this.u3.n5(var1);
         }

         this.n5.n5("&#x");
         this.n5.n5(com.aspose.slides.ms.System.a3.n5(var3, "X", com.aspose.slides.internal.x7n.s7.x8()));
         this.n5.n5(';');
      } else {
         throw f4.n5(var1, var2);
      }
   }

   public final void n5(String var1) {
      if (var1 != null) {
         if (this.a6) {
            this.u3.n5(var1);
         }

         int var2 = var1.length();
         int var3 = 0;
         int var4 = 0;
         char var7 = 0;

         while (true) {
            while (var3 < var2 && (this.u9.n5[var7 = var1.charAt(var3)] & 255 & 128) != 0) {
               var3++;
            }

            if (var3 == var2) {
               this.n5.n5(var1);
               return;
            }

            if (this.l6) {
               if (var7 != '\t') {
                  break;
               }

               var3++;
            } else {
               if (var7 != '\t' && var7 != '\n' && var7 != '\r' && var7 != '"' && var7 != '\'') {
                  break;
               }

               var3++;
            }
         }

         char[] var6 = new char[256];

         while (true) {
            if (var4 < var3) {
               this.n5(var1, var4, var3 - var4, var6);
            }

            if (var3 == var2) {
               return;
            }

            switch (var7) {
               case '\t':
                  this.n5.n5(var7);
                  break;
               case '\n':
               case '\r':
                  if (this.l6) {
                     this.k5(var7);
                  } else {
                     this.n5.n5(var7);
                  }
                  break;
               case '"':
                  if (this.l6 && this.k5 == var7) {
                     this.a6("quot");
                     break;
                  }

                  this.n5.n5('"');
                  break;
               case '&':
                  this.a6("amp");
                  break;
               case '\'':
                  if (this.l6 && this.k5 == var7) {
                     this.a6("apos");
                     break;
                  }

                  this.n5.n5('\'');
                  break;
               case '<':
                  this.a6("lt");
                  break;
               case '>':
                  this.a6("gt");
                  break;
               default:
                  if (u4.n5((int)var7)) {
                     if (var3 + 1 >= var2) {
                        throw f4.n5(var1.charAt(var3), var7);
                     }

                     this.n5(var1.charAt(++var3), var7);
                  } else {
                     if (u4.l6((int)var7)) {
                        throw f4.l6(var7);
                     }

                     this.k5(var7);
                  }
            }

            var4 = ++var3;

            while (var3 < var2 && (this.u9.n5[var7 = var1.charAt(var3)] & 255 & 128) != 0) {
               var3++;
            }
         }
      }
   }

   public final void l6(String var1) {
      if (var1 != null) {
         if (this.a6) {
            this.u3.n5(var1);
         }

         int var2 = var1.length();
         int var3 = 0;
         char var4 = 0;

         while (true) {
            while (var3 >= var2 || (this.u9.n5[var4 = var1.charAt(var3)] & 255 & 16) == 0 && var4 >= ' ') {
               if (var3 == var2) {
                  this.n5.n5(var1);
                  return;
               }

               if (u4.n5((int)var4)) {
                  if (var3 + 1 >= var2) {
                     throw new ArgumentException(v3.n5("The surrogate pair is invalid. Missing a low surrogate character."));
                  }

                  char var5 = var1.charAt(var3 + 1);
                  if (!u4.l6((int)var5)) {
                     throw f4.n5(var5, var4);
                  }

                  var3 += 2;
               } else {
                  if (u4.l6((int)var4)) {
                     throw f4.l6(var4);
                  }

                  var3++;
               }
            }

            var3++;
         }
      }
   }

   public final void l6(char[] var1, int var2, int var3) {
      if (null == var1) {
         throw new ArgumentNullException("array");
      }

      if (0 > var3) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (0 > var2) {
         throw new ArgumentOutOfRangeException("offset");
      }

      if (var3 > var1.length - var2) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (this.a6) {
         this.u3.n5(var1, var2, var3);
      }

      this.n5.n5(var1, var2, var3);
   }

   public final void l6(char var1) {
      if (u4.k5((int)var1)) {
         throw new ArgumentException(v3.n5("The surrogate pair is invalid. Missing a low surrogate character."));
      }

      String var2 = com.aspose.slides.ms.System.a3.n5(var1, "X", com.aspose.slides.internal.x7n.s7.x8());
      if (this.a6) {
         this.u3.n5("&#x");
         this.u3.n5(var2);
         this.u3.n5(';');
      }

      this.u3(var2);
   }

   public final void k5(String var1) {
      if (this.a6) {
         this.u3.n5('&');
         this.u3.n5(var1);
         this.u3.n5(';');
      }

      this.a6(var1);
   }

   private void n5(String var1, int var2, int var3, char[] var4) {
      int var5 = var4.length;

      while (var3 > 0) {
         int var6 = var3;
         if (var6 > var5) {
            var6 = var5;
         }

         com.aspose.slides.ms.System.d1.n5(var1, var2, var4, 0, var6);
         this.n5.n5(var4, 0, var6);
         var2 += var6;
         var3 -= var6;
      }
   }

   private void k5(char var1) {
      this.u3(com.aspose.slides.ms.System.a3.n5(var1, "X", com.aspose.slides.internal.x7n.s7.x8()));
   }

   private void u3(String var1) {
      this.n5.n5("&#x");
      this.n5.n5(var1);
      this.n5.n5(';');
   }

   private void a6(String var1) {
      this.n5.n5('&');
      this.n5.n5(var1);
      this.n5.n5(';');
   }
}
