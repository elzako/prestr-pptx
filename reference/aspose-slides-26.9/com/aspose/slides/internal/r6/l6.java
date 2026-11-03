package com.aspose.slides.internal.r6;

public class l6 {
   public static long n5(long var0, long var2) {
      long var4 = (var0 | var2) & 4294967295L;
      byte var6 = (byte)((var0 & 4294967295L) >> 24 & 4294967295L);
      byte var7 = (byte)((var2 & 4294967295L) >> 24 & 4294967295L);
      if ((var6 & 255) == 0 && (var7 & 255) == 0) {
         return 0L;
      } else {
         return ((var0 & 4294967295L) != 0L || var2 != 4278190080L) && ((var2 & 4294967295L) != 0L || var0 != 4278190080L) ? var4 : 0L;
      }
   }

   public static long l6(long var0, long var2) {
      byte var4 = (byte)((var0 & 4294967295L) >> 24 & 4294967295L);
      byte var5 = (byte)((var2 & 4294967295L) >> 24 & 4294967295L);
      long var6 = var0 & var2 & 4294967295L;
      if ((var4 & 255) == 0 && (var5 & 255) == 0) {
         return 0L;
      } else if ((var4 & 255) == 255 && (var5 & 255) == 255) {
         return var6;
      } else if (((var0 & 4294967295L) != 0L || var2 != 4294967295L) && ((var2 & 4294967295L) != 0L || var0 != 4294967295L)) {
         byte var8 = com.aspose.slides.internal.v6g.k5.n5((Object)(((byte)((var0 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * 1.0F / (var4 & 0xFF)), 13);
         byte var9 = com.aspose.slides.internal.v6g.k5.n5((Object)(((byte)((var0 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * 1.0F / (var4 & 0xFF)), 13);
         byte var10 = com.aspose.slides.internal.v6g.k5.n5((Object)(((byte)((var0 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * 1.0F / (var4 & 0xFF)), 13);
         var0 = (4278190080L | (var8 & 255) << 16 & 0xFF0000 | (var9 & 255) << 8 & 0xFF00 | (var10 & 255) << 0 & 0xFF) & 4294967295L;
         byte var11 = com.aspose.slides.internal.v6g.k5.n5((Object)(((byte)((var2 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * 1.0F / (var5 & 0xFF)), 13);
         byte var12 = com.aspose.slides.internal.v6g.k5.n5((Object)(((byte)((var2 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * 1.0F / (var5 & 0xFF)), 13);
         byte var13 = com.aspose.slides.internal.v6g.k5.n5((Object)(((byte)((var2 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * 1.0F / (var5 & 0xFF)), 13);
         var2 = (4278190080L | (var11 & 255) << 16 & 0xFF0000 | (var12 & 255) << 8 & 0xFF00 | (var13 & 255) << 0 & 0xFF) & 4294967295L;
         return var0 & var2 & 4294967295L;
      } else {
         return 0L;
      }
   }

   public static long k5(long var0, long var2) {
      return n5(l6(var0, var2));
   }

   public static long u3(long var0, long var2) {
      return k5(k5(var0, k5(var0, var2)), k5(var2, k5(var0, var2)));
   }

   public static long n5(long var0) {
      if (var0 == 4294112499L) {
         return 0L;
      }

      byte var2 = (byte)((var0 & 4294967295L) >> 24 & 4294967295L);
      if ((var2 & 255) == 0) {
         return 4294112499L;
      }

      if ((var2 & 255) == 255) {
         return (~(var0 & 4294967295L) & 4294967295L | 4278190080L) & 4294967295L;
      }

      byte var3 = (byte)((var0 & 4294967295L) >> 16 & 4294967295L);
      byte var4 = (byte)((var0 & 4294967295L) >> 8 & 4294967295L);
      byte var5 = (byte)((var0 & 4294967295L) >> 0 & 4294967295L);
      var3 = com.aspose.slides.internal.v6g.k5.n5((Object)((var3 & 255) * (var2 & 255) / 255.0F), 13);
      var4 = com.aspose.slides.internal.v6g.k5.n5((Object)((var4 & 255) * (var2 & 255) / 255.0F), 13);
      var5 = com.aspose.slides.internal.v6g.k5.n5((Object)((var5 & 255) * (var2 & 255) / 255.0F), 13);
      return ~((var3 & 255) << 16 & 0xFF0000 | (var4 & 255) << 8 & 0xFF00 | (var5 & 255) << 0 & 0xFF) & 4294967295L;
   }

   public static long n5(long var0, long var2, long var4, long var6) {
      long var8 = var2;
      switch ((int)var6) {
         case 0:
            var8 = 4278190080L;
            break;
         case 1:
            var8 = n5(n5(var2, n5(var4, var0)));
            break;
         case 2:
            var8 = l6(var2, n5(n5(var4, var0)));
            break;
         case 3:
            var8 = n5(n5(var4, var0));
            break;
         case 4:
            var8 = l6(var0, n5(n5(var2, var4)));
            break;
         case 5:
            var8 = n5(n5(var2, var4));
            break;
         case 6:
            var8 = n5(n5(var4, n5(u3(var2, var0))));
            break;
         case 7:
            var8 = n5(n5(var4, l6(var2, var0)));
            break;
         case 8:
            var8 = l6(var0, l6(var2, n5(var4)));
            break;
         case 9:
            var8 = n5(n5(var4, u3(var2, var0)));
            break;
         case 10:
            var8 = l6(var2, n5(var4));
            break;
         case 11:
            var8 = n5(n5(var4, l6(var0, n5(var2))));
            break;
         case 12:
            var8 = l6(var0, n5(var4));
            break;
         case 13:
            var8 = n5(n5(l6(n5(var0), var2), var4));
            break;
         case 14:
            var8 = n5(n5(n5(n5(var2, var0)), var4));
            break;
         case 15:
            var8 = n5(var4);
            break;
         case 16:
            var8 = l6(n5(n5(var2, var0)), var4);
            break;
         case 17:
            var8 = n5(n5(var0, var2));
            break;
         case 18:
            var8 = n5(n5(n5(u3(var4, var2)), var0));
            break;
         case 19:
            var8 = n5(n5(l6(var4, var2), var0));
            break;
         case 20:
            var8 = n5(n5(n5(u3(var0, var4)), var2));
            break;
         case 21:
            var8 = n5(n5(l6(var0, var4), var2));
            break;
         case 22:
            var8 = u3(u3(l6(n5(l6(var0, var4)), var2), var0), var4);
            break;
         case 23:
            var8 = n5(u3(l6(u3(var0, var2), u3(var4, var0)), var0));
            break;
         case 24:
            var8 = l6(u3(var2, var4), u3(var4, var0));
            break;
         case 25:
            var8 = n5(u3(l6(n5(l6(var0, var4)), var2), var0));
            break;
         case 26:
            var8 = u3(n5(l6(var4, var0), var2), var4);
            break;
         case 27:
            var8 = n5(u3(l6(u3(var0, var4), var2), var0));
            break;
         case 28:
            var8 = u3(n5(l6(var4, var2), var0), var4);
            break;
         case 29:
            var8 = n5(u3(l6(u3(var2, var4), var0), var2));
            break;
         case 30:
            var8 = u3(n5(var0, var2), var4);
            break;
         case 31:
            var8 = n5(l6(n5(var0, var2), var4));
            break;
         case 32:
            var8 = l6(l6(n5(var0), var4), var2);
            break;
         case 33:
            var8 = n5(n5(u3(var4, var2), var0));
            break;
         case 34:
            var8 = l6(n5(var0), var2);
            break;
         case 35:
            var8 = n5(n5(l6(n5(var2), var4), var0));
            break;
         case 36:
            var8 = l6(u3(var0, var2), u3(var4, var0));
            break;
         case 37:
            var8 = n5(u3(l6(n5(l6(var4, var0)), var2), var4));
            break;
         case 38:
            var8 = u3(n5(l6(var0, var4), var2), var0);
            break;
         case 39:
            var8 = u3(n5(n5(u3(var0, var4)), var2), var0);
            break;
         case 40:
            var8 = l6(u3(var0, var4), var2);
            break;
         case 41:
            var8 = n5(u3(u3(n5(l6(var0, var4), var2), var0), var4));
            break;
         case 42:
            var8 = l6(n5(l6(var0, var4)), var2);
            break;
         case 43:
            var8 = n5(u3(l6(u3(var2, var4), u3(var4, var0)), var0));
            break;
         case 44:
            var8 = u3(l6(n5(var0, var2), var4), var0);
            break;
         case 45:
            var8 = u3(n5(n5(var2), var0), var4);
            break;
         case 46:
            var8 = u3(n5(u3(var4, var2), var0), var4);
            break;
         case 47:
            var8 = n5(l6(n5(n5(var2), var0), var4));
            break;
         case 48:
            var8 = l6(n5(var0), var4);
            break;
         case 49:
            var8 = n5(n5(l6(n5(var4), var2), var0));
            break;
         case 50:
            var8 = u3(n5(n5(var0, var4), var2), var0);
            break;
         case 51:
            var8 = n5(var0);
            break;
         case 52:
            var8 = u3(n5(l6(var0, var2), var4), var0);
            break;
         case 53:
            var8 = u3(n5(n5(u3(var0, var2)), var4), var0);
            break;
         case 54:
            var8 = u3(n5(var4, var2), var0);
            break;
         case 55:
            var8 = n5(l6(n5(var4, var2), var0));
            break;
         case 56:
            var8 = u3(l6(n5(var4, var2), var0), var4);
            break;
         case 57:
            var8 = u3(n5(n5(var2), var4), var0);
            break;
         case 58:
            var8 = u3(n5(u3(var0, var2), var4), var0);
            break;
         case 59:
            var8 = n5(l6(n5(n5(var2), var4), var0));
            break;
         case 60:
            var8 = u3(var0, var4);
            break;
         case 61:
            var8 = u3(n5(n5(n5(var0, var2)), var4), var0);
            break;
         case 62:
            var8 = u3(n5(l6(n5(var0), var2), var4), var0);
            break;
         case 63:
            var8 = n5(l6(var0, var4));
            break;
         case 64:
            var8 = l6(l6(n5(var2), var0), var4);
            break;
         case 65:
            var8 = n5(n5(u3(var0, var4), var2));
            break;
         case 66:
            var8 = l6(u3(var2, var4), u3(var2, var0));
            break;
         case 67:
            var8 = n5(u3(l6(n5(l6(var0, var2)), var4), var0));
            break;
         case 68:
            var8 = l6(n5(var2), var0);
            break;
         case 69:
            var8 = n5(n5(l6(n5(var0), var4), var2));
            break;
         case 70:
            var8 = u3(n5(l6(var2, var4), var0), var2);
            break;
         case 71:
            var8 = n5(u3(l6(u3(var4, var2), var0), var4));
            break;
         case 72:
            var8 = l6(u3(var4, var2), var0);
            break;
         case 73:
            var8 = n5(u3(u3(n5(l6(var2, var4), var0), var2), var4));
            break;
         case 74:
            var8 = u3(l6(n5(var2, var0), var4), var2);
            break;
         case 75:
            var8 = u3(n5(n5(var0), var2), var4);
            break;
         case 76:
            var8 = l6(n5(l6(var4, var2)), var0);
            break;
         case 77:
            var8 = n5(u3(n5(u3(var0, var2), u3(var4, var0)), var0));
            break;
         case 78:
            var8 = u3(n5(u3(var4, var0), var2), var4);
            break;
         case 79:
            var8 = n5(l6(n5(n5(var0), var2), var4));
            break;
         case 80:
            var8 = l6(n5(var2), var4);
            break;
         case 81:
            var8 = n5(n5(l6(n5(var4), var0), var2));
            break;
         case 82:
            var8 = u3(n5(l6(var2, var0), var4), var2);
            break;
         case 83:
            var8 = n5(u3(l6(u3(var0, var2), var4), var0));
            break;
         case 84:
            var8 = n5(n5(n5(n5(var0, var4)), var2));
            break;
         case 85:
            var8 = n5(var2);
            break;
         case 86:
            var8 = u3(n5(var0, var4), var2);
            break;
         case 87:
            var8 = n5(l6(n5(var0, var4), var2));
            break;
         case 88:
            var8 = u3(l6(n5(var4, var0), var2), var4);
            break;
         case 89:
            var8 = u3(n5(n5(var0), var4), var2);
            break;
         case 90:
            var8 = u3(var4, var2);
            break;
         case 91:
            var8 = u3(n5(n5(n5(var2, var0)), var4), var2);
            break;
         case 92:
            var8 = u3(n5(u3(var2, var0), var4), var2);
            break;
         case 93:
            var8 = n5(l6(n5(n5(var0), var4), var2));
            break;
         case 94:
            var8 = u3(n5(l6(n5(var2), var0), var4), var2);
            break;
         case 95:
            var8 = n5(l6(var4, var2));
            break;
         case 96:
            var8 = l6(u3(var0, var2), var4);
            break;
         case 97:
            var8 = n5(u3(u3(n5(l6(var0, var2), var4), var0), var2));
            break;
         case 98:
            var8 = u3(l6(n5(var2, var4), var0), var2);
            break;
         case 99:
            var8 = u3(n5(n5(var4), var2), var0);
            break;
         case 100:
            var8 = u3(l6(n5(var0, var4), var2), var0);
            break;
         case 101:
            var8 = u3(n5(n5(var4), var0), var2);
            break;
         case 102:
            var8 = u3(var0, var2);
            break;
         case 103:
            var8 = u3(n5(n5(n5(var0, var4)), var2), var0);
            break;
         case 104:
            var8 = n5(u3(u3(n5(n5(n5(var0, var2)), var4), var0), var2));
            break;
         case 105:
            var8 = n5(u3(u3(var0, var2), var4));
            break;
         case 106:
            var8 = u3(l6(var0, var4), var2);
            break;
         case 107:
            var8 = n5(u3(u3(l6(n5(var0, var4), var2), var0), var4));
            break;
         case 108:
            var8 = u3(l6(var4, var2), var0);
            break;
         case 109:
            var8 = n5(u3(u3(l6(n5(var2, var4), var0), var2), var4));
            break;
         case 110:
            var8 = u3(l6(n5(n5(var0), var4), var2), var0);
            break;
         case 111:
            var8 = n5(l6(n5(u3(var0, var2)), var4));
            break;
         case 112:
            var8 = l6(n5(l6(var0, var2)), var4);
            break;
         case 113:
            var8 = n5(u3(l6(u3(var2, var4), u3(var2, var0)), var0));
            break;
         case 114:
            var8 = u3(n5(u3(var0, var4), var2), var0);
            break;
         case 115:
            var8 = n5(l6(n5(n5(var4), var2), var0));
            break;
         case 116:
            var8 = u3(n5(u3(var2, var4), var0), var2);
            break;
         case 117:
            var8 = n5(l6(n5(n5(var4), var0), var2));
            break;
         case 118:
            var8 = u3(n5(l6(n5(var0), var4), var2), var0);
            break;
         case 119:
            var8 = n5(l6(var0, var2));
            break;
         case 120:
            var8 = u3(l6(var0, var2), var4);
            break;
         case 121:
            var8 = n5(u3(u3(l6(n5(var0, var2), var4), var0), var2));
            break;
         case 122:
            var8 = u3(l6(n5(n5(var2), var0), var4), var2);
            break;
         case 123:
            var8 = n5(l6(n5(u3(var4, var2)), var0));
            break;
         case 124:
            var8 = u3(l6(n5(n5(var0), var2), var4), var0);
            break;
         case 125:
            var8 = n5(l6(n5(u3(var0, var4)), var2));
            break;
         case 126:
            var8 = n5(u3(var0, var2), u3(var4, var0));
            break;
         case 127:
            var8 = n5(l6(l6(var0, var4), var2));
            break;
         case 128:
            var8 = l6(l6(var0, var4), var2);
            break;
         case 129:
            var8 = n5(n5(u3(var0, var2), u3(var4, var0)));
            break;
         case 130:
            var8 = l6(n5(u3(var0, var4)), var2);
            break;
         case 131:
            var8 = n5(u3(l6(n5(n5(var0), var2), var4), var0));
            break;
         case 132:
            var8 = l6(n5(u3(var4, var2)), var0);
            break;
         case 133:
            var8 = n5(u3(l6(n5(n5(var4), var0), var2), var4));
            break;
         case 134:
            var8 = u3(u3(l6(n5(var0, var2), var4), var0), var2);
            break;
         case 135:
            var8 = n5(u3(l6(var0, var2), var4));
            break;
         case 136:
            var8 = l6(var0, var2);
            break;
         case 137:
            var8 = n5(u3(n5(l6(n5(var0), var4), var2), var0));
            break;
         case 138:
            var8 = l6(n5(n5(var4), var0), var2);
            break;
         case 139:
            var8 = n5(u3(n5(u3(var2, var4), var0), var2));
            break;
         case 140:
            var8 = l6(n5(n5(var4), var2), var0);
            break;
         case 141:
            var8 = n5(u3(n5(u3(var0, var4), var2), var0));
            break;
         case 142:
            var8 = u3(l6(u3(var2, var4), u3(var2, var0)), var0);
            break;
         case 143:
            var8 = n5(l6(n5(l6(var0, var2)), var4));
            break;
         case 144:
            var8 = l6(n5(u3(var0, var2)), var4);
            break;
         case 145:
            var8 = n5(u3(l6(n5(n5(var0), var4), var2), var0));
            break;
         case 146:
            var8 = u3(u3(l6(n5(var4, var2), var0), var4), var2);
            break;
         case 147:
            var8 = n5(u3(l6(var2, var4), var0));
            break;
         case 148:
            var8 = u3(u3(l6(n5(var0, var4), var2), var0), var4);
            break;
         case 149:
            var8 = n5(u3(l6(var0, var4), var2));
            break;
         case 150:
            var8 = u3(u3(var0, var4), var2);
            break;
         case 151:
            var8 = u3(u3(n5(n5(n5(var0, var4)), var2), var0), var4);
            break;
         case 152:
            var8 = n5(u3(n5(n5(n5(var0, var4)), var2), var0));
            break;
         case 153:
            var8 = n5(u3(var0, var2));
            break;
         case 154:
            var8 = u3(l6(n5(var0), var4), var2);
            break;
         case 155:
            var8 = n5(u3(l6(n5(var0, var4), var2), var0));
            break;
         case 156:
            var8 = u3(l6(n5(var2), var4), var0);
            break;
         case 157:
            var8 = n5(u3(l6(n5(var2, var4), var0), var2));
            break;
         case 158:
            var8 = u3(u3(n5(l6(var0, var2), var4), var0), var2);
            break;
         case 159:
            var8 = n5(l6(u3(var0, var2), var4));
            break;
         case 160:
            var8 = l6(var4, var2);
            break;
         case 161:
            var8 = n5(u3(n5(l6(n5(var4), var0), var2), var4));
            break;
         case 162:
            var8 = l6(n5(n5(var0), var4), var2);
            break;
         case 163:
            var8 = n5(u3(n5(u3(var2, var0), var4), var2));
            break;
         case 164:
            var8 = n5(u3(n5(n5(n5(var4, var0)), var2), var4));
            break;
         case 165:
            var8 = n5(u3(var2, var4));
            break;
         case 166:
            var8 = u3(l6(n5(var4), var0), var2);
            break;
         case 167:
            var8 = n5(u3(l6(n5(var4, var0), var2), var4));
            break;
         case 168:
            var8 = l6(n5(var0, var4), var2);
            break;
         case 169:
            var8 = n5(u3(n5(var0, var4), var2));
            break;
         case 170:
            var8 = var2;
            break;
         case 171:
            var8 = n5(n5(n5(var0, var4)), var2);
            break;
         case 172:
            var8 = u3(l6(u3(var0, var2), var4), var0);
            break;
         case 173:
            var8 = n5(u3(n5(l6(var2, var0), var4), var2));
            break;
         case 174:
            var8 = n5(l6(n5(var4), var0), var2);
            break;
         case 175:
            var8 = n5(n5(var4), var2);
            break;
         case 176:
            var8 = l6(n5(n5(var0), var2), var4);
            break;
         case 177:
            var8 = n5(u3(n5(u3(var4, var0), var2), var4));
            break;
         case 178:
            var8 = u3(n5(u3(var0, var2), u3(var4, var0)), var0);
            break;
         case 179:
            var8 = n5(l6(n5(l6(var4, var2)), var0));
            break;
         case 180:
            var8 = u3(l6(n5(var2), var0), var4);
            break;
         case 181:
            var8 = n5(u3(l6(n5(var2, var0), var4), var2));
            break;
         case 182:
            var8 = u3(u3(n5(l6(var4, var2), var0), var4), var2);
            break;
         case 183:
            var8 = n5(l6(u3(var4, var2), var0));
            break;
         case 184:
            var8 = u3(l6(u3(var4, var2), var0), var4);
            break;
         case 185:
            var8 = n5(u3(n5(l6(var2, var4), var0), var2));
            break;
         case 186:
            var8 = n5(l6(n5(var0), var4), var2);
            break;
         case 187:
            var8 = n5(n5(var0), var2);
            break;
         case 188:
            var8 = u3(l6(n5(l6(var0, var2)), var4), var0);
            break;
         case 189:
            var8 = n5(l6(u3(var2, var4), u3(var2, var0)));
            break;
         case 190:
            var8 = n5(u3(var0, var4), var2);
            break;
         case 191:
            var8 = n5(n5(l6(var0, var4)), var2);
            break;
         case 192:
            var8 = l6(var0, var4);
            break;
         case 193:
            var8 = n5(u3(n5(l6(n5(var0), var2), var4), var0));
            break;
         case 194:
            var8 = n5(u3(n5(n5(n5(var0, var2)), var4), var0));
            break;
         case 195:
            var8 = n5(u3(var0, var4));
            break;
         case 196:
            var8 = l6(n5(n5(var2), var4), var0);
            break;
         case 197:
            var8 = n5(u3(n5(u3(var0, var2), var4), var0));
            break;
         case 198:
            var8 = u3(l6(n5(var4), var2), var0);
            break;
         case 199:
            var8 = n5(u3(l6(n5(var4, var2), var0), var4));
            break;
         case 200:
            var8 = l6(n5(var4, var2), var0);
            break;
         case 201:
            var8 = n5(u3(n5(var2, var4), var0));
            break;
         case 202:
            var8 = u3(l6(u3(var2, var0), var4), var2);
            break;
         case 203:
            var8 = n5(u3(n5(l6(var0, var2), var4), var0));
            break;
         case 204:
            var8 = var0;
            break;
         case 205:
            var8 = n5(n5(n5(var4, var2)), var0);
            break;
         case 206:
            var8 = n5(l6(n5(var4), var2), var0);
            break;
         case 207:
            var8 = n5(n5(var4), var0);
            break;
         case 208:
            var8 = l6(n5(n5(var2), var0), var4);
            break;
         case 209:
            var8 = n5(u3(n5(u3(var4, var2), var0), var4));
            break;
         case 210:
            var8 = u3(l6(n5(var0), var2), var4);
            break;
         case 211:
            var8 = n5(u3(l6(n5(var0, var2), var4), var0));
            break;
         case 212:
            var8 = u3(l6(u3(var2, var4), u3(var4, var0)), var0);
            break;
         case 213:
            var8 = n5(l6(n5(l6(var0, var4)), var2));
            break;
         case 214:
            var8 = u3(u3(n5(l6(var0, var4), var2), var0), var4);
            break;
         case 215:
            var8 = n5(l6(u3(var0, var4), var2));
            break;
         case 216:
            var8 = u3(l6(u3(var4, var0), var2), var4);
            break;
         case 217:
            var8 = n5(u3(n5(l6(var0, var4), var2), var0));
            break;
         case 218:
            var8 = u3(l6(n5(l6(var2, var0)), var4), var2);
            break;
         case 219:
            var8 = n5(l6(u3(var0, var2), u3(var4, var0)));
            break;
         case 220:
            var8 = n5(l6(n5(var2), var4), var0);
            break;
         case 221:
            var8 = n5(n5(var2), var0);
            break;
         case 222:
            var8 = n5(u3(var4, var2), var0);
            break;
         case 223:
            var8 = n5(n5(l6(var4, var2)), var0);
            break;
         case 224:
            var8 = l6(n5(var0, var2), var4);
            break;
         case 225:
            var8 = n5(u3(n5(var0, var2), var4));
            break;
         case 226:
            var8 = u3(l6(u3(var2, var4), var0), var2);
            break;
         case 227:
            var8 = n5(u3(n5(l6(var4, var2), var0), var4));
            break;
         case 228:
            var8 = u3(l6(u3(var0, var4), var2), var0);
            break;
         case 229:
            var8 = n5(u3(n5(l6(var4, var0), var2), var4));
            break;
         case 230:
            var8 = u3(l6(n5(l6(var0, var4)), var2), var0);
            break;
         case 231:
            var8 = n5(l6(u3(var2, var4), u3(var4, var0)));
            break;
         case 232:
            var8 = u3(l6(u3(var0, var2), u3(var4, var0)), var0);
            break;
         case 233:
            var8 = n5(u3(u3(l6(n5(l6(var0, var2)), var4), var0), var2));
            break;
         case 234:
            var8 = n5(l6(var0, var4), var2);
            break;
         case 235:
            var8 = n5(n5(u3(var0, var4)), var2);
            break;
         case 236:
            var8 = n5(l6(var4, var2), var0);
            break;
         case 237:
            var8 = n5(n5(u3(var4, var2)), var0);
            break;
         case 238:
            var8 = n5(var0, var2);
            break;
         case 239:
            var8 = n5(n5(n5(var4), var2), var0);
            break;
         case 240:
            var8 = var4;
            break;
         case 241:
            var8 = n5(n5(n5(var0, var2)), var4);
            break;
         case 242:
            var8 = n5(l6(n5(var0), var2), var4);
            break;
         case 243:
            var8 = n5(n5(var0), var4);
            break;
         case 244:
            var8 = n5(l6(n5(var2), var0), var4);
            break;
         case 245:
            var8 = n5(n5(var2), var4);
            break;
         case 246:
            var8 = n5(u3(var0, var2), var4);
            break;
         case 247:
            var8 = n5(n5(l6(var0, var2)), var4);
            break;
         case 248:
            var8 = n5(l6(var0, var2), var4);
            break;
         case 249:
            var8 = n5(n5(u3(var0, var2)), var4);
            break;
         case 250:
            var8 = n5(var4, var2);
            break;
         case 251:
            var8 = n5(n5(n5(var0), var4), var2);
            break;
         case 252:
            var8 = n5(var0, var4);
            break;
         case 253:
            var8 = n5(n5(n5(var2), var0), var4);
            break;
         case 254:
            var8 = n5(n5(var0, var4), var2);
            break;
         case 255:
            var8 = 4294967295L;
      }

      return var8;
   }
}
