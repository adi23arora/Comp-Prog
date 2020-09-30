class Program1{

static string CompressString(string str)
        {
            if (str == null)
            {
                throw new ArgumentNullException("str");
            }
            if (str.Length < 2)
            {
                return str;
            }
            var chars = str.ToCharArray();
            int insertIndex = 0;
            int i = 0;
            while (i < chars.Length)
            {
                int j = i + 1;
                int counter = 1;
                while (j < chars.Length && chars[j] == chars[i])
                {
                    i++;
                    j++;
                    counter++;
                }
                chars[insertIndex] = chars[i];
                if (counter > 1)
                {
                    var countAsString = counter.ToString();
                    foreach (var theChar in countAsString)
                    {
                        chars[++insertIndex] = theChar;
                    }
                }
                insertIndex++;
                i = j;
            }
            return new string(chars, 0, insertIndex);
        }
    }
