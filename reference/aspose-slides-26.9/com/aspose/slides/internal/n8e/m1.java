package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;

public class m1 {
   private static final String[] n5 = new String[]{"JPEG", "GIF", "PNG", "BMP"};
   private static final String[] l6 = new String[]{"image/jpeg", "image/gif", "image/png", "image/bmp"};
   private int k5;
   private int u3;
   private int a6;
   private int u9 = -1;
   private boolean h0;
   private int c8;
   private boolean t2 = true;
   private List<String> s7;
   private boolean x8;
   private int n3;
   private int y4;
   private int e2;
   private com.aspose.slides.internal.z0k.t4 t9 = null;

   public final int n5() {
      return this.c8;
   }

   public m1() {
   }

   public m1(com.aspose.slides.internal.z0k.t4 var1) {
      this.t9 = var1;
   }

   public final boolean l6() {
      if (this.t9 == null) {
         return false;
      }

      this.c8 = -1;
      this.k5 = -1;
      this.u3 = -1;
      this.a6 = -1;
      this.n3 = 1;
      this.y4 = -1;
      this.e2 = -1;
      this.s7 = null;
      this.t9.setPosition(0L);

      try {
         int var1 = this.t9.readByte() & 0xFF;
         int var2 = this.t9.readByte() & 0xFF;
         if (var1 == 71 && var2 == 73) {
            return this.u3();
         } else if (var1 == 137 && var2 == 80) {
            return this.u9();
         } else if (var1 == 255 && var2 == 216) {
            return this.a6();
         } else {
            return var1 == 66 && var2 == 77 ? this.k5() : false;
         }
      } catch (IOException var3) {
         v4.n5(var3);
         return false;
      }
   }

   private boolean k5() {
      byte[] var1 = new byte[44];
      if (this.t9.read(var1, 0, 44) != 44) {
         return false;
      }

      this.k5 = this.l6(var1, 16);
      this.u3 = this.l6(var1, 20);
      if (this.k5 >= 1 && this.u3 >= 1) {
         this.a6 = this.u3(var1, 26);
         if (this.a6 != 1 && this.a6 != 4 && this.a6 != 8 && this.a6 != 16 && this.a6 != 24 && this.a6 != 32) {
            return false;
         }

         int var2 = com.aspose.slides.internal.v6g.k5.u3(this.l6(var1, 36) * 0.0254, 14);
         if (var2 > 0) {
            this.e2 = var2;
         }

         int var3 = com.aspose.slides.internal.v6g.k5.u3(this.l6(var1, 40) * 0.0254, 14);
         if (var3 > 0) {
            this.y4 = var3;
         }

         this.c8 = 3;
         return true;
      } else {
         return false;
      }
   }

   private boolean u3() {
      byte[] var1 = new byte[]{70, 56, 55, 97};
      byte[] var2 = new byte[]{70, 56, 57, 97};
      byte[] var3 = new byte[11];
      if (this.t9.read(var3, 0, 11) != 11) {
         return false;
      }

      if (!this.n5(var3, 0, var2, 0, 4) && !this.n5(var3, 0, var1, 0, 4)) {
         return false;
      }

      this.c8 = 1;
      this.k5 = this.u3(var3, 4);
      this.u3 = this.u3(var3, 6);
      int var4 = var3[8] & 255 & 0xFF;
      this.a6 = (var4 >> 4 & 7) + 1;
      this.h0 = (var4 & 2) != 0;
      if (!this.x8) {
         return true;
      }

      if ((var4 & 128) != 0) {
         int var5 = (1 << (var4 & 7) + 1) * 3;
         this.t9.setPosition(this.t9.getPosition() + var5);
      }

      this.n3 = 0;

      int var12;
      label111:
      do {
         var12 = this.t9.readByte();
         switch (var12) {
            case 33:
               int var13 = this.t9.readByte();
               if (this.t2 && var13 == 254) {
                  com.aspose.slides.internal.l7h.a5 var15 = new com.aspose.slides.internal.l7h.a5();

                  while (true) {
                     int var8 = this.t9.readByte();
                     if (var8 == -1) {
                        return false;
                     }

                     if (var8 > 0) {
                        for (int var9 = 0; var9 < var8; var9++) {
                           int var10 = this.t9.readByte();
                           if (var10 == -1) {
                              return false;
                           }

                           var15.n5((char)var10);
                        }
                     }

                     if (var8 <= 0) {
                        continue label111;
                     }
                  }
               } else {
                  while (true) {
                     int var14 = this.t9.readByte();
                     if (var14 > 0) {
                        this.t9.setPosition(this.t9.getPosition() + var14);
                     } else if (var14 == -1) {
                        return false;
                     }

                     if (var14 <= 0) {
                        continue label111;
                     }
                  }
               }
            case 44:
               if (this.t9.read(var3, 0, 9) != 9) {
                  return false;
               }

               var4 = var3[8] & 255 & 0xFF;
               int var6 = (var4 & 7) + 1;
               if (var6 > this.a6) {
                  this.a6 = var6;
               }

               if ((var4 & 128) != 0) {
                  this.t9.setPosition(this.t9.getPosition() + (1 << var6) * 3);
               }

               this.t9.setPosition(this.t9.getPosition() + 1L);

               int var7;
               do {
                  var7 = this.t9.readByte();
                  if (var7 > 0) {
                     this.t9.setPosition(this.t9.getPosition() + var7);
                  } else if (var7 == -1) {
                     return false;
                  }
               } while (var7 > 0);

               this.n3++;
            case 59:
               break;
            default:
               return false;
         }
      } while (var12 != 59);

      return true;
   }

   private boolean a6() {
      byte[] var1 = new byte[12];

      while (this.t9.read(var1, 0, 4) == 4) {
         int var2 = this.k5(var1, 0);
         int var3 = this.k5(var1, 2);
         if ((var2 & 0xFF00) != 65280) {
            return false;
         }

         if (var2 == 65504) {
            if (var3 < 14 && var3 != 8) {
               return false;
            }

            if (this.t9.read(var1, 0, 12) != 12) {
               return false;
            }

            byte[] var8 = new byte[]{74, 70, 73, 70, 0};
            if (this.n5(var8, 0, var1, 0, 5)) {
               if ((var1[7] & 255) == 1) {
                  this.e2 = this.k5(var1, 8);
                  this.y4 = this.k5(var1, 10);
               } else if ((var1[7] & 255) == 2) {
                  int var9 = this.k5(var1, 8);
                  int var11 = this.k5(var1, 10);
                  this.e2 = com.aspose.slides.internal.v6g.k5.u3(var9 * 2.54F, 13);
                  this.y4 = com.aspose.slides.internal.v6g.k5.u3(var11 * 2.54F, 13);
               }
            }

            this.t9.setPosition(this.t9.getPosition() + (var3 - 14));
         } else if (this.t2 && var3 > 2 && var2 == 65534) {
            var3 -= 2;
            byte[] var4 = new byte[var3];
            if (this.t9.read(var4, 0, var3) != var3) {
               return false;
            }

            com.aspose.slides.internal.l7h.j5 var5 = com.aspose.slides.internal.n2d.x8.n5("iso-8859-1");
            String var6 = var5.l6(var4);
            var6 = com.aspose.slides.ms.System.d1.l6(var6);
            this.n5(var6);
         } else {
            if (var2 >= 65472 && var2 <= 65487 && var2 != 65476 && var2 != 65480) {
               if (this.t9.read(var1, 0, 6) != 6) {
                  return false;
               }

               this.c8 = 0;
               this.a6 = (var1[0] & 255 & 0xFF) * (var1[5] & 255 & 0xFF);
               this.h0 = var2 == 65474 || var2 == 65478 || var2 == 65482 || var2 == 65486;
               this.k5 = this.k5(var1, 3);
               this.u3 = this.k5(var1, 1);
               return true;
            }

            this.t9.setPosition(this.t9.getPosition() + (var3 - 2));
         }
      }

      return false;
   }

   private boolean u9() {
      byte[] var1 = new byte[]{78, 71, 13, 10, 26, 10};
      byte[] var2 = new byte[27];
      if (this.t9.read(var2, 0, 27) != 27) {
         return false;
      }

      if (!this.n5(var2, 0, var1, 0, 6)) {
         return false;
      }

      this.c8 = 2;
      this.k5 = this.n5(var2, 14);
      this.u3 = this.n5(var2, 18);
      this.a6 = var2[22] & 255 & 0xFF;
      int var3 = var2[23] & 255 & 0xFF;
      if (var3 == 2 || var3 == 6) {
         this.a6 *= 3;
      }

      this.h0 = (var2[26] & 255 & 0xFF) != 0;
      return true;
   }

   private void n5(String var1) {
      if (this.s7 == null) {
         this.s7 = new List<>();
      }

      this.s7.addItem(var1);
   }

   private boolean n5(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      while (var5-- > 0) {
         if ((var1[var2++] & 255) != (var3[var4++] & 255)) {
            return false;
         }
      }

      return true;
   }

   private int n5(byte[] var1, int var2) {
      return (var1[var2] & 0xFF & 0xFF) << 24 | (var1[var2 + 1] & 0xFF & 0xFF) << 16 | (var1[var2 + 2] & 0xFF & 0xFF) << 8 | var1[var2 + 3] & 0xFF & 0xFF;
   }

   private int l6(byte[] var1, int var2) {
      return (var1[var2 + 3] & 0xFF & 0xFF) << 24 | (var1[var2 + 2] & 0xFF & 0xFF) << 16 | (var1[var2 + 1] & 0xFF & 0xFF) << 8 | var1[var2] & 0xFF & 0xFF;
   }

   private int k5(byte[] var1, int var2) {
      return (var1[var2] & 0xFF & 0xFF) << 8 | var1[var2 + 1] & 0xFF & 0xFF;
   }

   private int u3(byte[] var1, int var2) {
      return var1[var2] & 0xFF & 0xFF | (var1[var2 + 1] & 0xFF & 0xFF) << 8;
   }
}
