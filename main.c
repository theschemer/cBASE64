#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "base64.h"

int
main(void)
{
	unsigned char input[] = "pleasure.";
	unsigned char decode[13];
	char output[13];
	uint len_decode = 0;
	bzero(output, sizeof(output));
	base64_encode(input, sizeof(input) - 1, output);
	len_decode = base64_decode(output, sizeof(output) - 1, decode);

	return 0;
}

